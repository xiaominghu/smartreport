package nc.impl.smp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import nc.bs.dao.BaseDAO;
import nc.itf.smp.ISMPConstant;
import nc.itf.smp.ISMPReport;
import nc.jdbc.framework.SQLParameter;
import nc.jdbc.framework.processor.MapListProcessor;
import nc.pub.smp.util.SMPUtil;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDouble;
import nc.vo.smp.course.CourseVO;
import nc.vo.smp.report.detail.DetailQueryVO;
import nc.vo.smp.report.detail.DetailReportVO;

/**
 * ����ʵ����
 * @author LINQI
 *
 */
public class ISMPReportImpl implements ISMPReport{

	/**
	 * ȡ��ϸͳ�Ʊ�����
	 */
	public DetailReportVO[] getDetailData(DetailQueryVO queryVO) throws BusinessException {
		
		List<DetailReportVO> rtList = new ArrayList<DetailReportVO>();
		
		String month = queryVO.getMonth();
		UFDate date = new UFDate(month+"-"+"01");
		int weeks = SMPUtil.getWeeksOfMonth(date.toDate());
		
		BaseDAO dao = new BaseDAO();
		String SQL = getAchievementSQL();
		SQLParameter param = new SQLParameter();
		for(int i=1;i<=weeks;i++){
			Date date1 = SMPUtil.getFirsDayOfWeek(date.toDate(), i);
			Date date2 = SMPUtil.getLastDayOfWeek(date.toDate(), i);
			UFDate dateFrom = new UFDate(date1);
			UFDate dateEnd = new UFDate(date2);
			
			param.clearParams();
			param.addParam(dateFrom.toString());
			param.addParam(dateEnd.toString());
			param.addParam(ISMPConstant.SMP_ACHIEVETYPE_ID_ZY);			//����ҵ��
			List list0 = (List) dao.executeQuery(SQL, param, new MapListProcessor());
			DetailReportVO vo0 = this.transResultSet(ISMPConstant.SMP_ACHIEVETYPE_NAME_ZY, list0);		//����ת��
			rtList.add(vo0);
			
			param.clearParams();
			param.addParam(dateFrom.toString());
			param.addParam(dateEnd.toString());
			param.addParam(ISMPConstant.SMP_ACHIEVETYPE_ID_DLS);			//������ҵ��
			List list1 = (List) dao.executeQuery(SQL, param, new MapListProcessor());
			DetailReportVO vo1 = this.transResultSet(ISMPConstant.SMP_ACHIEVETYPE_NAME_DLS, list1);		//����ת��
			rtList.add(vo1);
			
			DetailReportVO totalvo = this.getSubtotalRow("��"+i+"��ҵ���ϼ�("+dateFrom.getDay()+"-"+dateEnd.getDay()+"��)", vo0, vo1);	//����С��
			rtList.add(totalvo);
			
		}
		List totalList =  this.getTotalRow(rtList);		//���ɺϼ�
		rtList.addAll(totalList);
		if(!rtList.isEmpty()){
			return rtList.toArray(new DetailReportVO[0]);
		}
		return null;
	}
	
	/**
	 * �������ת���и�ʽ
	 * @param achievetype	ҵ������
	 * @param list
	 * @return
	 */
	private DetailReportVO transResultSet(String achievetype, List<Map> list){
		DetailReportVO vo = new DetailReportVO();
		if(list!=null && list.size()>0){
			vo.setAchievetype(achievetype);		//ҵ������
			UFDouble total = new UFDouble(); 
			for(int i=0;i<list.size();i++){
				Map map = list.get(i);
				UFDouble remit_amount = map.get("remit_amount")!=null ? (UFDouble)map.get("remit_amount") : UFDouble.ZERO_DBL;
				total = total.add(remit_amount);
				vo.setAttributeValue((String)map.get("course_code"), remit_amount);
			}
			vo.setRealitynum(total);	//����ʵ�ʶ�
		}
		return vo;
	}
	
	/**
	 * ����С����
	 * @param rowHeading
	 * @param list0
	 * @param list1
	 * @return
	 */
	private DetailReportVO getSubtotalRow(String rowHeading,DetailReportVO vo0,DetailReportVO vo1){
		
		DetailReportVO totalvo = (DetailReportVO) vo0.clone();
		String[] fields = vo1.getAttributeNames();
		for(int i=0;i<fields.length;i++){
			if(!fields[i].equals("achievetype")){
				UFDouble totalValue = ((UFDouble) totalvo.getAttributeValue(fields[i])).add((UFDouble)vo1.getAttributeValue(fields[i]));
				totalvo.setAttributeValue(fields[i], totalValue);
			}
		}
		totalvo.setAttributeValue("issubtotal", "Y");	//�ϼ��б�ʶ
		totalvo.setAchievetype(rowHeading);	//������ͷ����
		return totalvo;
	}
	
	/**
	 * �������ĺϼ���
	 * @param list
	 * @return
	 */
	private List<DetailReportVO> getTotalRow(List<DetailReportVO> list){
		
		
		List<DetailReportVO> rtList = new ArrayList<DetailReportVO>();
		if(list!=null && list.size()>0){
			DetailReportVO totalvo0 = new DetailReportVO();	//����ҵ���ϼ�
			totalvo0.setAchievetype(ISMPConstant.SMP_ACHIEVETYPE_NAME_SUTOTAL_ZY);
			
			DetailReportVO totalvo1 = new DetailReportVO();	//����ҵ���ϼ�
			totalvo1.setAchievetype(ISMPConstant.SMP_ACHIEVETYPE_NAME_SUBTOTAL_DLS);
			
			DetailReportVO totalvo = new DetailReportVO();	//���ºϼ�
			totalvo.setAchievetype(ISMPConstant.SMP_ACHIEVETYPE_NAME_TOTAL);
			
			String[] fields = totalvo0.getAttributeNames();
			for(DetailReportVO vo:list){
				for(int i=0;i<fields.length;i++){
					if(!fields[i].equals("achievetype")){
						if(vo.getAchievetype().equals(ISMPConstant.SMP_ACHIEVETYPE_NAME_ZY)){	//����ҵ���ϼ�
							UFDouble totalValue = ((UFDouble) totalvo0.getAttributeValue(fields[i])).add((UFDouble)vo.getAttributeValue(fields[i]));
							totalvo0.setAttributeValue(fields[i], totalValue);
							
						}else if(vo.getAchievetype().equals(ISMPConstant.SMP_ACHIEVETYPE_NAME_DLS)){	//������ҵ��
							UFDouble totalValue = ((UFDouble) totalvo1.getAttributeValue(fields[i])).add((UFDouble)vo.getAttributeValue(fields[i]));
							totalvo1.setAttributeValue(fields[i], totalValue);
							
						}else{		//���ºϼ�
							UFDouble totalValue = ((UFDouble) totalvo.getAttributeValue(fields[i])).add((UFDouble)vo.getAttributeValue(fields[i]));
							totalvo.setAttributeValue(fields[i], totalValue);
						}
					}
				}
			}
			rtList.add(totalvo0);
			rtList.add(totalvo1);
			rtList.add(totalvo);
		}
		
		
		return rtList;
	}
	
	private String getAchievementSQL(){
		StringBuffer str = new StringBuffer();
		str.append("select b.pk_course,b.course_code,b.course_name,sum(nvl(a.remit_amount,0.00)) remit_amount ")
		   .append("from smp_course b left join  smp_performance a  on ( ")
		   .append("b.pk_course=a.pk_course ")
		   .append("and a.performance_date>=? ")
		   .append("and a.performance_date<=? ")
		   .append("and achievetype=? ")
		   .append(") ")
		   .append("where nvl(a.dr,0)=0 and nvl(b.dr,0)=0 ")
		   .append("group by a.achievetype,b.pk_course,b.course_code,b.course_name ")
		   .append("order by a.achievetype,b.pk_course ")
		   .append(" ");
		return str.toString();
	}

	/**
	 * ȡ�γ̱�����
	 */
	public CourseVO[] getCourseVO(String str) throws BusinessException {
		List list = (List) new BaseDAO().retrieveByClause(CourseVO.class, str, new String[]{"course_code","course_name"});
		if(list!=null&&list.size()>0){
			return (CourseVO[]) list.toArray(new CourseVO[0]);
		}
		return null;
	}

}