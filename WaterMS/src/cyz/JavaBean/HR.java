package cyz.JavaBean;

import java.io.Serializable;

public class HR implements Serializable{
	private String HRID;
	private String projectManger;
	private String accounting;
	private String materialByer;
	private String worker;
	private String HRCheckType;
	
	public HR() {
		// TODO Auto-generated constructor stub
	}

	public String getHRID() {
		return HRID;
	}

	public void setHRID(String hRID) {
		HRID = hRID;
	}

	public String getProjectManger() {
		return projectManger;
	}

	public void setProjectManger(String projectManger) {
		this.projectManger = projectManger;
	}

	public String getAccounting() {
		return accounting;
	}

	public void setAccounting(String accounting) {
		this.accounting = accounting;
	}

	public String getMaterialByer() {
		return materialByer;
	}

	public void setMaterialByer(String materialByer) {
		this.materialByer = materialByer;
	}

	public String getWorker() {
		return worker;
	}

	public void setWorker(String worker) {
		this.worker = worker;
	}

	public String getHRCheckType() {
		return HRCheckType;
	}

	public void setHRCheckType(String hRCheckType) {
		HRCheckType = hRCheckType;
	}

	public HR(String hRID, String projectManger, String accounting, String materialByer, String worker,
			String hRCheckType) {
		super();
		HRID = hRID;
		this.projectManger = projectManger;
		this.accounting = accounting;
		this.materialByer = materialByer;
		this.worker = worker;
		HRCheckType = hRCheckType;
	}


	
}
