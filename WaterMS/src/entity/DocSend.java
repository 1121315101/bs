package entity;

import java.util.Date;

import org.json.JSONException;
import org.json.JSONObject;

public class DocSend {
	public static String nameSend[] = { "id", "title", "cont", "secret", "type", "urgency", "draftTime", "drafter",
			"sector", "checker", "state" };
	String id, title, cont, secret, type, urgency, drafter, sector, checker, state;
	Date draftTime;

	public DocSend(String id, String title, String cont, String secret, String type, String urgency, Date draftTime,
			String drafter, String sector, String checker, String state) {
		this.id = id;
		this.title = title;
		this.cont = cont;
		this.secret = secret;
		this.type = type;
		this.urgency = urgency;
		this.draftTime = draftTime;
		this.drafter = drafter;
		this.sector = sector;
		this.secret = secret;
		this.checker = checker;
		this.state = state;
	}

	public DocSend() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCont() {
		return cont;
	}

	public void setCont(String cont) {
		this.cont = cont;
	}

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrgency() {
		return urgency;
	}

	public void setUrgency(String urgency) {
		this.urgency = urgency;
	}

	public Date getDraftTime() {
		return draftTime;
	}

	public void setDraftTime(long draftTime) {
		Date time = new Date();
		time.setTime(draftTime);
		this.draftTime = time;
	}

	public String getDrafter() {
		return drafter;
	}

	public void setDrafter(String drafter) {
		this.drafter = drafter;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getChecker() {
		return checker;
	}

	public void setChecker(String checker) {
		this.checker = checker;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public JSONObject toJSON() {
		JSONObject jsonObject = new JSONObject();
		int i = 0;
		try {
			jsonObject.put(nameSend[i++], this.getId());
			jsonObject.put(nameSend[i++], this.getTitle());
			jsonObject.put(nameSend[i++], this.getCont());
			jsonObject.put(nameSend[i++], this.getSecret());
			jsonObject.put(nameSend[i++], this.getType());
			jsonObject.put(nameSend[i++], this.getUrgency());
			jsonObject.put(nameSend[i++], this.getDraftTime());
			jsonObject.put(nameSend[i++], this.getDrafter());
			jsonObject.put(nameSend[i++], this.getSector());
			jsonObject.put(nameSend[i++], this.getChecker());
			jsonObject.put(nameSend[i++], this.getState());
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return jsonObject;
	}
}
