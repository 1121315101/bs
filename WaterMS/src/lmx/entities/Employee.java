package lmx.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userid")
	private long userid;
	@Column(name = "idnumber", length = 18)
	private String idnumber;
	@Column(name = "name", length = 16)
	private String name;
	@Column(name = "jobtitle", length = 4)
	private String jobtitle;
	@Column(name = "evaluationtime")
	private String evaluationtime;
	@Column(name = "post", length = 30)
	private String post;
	@Column(name = "job", length = 30)
	private String job;
	@Column(name = "firstdegree", length = 30)
	private String firstdegree;
	@Column(name = "graduatedschool", length = 30)
	private String graduatedschool;
	@Column(name = "highesteducation", length = 30)
	private String highesteducation;
	@Column(name = "highestEducationSchools", length = 30)
	private String highestEducationSchools;
	@Column(name = "bachelorofScience", length = 30)
	private String bachelorofScience;
	@Column(name = "dateofbirth")
	private String dateofbirth;
	@Column(name = "workDate")
	private String workDate;
	@Column(name = "datecompany")
	private String datecompany;
	@Column(name = "dateofseparation")
	private String dateofseparation;
	@Column(name = "reasonforleaving", length = 300)
	private String reasonforleaving;
	@Column(name = "birthplace", length = 100)
	private String birthplace;
	@Column(name = "politicalstatus", length = 10)
	private String politicalstatus;
	@Column(name = "officePhone", length = 15)
	private String officePhone;
	@Column(name = "homephone", length = 15)
	private String homephone;
	@Column(name = "homeaddress", length = 100)
	private String homeaddress;
	@Column(name = "phone", length = 11)
	private String phone;
	@Column(name = "email", length = 50)
	private String email;
	@Column(name = "photo", length = 50)
	private String photo;

	public long getUserid() {
		return userid;
	}

	public String getIdnumber() {
		return idnumber;
	}

	public String getName() {
		return name;
	}

	public String getJobtitle() {
		return jobtitle;
	}

	public String getEvaluationtime() {
		return evaluationtime;
	}

	public String getPost() {
		return post;
	}

	public String getJob() {
		return job;
	}

	public String getFirstdegree() {
		return firstdegree;
	}

	public String getGraduatedschool() {
		return graduatedschool;
	}

	public String getHighesteducation() {
		return highesteducation;
	}

	public String getHighestEducationSchools() {
		return highestEducationSchools;
	}

	public String getBachelorofScience() {
		return bachelorofScience;
	}

	public String getDateofbirth() {
		return dateofbirth;
	}

	public String getWorkDate() {
		return workDate;
	}

	public String getDatecompany() {
		return datecompany;
	}

	public String getDateofseparation() {
		return dateofseparation;
	}

	public String getReasonforleaving() {
		return reasonforleaving;
	}

	public String getBirthplace() {
		return birthplace;
	}

	public String getPoliticalstatus() {
		return politicalstatus;
	}

	public String getOfficePhone() {
		return officePhone;
	}

	public String getHomephone() {
		return homephone;
	}

	public String getHomeaddress() {
		return homeaddress;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public String getPhoto() {
		return photo;
	}
}
