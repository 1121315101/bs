package cyz.JavaBean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Project implements Serializable{
	private String projectID;
	private String projectName;
	private String customerID;
	private Date buildProjectDate;
	private BigDecimal projectCost;
	private BigDecimal esTotalRevenue;
	private Date startDate;
	private Date endDate;
	private String projectDescription;
	private String projectRiskDes;
	private Integer estprojectImpDays;
	private String projectTypeID;
	private String projectStateID;
	private String projectImpID;
	private String projectUrl;
	private String contractID;
	private String projectUrlName;
	
	
	public Project() {
	}
	

	public Project(String projectID, String projectName, String customerID, Date buildProjectDate,
			BigDecimal projectCost, BigDecimal esTotalRevenue, Date startDate, Date endDate, String projectDescription,
			String projectRiskDes, Integer estprojectImpDays, String projectTypeID, String projectStateID,
			String projectImpID, String projectUrl, String contractID, String projectUrlName) {
		super();
		this.projectID = projectID;
		this.projectName = projectName;
		this.customerID = customerID;
		this.buildProjectDate = buildProjectDate;
		this.projectCost = projectCost;
		this.esTotalRevenue = esTotalRevenue;
		this.startDate = startDate;
		this.endDate = endDate;
		this.projectDescription = projectDescription;
		this.projectRiskDes = projectRiskDes;
		this.estprojectImpDays = estprojectImpDays;
		this.projectTypeID = projectTypeID;
		this.projectStateID = projectStateID;
		this.projectImpID = projectImpID;
		this.projectUrl = projectUrl;
		this.contractID = contractID;
		this.projectUrlName = projectUrlName;
	}


	public String getProjectID() {
		return projectID;
	}
	public void setProjectID(String projectID) {
		this.projectID = projectID;
	}


	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public Date getBuildProjectDate() {
		return buildProjectDate;
	}
	public void setBuildProjectDate(Date buildProjectDate) {
		this.buildProjectDate = buildProjectDate;
	}
	
	public BigDecimal getProjectCost() {
		return projectCost;
	}
	public void setProjectCost(BigDecimal projectCost) {
		this.projectCost = projectCost;
	}
	public BigDecimal getEsTotalRevenue() {
		return esTotalRevenue;
	}
	public void setEsTotalRevenue(BigDecimal esTotalRevenue) {
		this.esTotalRevenue = esTotalRevenue;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getProjectDescription() {
		return projectDescription;
	}
	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}
	public String getProjectRiskDes() {
		return projectRiskDes;
	}
	public void setProjectRiskDes(String projectRiskDes) {
		this.projectRiskDes = projectRiskDes;
	}
	public Integer getEstprojectImpDays() {
		return estprojectImpDays;
	}
	public void setEstprojectImpDays(Integer estprojectImpDays) {
		this.estprojectImpDays = estprojectImpDays;
	}
	public String getProjectTypeID() {
		return projectTypeID;
	}
	public void setProjectTypeID(String projectTypeID) {
		this.projectTypeID = projectTypeID;
	}
	public String getProjectStateID() {
		return projectStateID;
	}
	public void setProjectStateID(String projectStateID) {
		this.projectStateID = projectStateID;
	}
	public String getProjectImpID() {
		return projectImpID;
	}
	public void setProjectImpID(String projectImpID) {
		this.projectImpID = projectImpID;
	}
	
	public String getProjectUrl() {
		return projectUrl;
	}
	public void setProjectUrl(String projectUrl) {
		this.projectUrl = projectUrl;
	}
	public String getContractID() {
		return contractID;
	}

	public void setContractID(String contractID) {
		this.contractID = contractID;
	}


	public String getProjectUrlName() {
		return projectUrlName;
	}


	public void setProjectUrlName(String projectUrlName) {
		this.projectUrlName = projectUrlName;
	}

		
	
}
