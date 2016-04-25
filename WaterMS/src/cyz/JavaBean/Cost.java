package cyz.JavaBean;

import java.math.BigDecimal;
import java.util.Date;

public class Cost {
	private String costID;
	private String projectID;;
	private BigDecimal costSum;
	private String costDescribe;
	private String costType;
	private Date costDate;
	private String costCheckType;
	private String costChecker;
	private String costname;
	public Cost(String costID, String projectID, BigDecimal costSum, String costDescribe, String costType, Date costDate,
			String costCheckType, String costChecker, String costname) {
		super();
		this.costID = costID;
		this.projectID = projectID;
		this.costSum = costSum;
		this.costDescribe = costDescribe;
		this.costType = costType;
		this.costDate = costDate;
		this.costCheckType = costCheckType;
		this.costChecker = costChecker;
		this.costname=costname;
	}
	
	
	public String getCostname() {
		return costname;
	}


	public void setCostname(String costname) {
		this.costname = costname;
	}


	public String getCostID() {
		return costID;
	}
	public void setCostID(String costID) {
		this.costID = costID;
	}
	public String getProjectID() {
		return projectID;
	}
	public void setProjectID(String projectID) {
		this.projectID = projectID;
	}
	public BigDecimal getCostSum() {
		return costSum;
	}
	public void setCostSum(BigDecimal costSum) {
		this.costSum = costSum;
	}
	public String getCostDescribe() {
		return costDescribe;
	}
	public void setCostDescribe(String costDescribe) {
		this.costDescribe = costDescribe;
	}
	public String getCostType() {
		return costType;
	}
	public void setCostType(String costType) {
		this.costType = costType;
	}
	public Date getCostDate() {
		return costDate;
	}
	public void setCostDate(Date costDate) {
		this.costDate = costDate;
	}
	public String getCostCheckType() {
		return costCheckType;
	}
	public void setCostCheckType(String costCheckType) {
		this.costCheckType = costCheckType;
	}
	public String getCostChecker() {
		return costChecker;
	}
	public void setCostChecker(String costChecker) {
		this.costChecker = costChecker;
	}
	
	
}
