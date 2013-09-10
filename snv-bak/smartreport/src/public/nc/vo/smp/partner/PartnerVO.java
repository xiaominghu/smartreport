/***************************************************************\
 *     The skeleton of this class is generated by an automatic *
 * code generator for NC product. It is based on Velocity.     *
\***************************************************************/
package nc.vo.smp.partner;
	
import nc.vo.pub.*;
import nc.vo.pub.lang.*;
	
/**
 * <b> �ڴ˴���Ҫ��������Ĺ��� </b>
 * <p>
 *     �ڴ˴����Ӵ����������Ϣ
 * </p>
 * ��������:2013-09-09 22:06:22
 * @author Administrator
 * @version NCPrj 1.0
 */
@SuppressWarnings("serial")
public class PartnerVO extends SuperVO {
	private String pk_corp;
	private String pk_team;
	private String pk_partner;
	private Integer dr;
	private String voperatorid;
	private String ts;
	private String partner_name;
	public static final String PK_TEAM = "pk_team";
	public static final String PK_CORP = "pk_corp";
	public static final String PK_PARTNER = "pk_partner";
	public static final String VOPERATORID = "voperatorid";
	public static final String PARTNER_NAME = "partner_name";
			
	/**
	 * ����pk_corp��Getter����.
	 * ��������:2013-09-09 22:06:22
	 * @return String
	 */
	public String getPk_corp () {
		return pk_corp;
	}   
	/**
	 * ����pk_corp��Setter����.
	 * ��������:2013-09-09 22:06:22
	 * @param newPk_corp String
	 */
	public void setPk_corp (String newPk_corp ) {
	 	this.pk_corp = newPk_corp;
	} 	  
	public String getPk_team () {
		return pk_team;
	}   
	/**
	 * ����pk_corp��Setter����.
	 * ��������:2013-09-09 22:06:22
	 * @param newPk_corp String
	 */
	public void setPk_team (String newPk_team ) {
	 	this.pk_team = newPk_team;
	} 	  
	/**
	 * ����pk_partner��Getter����.
	 * ��������:2013-09-09 22:06:22
	 * @return String
	 */
	public String getPk_partner () {
		return pk_partner;
	}   
	/**
	 * ����pk_partner��Setter����.
	 * ��������:2013-09-09 22:06:22
	 * @param newPk_partner String
	 */
	public void setPk_partner (String newPk_partner ) {
	 	this.pk_partner = newPk_partner;
	} 	  
	/**
	 * ����dr��Getter����.
	 * ��������:2013-09-09 22:06:22
	 * @return Integer
	 */
	public Integer getDr () {
		return dr;
	}   
	/**
	 * ����dr��Setter����.
	 * ��������:2013-09-09 22:06:22
	 * @param newDr Integer
	 */
	public void setDr (Integer newDr ) {
	 	this.dr = newDr;
	} 	  
	/**
	 * ����voperatorid��Getter����.
	 * ��������:2013-09-09 22:06:22
	 * @return String
	 */
	public String getVoperatorid () {
		return voperatorid;
	}   
	/**
	 * ����voperatorid��Setter����.
	 * ��������:2013-09-09 22:06:22
	 * @param newVoperatorid String
	 */
	public void setVoperatorid (String newVoperatorid ) {
	 	this.voperatorid = newVoperatorid;
	} 	  
	/**
	 * ����ts��Getter����.
	 * ��������:2013-09-09 22:06:22
	 * @return String
	 */
	public String getTs () {
		return ts;
	}   
	/**
	 * ����ts��Setter����.
	 * ��������:2013-09-09 22:06:22
	 * @param newTs String
	 */
	public void setTs (String newTs ) {
	 	this.ts = newTs;
	} 	  
	/**
	 * ����partner_name��Getter����.
	 * ��������:2013-09-09 22:06:22
	 * @return String
	 */
	public String getPartner_name () {
		return partner_name;
	}   
	/**
	 * ����partner_name��Setter����.
	 * ��������:2013-09-09 22:06:22
	 * @param newPartner_name String
	 */
	public void setPartner_name (String newPartner_name ) {
	 	this.partner_name = newPartner_name;
	} 	  
 
	/**
	  * <p>ȡ�ø�VO�����ֶ�.
	  * <p>
	  * ��������:2013-09-09 22:06:22
	  * @return java.lang.String
	  */
	public java.lang.String getParentPKFieldName() {
	    return null;
	}   
    
	/**
	  * <p>ȡ�ñ�����.
	  * <p>
	  * ��������:2013-09-09 22:06:22
	  * @return java.lang.String
	  */
	public java.lang.String getPKFieldName() {
	  return "pk_partner";
	}
    
	/**
	 * <p>���ر�����.
	 * <p>
	 * ��������:2013-09-09 22:06:22
	 * @return java.lang.String
	 */
	public java.lang.String getTableName() {
		return "SMP_PARTNER";
	}    
    
    /**
	  * ����Ĭ�Ϸ�ʽ����������.
	  *
	  * ��������:2013-09-09 22:06:22
	  */
     public PartnerVO() {
		super();	
	}    
} 