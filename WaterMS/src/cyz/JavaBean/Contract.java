package cyz.JavaBean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Contract implements Serializable{
	private String contractID;
	private String customerID;
	private String contractState;
	private Date contractDate;
	private BigDecimal contractFee;
	private Date contractDatetime;
	private String quality;
	private String contractManger;
	private String contractPhone;
	private String contractUrl;
	private String contractUrlName;
	private String projectID;
	public Contract() {
	}


	public Contract(String contractID, String customerID, String contractState, Date contractDate,
			BigDecimal contractFee, Date contractDatetime, String quality, String contractManger, String contractPhone,
			String contractUrl,String contractUrlName,String projectID) {
		super();
		this.contractID = contractID;
		this.customerID = customerID;
		this.contractState = contractState;
		this.contractDate = contractDate;
		this.contractFee = contractFee;
		this.contractDatetime = contractDatetime;
		this.quality = quality;
		this.contractManger = contractManger;
		this.contractPhone = contractPhone;
		this.contractUrl = contractUrl;
		this.contractUrlName=contractUrlName;
		this.projectID=projectID;
	}

	public String getContractID() {
		return contractID;
	}
	public void setContractID(String contractID) {
		this.contractID = contractID;
	}
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getContractState() {
		return contractState;
	}
	public void setContractState(String contractState) {
		this.contractState = contractState;
	}
	public Date getContractDate() {
		return contractDate;
	}
	public void setContractDate(Date contractDate) {
		this.contractDate = contractDate;
	}
	public BigDecimal getContractFee() {
		return contractFee;
	}
	public void setContractFee(BigDecimal contractFee) {
		this.contractFee = contractFee;
	}
	public Date getContractDatetime() {
		return contractDatetime;
	}
	public void setContractDatetime(Date contractDatetime) {
		this.contractDatetime = contractDatetime;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
	public String getContractManger() {
		return contractManger;
	}
	public void setContractManger(String contractManger) {
		this.contractManger = contractManger;
	}
	public String getContractUrl() {
		return contractUrl;
	}
	public void setContractUrl(String contractUrl) {
		this.contractUrl = contractUrl;
	}
	public String getContractPhone() {
		return contractPhone;
	}
	public void setContractPhone(String contractPhone) {
		this.contractPhone = contractPhone;
	}


	public String getContractUrlName() {
		return contractUrlName;
	}


	public void setContractUrlName(String contractUrlName) {
		this.contractUrlName = contractUrlName;
	}


	public Contract(String projectID) {
		super();
		this.projectID = projectID;
	}
	
}
