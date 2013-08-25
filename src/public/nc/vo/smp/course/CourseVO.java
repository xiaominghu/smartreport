/***************************************************************\
 *     The skeleton of this class is generated by an automatic *
 * code generator for NC product. It is based on Velocity.     *
\***************************************************************/
package nc.vo.smp.course;
	
import nc.vo.pub.*;
import nc.vo.pub.lang.*;
	
/**
 * <b> 在此处简要描述此类的功能 </b>
 * <p>
 *     在此处添加此类的描述信息
 * </p>
 * 创建日期:2013-08-25 09:52:57
 * @author 
 * @version NCPrj ??
 */
@SuppressWarnings("serial")
public class CourseVO extends SuperVO {
	private java.lang.String pk_course;
	private java.lang.String course_code;
	private java.lang.String course_name;
	private nc.vo.pub.lang.UFDouble headerquarter_percentage;
	private nc.vo.pub.lang.UFDouble branch_percentage;
	private nc.vo.pub.lang.UFDouble jixiao_percentage;
	private nc.vo.pub.lang.UFDouble shidao_percentage;
	private nc.vo.pub.lang.UFDouble agency_percentage;
	private java.lang.String pk_coursetype;
	private java.lang.String remark;
	private java.lang.String reserved1;
	private java.lang.String reserved2;
	private java.lang.String reserved3;
	private java.lang.String reserved4;
	private java.lang.String reserved5;
	private java.lang.Integer dr;
	private nc.vo.pub.lang.UFDateTime ts;

	public static final String PK_COURSE = "pk_course";
	public static final String COURSE_CODE = "course_code";
	public static final String COURSE_NAME = "course_name";
	public static final String HEADERQUARTER_PERCENTAGE = "headerquarter_percentage";
	public static final String BRANCH_PERCENTAGE = "branch_percentage";
	public static final String JIXIAO_PERCENTAGE = "jixiao_percentage";
	public static final String SHIDAO_PERCENTAGE = "shidao_percentage";
	public static final String AGENCY_PERCENTAGE = "agency_percentage";
	public static final String PK_COURSETYPE = "pk_coursetype";
	public static final String REMARK = "remark";
	public static final String RESERVED1 = "reserved1";
	public static final String RESERVED2 = "reserved2";
	public static final String RESERVED3 = "reserved3";
	public static final String RESERVED4 = "reserved4";
	public static final String RESERVED5 = "reserved5";
			
	/**
	 * 属性pk_course的Getter方法.
	 * 创建日期:2013-08-25 09:52:57
	 * @return java.lang.String
	 */
	public java.lang.String getPk_course () {
		return pk_course;
	}   
	/**
	 * 属性pk_course的Setter方法.
	 * 创建日期:2013-08-25 09:52:57
	 * @param newPk_course java.lang.String
	 */
	public void setPk_course (java.lang.String newPk_course ) {
	 	this.pk_course = newPk_course;
	} 	  
	/**
	 * 属性course_code的Getter方法.
	 * 创建日期:2013-08-25 09:52:57
	 * @return java.lang.String
	 */
	public java.lang.String getCourse_code () {
		return course_code;
	}   
	/**
	 * 属性course_code的Setter方法.
	 * 创建日期:2013-08-25 09:52:57
	 * @param newCourse_code java.lang.String
	 */
	public void setCourse_code (java.lang.String newCourse_code ) {
	 	this.course_code = newCourse_code;
	} 	  
	/**
	 * 属性course_name的Getter方法.
	 * 创建日期:2013-08-25 09:52:57
	 * @return java.lang.String
	 */
	public java.lang.String getCourse_name () {
		return course_name;
	}   
	/**
	 * 属性course_name的Setter方法.
	 * 创建日期:2013-08-25 09:52:57
	 * @param newCourse_name java.lang.String
	 */
	public void setCourse_name (java.lang.String newCourse_name ) {
	 	this.course_name = newCourse_name;
	} 	  
	/**
	 * 属性headerquarter_percentage的Getter方法.
	 * 创建日期:2013-08-25 09:52:57
	 * @return nc.vo.pub.lang.UFDouble
	 */
	public nc.vo.pub.lang.UFDouble getHeaderquarter_percentage () {
		return headerquarter_percentage;
	}   
	/**
	 * 属性headerquarter_percentage的Setter方法.
	 * 创建日期:2013-08-25 09:52:57
	 * @param newHeaderquarter_percentage nc.vo.pub.lang.UFDouble
	 */
	public void setHeaderquarter_percentage (nc.vo.pub.lang.UFDouble newHeaderquarter_percentage ) {
	 	this.headerquarter_percentage = newHeaderquarter_percentage;
	} 	  
	/**
	 * 属性branch_percentage的Getter方法.
	 * 创建日期:2013-08-25 09:52:57
	 * @return nc.vo.pub.lang.UFDouble
	 */
	public nc.vo.pub.lang.UFDouble getBranch_percentage () {
		return branch_percentage;
	}   
	/**
	 * 属性branch_percentage的Setter方法.
	 * 创建日期:2013-08-25 09:52:57
	 * @param newBranch_percentage nc.vo.pub.lang.UFDouble
	 */
	public void setBranch_percentage (nc.vo.pub.lang.UFDouble newBranch_percentage ) {
	 	this.branch_percentage = newBranch_percentage;
	} 	  
	/**
	 * 属性jixiao_percentage的Getter方法.
	 * 创建日期:2013-08-25 09:52:57
	 * @return nc.vo.pub.lang.UFDouble
	 */
	public nc.vo.pub.lang.UFDouble getJixiao_percentage () {
		return jixiao_percentage;
	}   
	/**
	 * 属性jixiao_percentage的Setter方法.
	 * 创建日期:2013-08-25 09:52:57
	 * @param newJixiao_percentage nc.vo.pub.lang.UFDouble
	 */
	public void setJixiao_percentage (nc.vo.pub.lang.UFDouble newJixiao_percentage ) {
	 	this.jixiao_percentage = newJixiao_percentage;
	} 	  
	/**
	 * 属性shidao_percentage的Getter方法.
	 * 创建日期:2013-08-25 09:52:57
	 * @return nc.vo.pub.lang.UFDouble
	 */
	public nc.vo.pub.lang.UFDouble getShidao_percentage () {
		return shidao_percentage;
	}   
	/**
	 * 属性shidao_percentage的Setter方法.
	 * 创建日期:2013-08-25 09:52:57
	 * @param newShidao_percentage nc.vo.pub.lang.UFDouble
	 */
	public void setShidao_percentage (nc.vo.pub.lang.UFDouble newShidao_percentage ) {
	 	this.shidao_percentage = newShidao_percentage;
	} 	  
	/**
	 * 属性agency_percentage的Getter方法.
	 * 创建日期:2013-08-25 09:52:57
	 * @return nc.vo.pub.lang.UFDouble
	 */
	public nc.vo.pub.lang.UFDouble getAgency_percentage () {
		return agency_percentage;
	}   
	/**
	 * 属性agency_percentage的Setter方法.
	 * 创建日期:2013-08-25 09:52:57
	 * @param newAgency_percentage nc.vo.pub.lang.UFDouble
	 */
	public void setAgency_percentage (nc.vo.pub.lang.UFDouble newAgency_percentage ) {
	 	this.agency_percentage = newAgency_percentage;
	} 	  
	/**
	 * 属性pk_coursetype的Getter方法.
	 * 创建日期:2013-08-25 09:52:57
	 * @return java.lang.String
	 */
	public java.lang.String getPk_coursetype () {
		return pk_coursetype;
	}   
	/**
	 * 属性pk_coursetype的Setter方法.
	 * 创建日期:2013-08-25 09:52:57
	 * @param newPk_coursetype java.lang.String
	 */
	public void setPk_coursetype (java.lang.String newPk_coursetype ) {
	 	this.pk_coursetype = newPk_coursetype;
	} 	  
	/**
	 * 属性remark的Getter方法.
	 * 创建日期:2013-08-25 09:52:57
	 * @return java.lang.String
	 */
	public java.lang.String getRemark () {
		return remark;
	}   
	/**
	 * 属性remark的Setter方法.
	 * 创建日期:2013-08-25 09:52:57
	 * @param newRemark java.lang.String
	 */
	public void setRemark (java.lang.String newRemark ) {
	 	this.remark = newRemark;
	} 	  
	/**
	 * 属性reserved1的Getter方法.
	 * 创建日期:2013-08-25 09:52:57
	 * @return java.lang.String
	 */
	public java.lang.String getReserved1 () {
		return reserved1;
	}   
	/**
	 * 属性reserved1的Setter方法.
	 * 创建日期:2013-08-25 09:52:57
	 * @param newReserved1 java.lang.String
	 */
	public void setReserved1 (java.lang.String newReserved1 ) {
	 	this.reserved1 = newReserved1;
	} 	  
	/**
	 * 属性reserved2的Getter方法.
	 * 创建日期:2013-08-25 09:52:57
	 * @return java.lang.String
	 */
	public java.lang.String getReserved2 () {
		return reserved2;
	}   
	/**
	 * 属性reserved2的Setter方法.
	 * 创建日期:2013-08-25 09:52:57
	 * @param newReserved2 java.lang.String
	 */
	public void setReserved2 (java.lang.String newReserved2 ) {
	 	this.reserved2 = newReserved2;
	} 	  
	/**
	 * 属性reserved3的Getter方法.
	 * 创建日期:2013-08-25 09:52:57
	 * @return java.lang.String
	 */
	public java.lang.String getReserved3 () {
		return reserved3;
	}   
	/**
	 * 属性reserved3的Setter方法.
	 * 创建日期:2013-08-25 09:52:57
	 * @param newReserved3 java.lang.String
	 */
	public void setReserved3 (java.lang.String newReserved3 ) {
	 	this.reserved3 = newReserved3;
	} 	  
	/**
	 * 属性reserved4的Getter方法.
	 * 创建日期:2013-08-25 09:52:57
	 * @return java.lang.String
	 */
	public java.lang.String getReserved4 () {
		return reserved4;
	}   
	/**
	 * 属性reserved4的Setter方法.
	 * 创建日期:2013-08-25 09:52:57
	 * @param newReserved4 java.lang.String
	 */
	public void setReserved4 (java.lang.String newReserved4 ) {
	 	this.reserved4 = newReserved4;
	} 	  
	/**
	 * 属性reserved5的Getter方法.
	 * 创建日期:2013-08-25 09:52:57
	 * @return java.lang.String
	 */
	public java.lang.String getReserved5 () {
		return reserved5;
	}   
	/**
	 * 属性reserved5的Setter方法.
	 * 创建日期:2013-08-25 09:52:57
	 * @param newReserved5 java.lang.String
	 */
	public void setReserved5 (java.lang.String newReserved5 ) {
	 	this.reserved5 = newReserved5;
	} 	  
	/**
	 * 属性dr的Getter方法.
	 * 创建日期:2013-08-25 09:52:57
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getDr () {
		return dr;
	}   
	/**
	 * 属性dr的Setter方法.
	 * 创建日期:2013-08-25 09:52:57
	 * @param newDr java.lang.Integer
	 */
	public void setDr (java.lang.Integer newDr ) {
	 	this.dr = newDr;
	} 	  
	/**
	 * 属性ts的Getter方法.
	 * 创建日期:2013-08-25 09:52:57
	 * @return nc.vo.pub.lang.UFDateTime
	 */
	public nc.vo.pub.lang.UFDateTime getTs () {
		return ts;
	}   
	/**
	 * 属性ts的Setter方法.
	 * 创建日期:2013-08-25 09:52:57
	 * @param newTs nc.vo.pub.lang.UFDateTime
	 */
	public void setTs (nc.vo.pub.lang.UFDateTime newTs ) {
	 	this.ts = newTs;
	} 	  
 
	/**
	  * <p>取得父VO主键字段.
	  * <p>
	  * 创建日期:2013-08-25 09:52:57
	  * @return java.lang.String
	  */
	public java.lang.String getParentPKFieldName() {
	    return null;
	}   
    
	/**
	  * <p>取得表主键.
	  * <p>
	  * 创建日期:2013-08-25 09:52:57
	  * @return java.lang.String
	  */
	public java.lang.String getPKFieldName() {
	  return "pk_course";
	}
    
	/**
	 * <p>返回表名称.
	 * <p>
	 * 创建日期:2013-08-25 09:52:57
	 * @return java.lang.String
	 */
	public java.lang.String getTableName() {
		return "smp_course";
	}    
    
    /**
	  * 按照默认方式创建构造子.
	  *
	  * 创建日期:2013-08-25 09:52:57
	  */
     public CourseVO() {
		super();	
	}    
} 
