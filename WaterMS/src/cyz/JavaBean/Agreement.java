package cyz.JavaBean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Agreement implements Serializable{
	private String agreementID;
	private String projectID;
	private String agreementMan;
	private String agreeState;
	private String agreePhone;
	private String aquality;
	private Date agreeDate;
	private BigDecimal agreeFee;
	private BigDecimal agreeMgFee;
	private BigDecimal agreeQtFee;
	private BigDecimal agreeSfFee;
	private BigDecimal agreeDpFee;
	private String agreeUrl;
	private String agreeUrlName;
	public Agreement() {
		// TODO Auto-generated constructor stub
	}
	public Agreement(String agreementID, String projectID, String agreementMan, String agreeState, String agreePhone,
			String aquality, Date agreeDate, BigDecimal agreeFee, BigDecimal agreeMgFee, BigDecimal agreeQtFee,
			BigDecimal agreeSfFee, BigDecimal agreeDpFee, String agreeUrl, String agreeUrlName) {
		super();
		this.agreementID = agreementID;
		this.projectID = projectID;
		this.agreementMan = agreementMan;
		this.agreeState = agreeState;
		this.agreePhone = agreePhone;
		this.aquality = aquality;
		this.agreeDate = agreeDate;
		this.agreeFee = agreeFee;
		this.agreeMgFee = agreeMgFee;
		this.agreeQtFee = agreeQtFee;
		this.agreeSfFee = agreeSfFee;
		this.agreeDpFee = agreeDpFee;
		this.agreeUrl = agreeUrl;
		this.agreeUrlName = agreeUrlName;
	}


	public String getAgreementID() {
		return agreementID;
	}

	public void setAgreementID(String agreementID) {
		this.agreementID = agreementID;
	}

	public String getProjectID() {
		return projectID;
	}

	public void setProjectID(String projectID) {
		this.projectID = projectID;
	}

	public String getAgreementMan() {
		return agreementMan;
	}

	public void setAgreementMan(String agreementMan) {
		this.agreementMan = agreementMan;
	}

	public String getAgreePhone() {
		return agreePhone;
	}

	public void setAgreePhone(String agreePhone) {
		this.agreePhone = agreePhone;
	}

	public String getAquality() {
		return aquality;
	}

	public void setAquality(String aquality) {
		this.aquality = aquality;
	}

	public Date getAgreeDate() {
		return agreeDate;
	}

	public void setAgreeDate(Date agreeDate) {
		this.agreeDate = agreeDate;
	}

	public BigDecimal getAgreeFee() {
		return agreeFee;
	}

	public void setAgreeFee(BigDecimal agreeFee) {
		this.agreeFee = agreeFee;
	}

	public String getAgreeState() {
		return agreeState;
	}

	public void setAgreeState(String agreeState) {
		this.agreeState = agreeState;
	}

	public String getAgreeUrl() {
		return agreeUrl;
	}

	public void setAgreeUrl(String agreeUrl) {
		this.agreeUrl = agreeUrl;
	}

	public BigDecimal getAgreeMgFee() {
		return agreeMgFee;
	}

	public void setAgreeMgFee(BigDecimal agreeMgFee) {
		this.agreeMgFee = agreeMgFee;
	}

	public BigDecimal getAgreeQtFee() {
		return agreeQtFee;
	}

	public void setAgreeQtFee(BigDecimal agreeQtFee) {
		this.agreeQtFee = agreeQtFee;
	}

	public BigDecimal getAgreeSfFee() {
		return agreeSfFee;
	}

	public void setAgreeSfFee(BigDecimal agreeSfFee) {
		this.agreeSfFee = agreeSfFee;
	}

	public BigDecimal getAgreeDpFee() {
		return agreeDpFee;
	}

	public void setAgreeDpFee(BigDecimal agreeDpFee) {
		this.agreeDpFee = agreeDpFee;
	}
	public String getAgreeUrlName() {
		return agreeUrlName;
	}
	public void setAgreeUrlName(String agreeUrlName) {
		this.agreeUrlName = agreeUrlName;
	}
	
	
	
}
