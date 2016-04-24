package cyz.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cyz.JavaBean.Agreement;
import cyz.JavaBean.Contract;
import cyz.JavaBean.HR;
import cyz.JavaBean.Project;
import cyz.JavaBean.ProjectDatils;
import cyz.clas.ConnectDB;

public class FactoryImp {
	static Connection con=ConnectDB.conncectionDB();
	@SuppressWarnings("null")
	
	public static Map<String, Object> getProjectList(int ptype,int ppage,int psize){
		String state="";
		switch(ptype){
			case 0:state="进行中";
				break;
			case 1:state="待审";
				break;
			case 2:state="完成";
				break;
		}
		String sql="select * from project  where projectStateID='"+state+"'order by buildProjectDate ";
		Map< String, Object> map=new HashMap<String, Object>();
		List<Project> list=new ArrayList<Project>();
	
		ResultSet rs=ConnectDB.getResultSet(con, sql);//rs什么都不操作的时候指的是0
		try {
			if(ppage==1){
				//rs.first();  
			}else{
				rs.absolute((ppage-1)*psize);
			}
			while(psize>0 &&rs.next()){
				Project	p=new Project(rs.getString(1), rs.getString(2),rs.getString(3), 
						rs.getDate(4), rs.getBigDecimal(5),rs.getBigDecimal(6), rs.getDate(7), 
						rs.getDate(8), rs.getString(9), rs.getString(10), rs.getInt(11),
						rs.getString(12), rs.getString(13), rs.getString(14),rs.getString(15),
						rs.getString(16), rs.getString(17));				
				list.add(p);
				psize--;
			}
			rs.last();
			int count=rs.getRow();
			map.put("1", list);
			map.put("2",String.valueOf(count));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return  map;
	}

	
	
	public static Map<String ,Object> getProjectList(String name){
		int psize=2;
		Map< String, Object> map=new HashMap<String, Object>();
		List<Project> list=new ArrayList<Project>();
		String sql="select * from project where projectName='"+name+"' OR projectID ='"+name+"' or projectImpID ='"+name+"' or projectStateID ='"+name+"' or projectTypeID ='"+name+"'";
		ResultSet rs=ConnectDB.getResultSet(con, sql);
		try {
			while(psize>0 &&rs.next()){
				Project	p=new Project(rs.getString(1), rs.getString(2),rs.getString(3), 
						rs.getDate(4), rs.getBigDecimal(5),rs.getBigDecimal(6), rs.getDate(7), 
						rs.getDate(8), rs.getString(9), rs.getString(10), rs.getInt(11),
						rs.getString(12), rs.getString(13), rs.getString(14),rs.getString(15),
						rs.getString(16), rs.getString(17));				
				list.add(p);
				psize--;
			}
			rs.last();
			int count=rs.getRow();
			map.put("1", list);
			map.put("2",String.valueOf(count));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return  map;
	}
	
	
	public static ProjectDatils getProjectDails(String projectid){
		String sql="select * from projectDatils  where projectID='"+projectid+"'";
		ResultSet rs=ConnectDB.getResultSet(con, sql);
		ProjectDatils pd=null;
		try {while(rs.next()){
			pd=new ProjectDatils(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
					rs.getString(5), rs.getDate(6),rs.getString(7), rs.getString(8),rs.getString(9),rs.getString(10), 
					rs.getDate(11), rs.getBigDecimal(12),rs.getBigDecimal(13),rs.getDate(14), rs.getDate(15),rs.getString(16), rs.getString(17)
					,rs.getInt(18),rs.getString(19), rs.getString(20), rs.getString(21), rs.getString(22),rs.getString(23),rs.getString(24));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pd;
	}
	
	
	public static Contract getContract(String projectid){
		Contract contract=null;
		String sql="select * from projectContract  where projectID='"+projectid+"'";
		ResultSet rs=ConnectDB.getResultSet(con, sql);
		try{
			while(rs.next()){
				contract=new Contract(rs.getString(1), rs.getString(2),rs.getString(3),rs.getDate(4),
						rs.getBigDecimal(5), rs.getDate(6), rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return contract;
	}
	
	public static Agreement getAgreement(String projectid){
		Agreement agree=null;
		String sql="select * from agreement  where projectID='"+projectid+"'";
		ResultSet rs=ConnectDB.getResultSet(con, sql);
		try{
			while(rs.next()){
				agree=new Agreement(rs.getString(1), rs.getString(2),rs.getString(3),rs.getString(4),
						rs.getString(5),rs.getString(6), rs.getDate(7), 
						rs.getBigDecimal(8),rs.getBigDecimal(9),rs.getBigDecimal(10),rs.getBigDecimal(11),rs.getBigDecimal(12),rs.getString(13),rs.getString(14));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return agree;
	}

	
	public static HR getHR(String projectid){
		HR hr=null;
		String sql="select * from HR  where projectID='"+projectid+"'";
		ResultSet rs=ConnectDB.getResultSet(con, sql);
		try{
			while(rs.next()){
				hr=new HR(rs.getString(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return hr;
	}
}
