/***************************************************************\
 *     The skeleton of this class is generated by an automatic *
 * code generator for NC product. It is based on Velocity.     *
\***************************************************************/
package nc.vo.smp.billtest;
	
import nc.vo.pub.*;
import nc.vo.pub.lang.*;
	
/**
 * <b> �ڴ˴���Ҫ��������Ĺ��� </b>
 * <p>
 *     �ڴ˴����Ӵ����������Ϣ
 * </p>
 * ��������:2013-09-06 23:28:05
 * @author Administrator
 * @version NCPrj 1.0
 */
@SuppressWarnings("serial")
public class billtestvo extends SuperVO {
	private String name;
	private String voperatorid;
	private UFDouble vbillstatus;
	private UFDateTime ts;
	private String vapproveid;
	private String vbusicode;
	private String billid;
	private String vapprovenote;
	private String pk_corp;
	private String vbillno;
	private UFDouble dr;
	private String pk_busitype;
	private UFDate dapprovedate;

	public static final String NAME = "name";
	public static final String VOPERATORID = "voperatorid";
	public static final String VBILLSTATUS = "vbillstatus";
	public static final String VAPPROVEID = "vapproveid";
	public static final String VBUSICODE = "vbusicode";
	public static final String BILLID = "billid";
	public static final String VAPPROVENOTE = "vapprovenote";
	public static final String PK_CORP = "pk_corp";
	public static final String VBILLNO = "vbillno";
	public static final String PK_BUSITYPE = "pk_busitype";
	public static final String DAPPROVEDATE = "dapprovedate";
			
	/**
	 * ����name��Getter����.
	 * ��������:2013-09-06 23:28:05
	 * @return String
	 */
	public String getName () {
		return name;
	}   
	/**
	 * ����name��Setter����.
	 * ��������:2013-09-06 23:28:05
	 * @param newName String
	 */
	public void setName (String newName ) {
	 	this.name = newName;
	} 	  
	/**
	 * ����voperatorid��Getter����.
	 * ��������:2013-09-06 23:28:05
	 * @return String
	 */
	public String getVoperatorid () {
		return voperatorid;
	}   
	/**
	 * ����voperatorid��Setter����.
	 * ��������:2013-09-06 23:28:05
	 * @param newVoperatorid String
	 */
	public void setVoperatorid (String newVoperatorid ) {
	 	this.voperatorid = newVoperatorid;
	} 	  
	/**
	 * ����vbillstatus��Getter����.
	 * ��������:2013-09-06 23:28:05
	 * @return UFDouble
	 */
	public UFDouble getVbillstatus () {
		return vbillstatus;
	}   
	/**
	 * ����vbillstatus��Setter����.
	 * ��������:2013-09-06 23:28:05
	 * @param newVbillstatus UFDouble
	 */
	public void setVbillstatus (UFDouble newVbillstatus ) {
	 	this.vbillstatus = newVbillstatus;
	} 	  
	/**
	 * ����ts��Getter����.
	 * ��������:2013-09-06 23:28:05
	 * @return UFDateTime
	 */
	public UFDateTime getTs () {
		return ts;
	}   
	/**
	 * ����ts��Setter����.
	 * ��������:2013-09-06 23:28:05
	 * @param newTs UFDateTime
	 */
	public void setTs (UFDateTime newTs ) {
	 	this.ts = newTs;
	} 	  
	/**
	 * ����vapproveid��Getter����.
	 * ��������:2013-09-06 23:28:05
	 * @return String
	 */
	public String getVapproveid () {
		return vapproveid;
	}   
	/**
	 * ����vapproveid��Setter����.
	 * ��������:2013-09-06 23:28:05
	 * @param newVapproveid String
	 */
	public void setVapproveid (String newVapproveid ) {
	 	this.vapproveid = newVapproveid;
	} 	  
	/**
	 * ����vbusicode��Getter����.
	 * ��������:2013-09-06 23:28:05
	 * @return String
	 */
	public String getVbusicode () {
		return vbusicode;
	}   
	/**
	 * ����vbusicode��Setter����.
	 * ��������:2013-09-06 23:28:05
	 * @param newVbusicode String
	 */
	public void setVbusicode (String newVbusicode ) {
	 	this.vbusicode = newVbusicode;
	} 	  
	/**
	 * ����billid��Getter����.
	 * ��������:2013-09-06 23:28:05
	 * @return String
	 */
	public String getBillid () {
		return billid;
	}   
	/**
	 * ����billid��Setter����.
	 * ��������:2013-09-06 23:28:05
	 * @param newBillid String
	 */
	public void setBillid (String newBillid ) {
	 	this.billid = newBillid;
	} 	  
	/**
	 * ����vapprovenote��Getter����.
	 * ��������:2013-09-06 23:28:05
	 * @return String
	 */
	public String getVapprovenote () {
		return vapprovenote;
	}   
	/**
	 * ����vapprovenote��Setter����.
	 * ��������:2013-09-06 23:28:05
	 * @param newVapprovenote String
	 */
	public void setVapprovenote (String newVapprovenote ) {
	 	this.vapprovenote = newVapprovenote;
	} 	  
	/**
	 * ����pk_corp��Getter����.
	 * ��������:2013-09-06 23:28:05
	 * @return String
	 */
	public String getPk_corp () {
		return pk_corp;
	}   
	/**
	 * ����pk_corp��Setter����.
	 * ��������:2013-09-06 23:28:05
	 * @param newPk_corp String
	 */
	public void setPk_corp (String newPk_corp ) {
	 	this.pk_corp = newPk_corp;
	} 	  
	/**
	 * ����vbillno��Getter����.
	 * ��������:2013-09-06 23:28:05
	 * @return String
	 */
	public String getVbillno () {
		return vbillno;
	}   
	/**
	 * ����vbillno��Setter����.
	 * ��������:2013-09-06 23:28:05
	 * @param newVbillno String
	 */
	public void setVbillno (String newVbillno ) {
	 	this.vbillno = newVbillno;
	} 	  
	/**
	 * ����dr��Getter����.
	 * ��������:2013-09-06 23:28:05
	 * @return UFDouble
	 */
	public UFDouble getDr () {
		return dr;
	}   
	/**
	 * ����dr��Setter����.
	 * ��������:2013-09-06 23:28:05
	 * @param newDr UFDouble
	 */
	public void setDr (UFDouble newDr ) {
	 	this.dr = newDr;
	} 	  
	/**
	 * ����pk_busitype��Getter����.
	 * ��������:2013-09-06 23:28:05
	 * @return String
	 */
	public String getPk_busitype () {
		return pk_busitype;
	}   
	/**
	 * ����pk_busitype��Setter����.
	 * ��������:2013-09-06 23:28:05
	 * @param newPk_busitype String
	 */
	public void setPk_busitype (String newPk_busitype ) {
	 	this.pk_busitype = newPk_busitype;
	} 	  
	/**
	 * ����dapprovedate��Getter����.
	 * ��������:2013-09-06 23:28:05
	 * @return UFDate
	 */
	public UFDate getDapprovedate () {
		return dapprovedate;
	}   
	/**
	 * ����dapprovedate��Setter����.
	 * ��������:2013-09-06 23:28:05
	 * @param newDapprovedate UFDate
	 */
	public void setDapprovedate (UFDate newDapprovedate ) {
	 	this.dapprovedate = newDapprovedate;
	} 	  
 
	/**
	  * <p>ȡ�ø�VO�����ֶ�.
	  * <p>
	  * ��������:2013-09-06 23:28:05
	  * @return java.lang.String
	  */
	public java.lang.String getParentPKFieldName() {
	    return null;
	}   
    
	/**
	  * <p>ȡ�ñ�����.
	  * <p>
	  * ��������:2013-09-06 23:28:05
	  * @return java.lang.String
	  */
	public java.lang.String getPKFieldName() {
	  return "billid";
	}
    
	/**
	 * <p>���ر�����.
	 * <p>
	 * ��������:2013-09-06 23:28:05
	 * @return java.lang.String
	 */
	public java.lang.String getTableName() {
		return "SMP_BILLTEST";
	}    
    
    /**
	  * ����Ĭ�Ϸ�ʽ����������.
	  *
	  * ��������:2013-09-06 23:28:05
	  */
     public billtestvo() {
		super();	
	}    
} 