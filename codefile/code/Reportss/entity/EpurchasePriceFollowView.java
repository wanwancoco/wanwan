package ins.accfee.report.schema.model;

// Generated by Hibernate Tools 3.2.5 (sinosoft version), Don't modify!
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * POJO Class 采购价格跟踪
 * Tue Apr 26 17:13:18 CST 2016 
 * org.a
 */
@Entity
@Table(name = "EPurchasePriceFollow")
public class EPurchasePriceFollowView implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private Long  reportdataId ;
	private Long  dataId       ;
	private String  str1         ;
	private String  str2         ;
	private String  str3         ;
	private String  str4         ;
	private String  str5         ;
	private String  str6         ;
	private String  str7         ;
	private String  str8         ;
	private String  str9         ;
	private String  hahawolegchacha;
	private String userByWaterId;
	
	public void setUserByWaterId(String userByWaterId){
		this.userByWaterId = userByWaterId;
	}
	
	public String getUserByWaterId(){
		return this.userByWaterId;
	}
	