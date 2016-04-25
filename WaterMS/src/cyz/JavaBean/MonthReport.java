package cyz.JavaBean;

import java.util.Date;

public class MonthReport {
	private  String monreportID;
	private  String projectID;
	private  String monUpload;
	private  String monChecker;
	private  String monreportUrl;
	private  Date monDate;
	private  String monCheckType;
	private  String monUrlName;
	public MonthReport(String monreportID, String projectID, String monUpload, String monChecker, String monreportUrl,
			Date monDate, String monCheckType, String monUrlName) {
		this.monreportID = monreportID;
		this.projectID = projectID;
		this.monUpload = monUpload;
		this.monChecker = monChecker;
		this.monreportUrl = monreportUrl;
		this.monDate = monDate;
		this.monCheckType = monCheckType;
		this.monUrlName = monUrlName;
	}
	public String getMonreportID() {
		return monreportID;
	}
	public void setMonreportID(String monreportID) {
		this.monreportID = monreportID;
	}
	public String getProjectID() {
		return projectID;
	}
	public void setProjectID(String projectID) {
		this.projectID = projectID;
	}
	public String getMonUpload() {
		return monUpload;
	}
	public void setMonUpload(String monUpload) {
		this.monUpload = monUpload;
	}
	public String getMonChecker() {
		return monChecker;
	}
	public void setMonChecker(String monChecker) {
		this.monChecker = monChecker;
	}
	public String getMonreportUrl() {
		return monreportUrl;
	}
	public void setMonreportUrl(String monreportUrl) {
		this.monreportUrl = monreportUrl;
	}
	public Date getMonDate() {
		return monDate;
	}
	public void setMonDate(Date monDate) {
		this.monDate = monDate;
	}
	public String getMonCheckType() {
		return monCheckType;
	}
	public void setMonCheckType(String monCheckType) {
		this.monCheckType = monCheckType;
	}
	public String getMonUrlName() {
		return monUrlName;
	}
	public void setMonUrlName(String monUrlName) {
		this.monUrlName = monUrlName;
	}

	
}
