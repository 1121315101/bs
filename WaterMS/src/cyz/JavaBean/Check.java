package cyz.JavaBean;

import java.util.Date;

public class Check {
	private String checkID;
	private String projectID;
	private String checkManger;
	private Date checkDateTime;
	private Date checkDate;
	private String checkResult;
	private String checkDescribe;
	private String checkMan;
	public Check(String checkID, String projectID, String checkManger, Date checkDateTime, Date checkDate,
			String checkResult, String checkDescribe, String checkMan) {
		super();
		this.checkID = checkID;
		this.projectID = projectID;
		this.checkManger = checkManger;
		this.checkDateTime = checkDateTime;
		this.checkDate = checkDate;
		this.checkResult = checkResult;
		this.checkDescribe = checkDescribe;
		this.checkMan = checkMan;
	}
	public String getCheckID() {
		return checkID;
	}
	public void setCheckID(String checkID) {
		this.checkID = checkID;
	}
	public String getProjectID() {
		return projectID;
	}
	public void setProjectID(String projectID) {
		this.projectID = projectID;
	}
	public String getCheckManger() {
		return checkManger;
	}
	public void setCheckManger(String checkManger) {
		this.checkManger = checkManger;
	}
	public Date getCheckDateTime() {
		return checkDateTime;
	}
	public void setCheckDateTime(Date checkDateTime) {
		this.checkDateTime = checkDateTime;
	}
	public Date getCheckDate() {
		return checkDate;
	}
	public void setCheckDate(Date checkDate) {
		this.checkDate = checkDate;
	}
	public String getCheckResult() {
		return checkResult;
	}
	public void setCheckResult(String checkResult) {
		this.checkResult = checkResult;
	}
	public String getCheckDescribe() {
		return checkDescribe;
	}
	public void setCheckDescribe(String checkDescribe) {
		this.checkDescribe = checkDescribe;
	}
	public String getCheckMan() {
		return checkMan;
	}
	public void setCheckMan(String checkMan) {
		this.checkMan = checkMan;
	}
	
}
