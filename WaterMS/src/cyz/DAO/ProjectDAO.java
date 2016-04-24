package cyz.DAO;

import java.util.List;

import cyz.JavaBean.Project;

public interface ProjectDAO {
	void save(Project project);//添加合同
	Project   findByID(String  projectID);
	List<Project>   findByState(String  projectState);
}
