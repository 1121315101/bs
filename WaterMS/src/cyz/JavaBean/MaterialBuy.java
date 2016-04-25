package cyz.JavaBean;

import java.util.Date;

public class MaterialBuy {
	private String materialbyID;
	private String projectID;
	private String maupload;
	private String equipment;
	private String material;
	private Date materialdate;
	private String macheckType;
	private String MaUrl;
	private String MaUrlName;
	private String Machecker;
	
	public MaterialBuy(String materialbyID, String projectID, String maupload, String equipment, String material,
			Date materialdate, String macheckType, String maUrl, String maUrlName ,String Machecker) {
		super();
		this.materialbyID = materialbyID;
		this.projectID = projectID;
		this.maupload = maupload;
		this.equipment = equipment;
		this.material = material;
		this.materialdate = materialdate;
		this.macheckType = macheckType;
		MaUrl = maUrl;
		MaUrlName = maUrlName;
		this.Machecker=Machecker;
	}
	
	public String getMachecker() {
		return Machecker;
	}

	public void setMachecker(String machecker) {
		Machecker = machecker;
	}

	public String getMaterialbyID() {
		return materialbyID;
	}
	public void setMaterialbyID(String materialbyID) {
		this.materialbyID = materialbyID;
	}
	public String getProjectID() {
		return projectID;
	}
	public void setProjectID(String projectID) {
		this.projectID = projectID;
	}
	public String getMaupload() {
		return maupload;
	}
	public void setMaupload(String maupload) {
		this.maupload = maupload;
	}
	public String getEquipment() {
		return equipment;
	}
	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public Date getMaterialdate() {
		return materialdate;
	}
	public void setMaterialdate(Date materialdate) {
		this.materialdate = materialdate;
	}
	public String getMacheckType() {
		return macheckType;
	}
	public void setMacheckType(String macheckType) {
		this.macheckType = macheckType;
	}
	public String getMaUrl() {
		return MaUrl;
	}
	public void setMaUrl(String maUrl) {
		MaUrl = maUrl;
	}
	public String getMaUrlName() {
		return MaUrlName;
	}
	public void setMaUrlName(String maUrlName) {
		MaUrlName = maUrlName;
	}
	
	
}
