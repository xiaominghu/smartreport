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
 * 报表实现类
 * @author LINQI
 *
 */
public class ISMPReportImpl implements ISMPReport{

	/**
	 * 取明细统计表数据
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
			param.addParam(ISMPConstant.SMP_ACHIEVETYPE_ID_ZY);			//自由业绩
			List list0 = (List) dao.executeQuery(SQL, param, new MapListProcessor());
			DetailReportVO vo0 = this.transResultSet(ISMPConstant.SMP_ACHIEVETYPE_NAME_ZY, list0);		//数据转换
			rtList.add(vo0);
			
			param.clearParams();
			param.addParam(dateFrom.toString());
			param.addParam(dateEnd.toString());
			param.addParam(ISMPConstant.SMP_ACHIEVETYPE_ID_DLS);			//代理商业绩
			List list1 = (List) dao.executeQuery(SQL, param, new MapListProcessor());
			DetailReportVO vo1 = this.transResultSet(ISMPConstant.SMP_ACHIEVETYPE_NAME_DLS, list1);		//数据转换
			rtList.add(vo1);
			
			DetailReportVO totalvo = this.getSubtotalRow("第"+i+"周业绩合计("+dateFrom.getDay()+"-"+dateEnd.getDay()+"日)", vo0, vo1);	//生成小计
			rtList.add(totalvo);
			
		}
		List totalList =  this.getTotalRow(rtList);		//生成合计
		rtList.addAll(totalList);
		if(!rtList.isEmpty()){
			return rtList.toArray(new DetailReportVO[0]);
		}
		return null;
	}
	
	/**
	 * 将结果集转成行格式
	 * @param achievetype	业绩类型
	 * @param list
	 * @return
	 */
	private DetailReportVO transResultSet(String achievetype, List<Map> list){
		DetailReportVO vo = new DetailReportVO();
		if(list!=null && list.size()>0){
			vo.setAchievetype(achievetype);		//业绩类型
			UFDouble total = new UFDouble(); 
			for(int i=0;i<list.size();i++){
				Map map = list.get(i);
				UFDouble remit_amount = map.get("remit_amount")!=null ? (UFDouble)map.get("remit_amount") : UFDouble.ZERO_DBL;
				total = total.add(remit_amount);
				vo.setAttributeValue((String)map.get("course_code"), remit_amount);
			}
			vo.setRealitynum(total);	//本月实际额
		}
		return vo;
	}
	
	/**
	 * 生成小计行
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
		totalvo.setAttributeValue("issubtotal", "Y");	//合计行标识
		totalvo.setAchievetype(rowHeading);	//设置行头名称
		return totalvo;
	}
	
	/**
	 * 生成最后的合计行
	 * @param list
	 * @return
	 */
	private List<DetailReportVO> getTotalRow(List<DetailReportVO> list){
		
		
		List<DetailReportVO> rtList = new ArrayList<DetailReportVO>();
		if(list!=null && list.size()>0){
			DetailReportVO totalvo0 = new DetailReportVO();	//自由业绩合计
			totalvo0.setAchievetype(ISMPConstant.SMP_ACHIEVETYPE_NAME_SUTOTAL_ZY);
			
			DetailReportVO totalvo1 = new DetailReportVO();	//代理业绩合计
			totalvo1.setAchievetype(ISMPConstant.SMP_ACHIEVETYPE_NAME_SUBTOTAL_DLS);
			
			DetailReportVO totalvo = new DetailReportVO();	//本月合计
			totalvo.setAchievetype(ISMPConstant.SMP_ACHIEVETYPE_NAME_TOTAL);
			
			String[] fields = totalvo0.getAttributeNames();
			for(DetailReportVO vo:list){
				for(int i=0;i<fields.length;i++){
					if(!fields[i].equals("achievetype")){
						if(vo.getAchievetype().equals(ISMPConstant.SMP_ACHIEVETYPE_NAME_ZY)){	//自由业绩合计
							UFDouble totalValue = ((UFDouble) totalvo0.getAttributeValue(fields[i])).add((UFDouble)vo.getAttributeValue(fields[i]));
							totalvo0.setAttributeValue(fields[i], totalValue);
							
						}else if(vo.getAchievetype().equals(ISMPConstant.SMP_ACHIEVETYPE_NAME_DLS)){	//代理商业绩
							UFDouble totalValue = ((UFDouble) totalvo1.getAttributeValue(fields[i])).add((UFDouble)vo.getAttributeValue(fields[i]));
							totalvo1.setAttributeValue(fields[i], totalValue);
							
						}else{		//本月合计
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
	 * 取课程表数据
	 */
	public CourseVO[] getCourseVO(String str) throws BusinessException {
		List list = (List) new BaseDAO().retrieveByClause(CourseVO.class, str, new String[]{"course_code","course_name"});
		if(list!=null&&list.size()>0){
			return (CourseVO[]) list.toArray(new CourseVO[0]);
		}
		return null;
	}

}
