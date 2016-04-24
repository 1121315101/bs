package cyz.clas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ConnectDB {
	
	public static Connection conncectionDB(){

		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:10000/xm","root","root");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return con;
	}

	public static Statement Createstate(Connection con) {
		Statement stat=null;
		try {
			stat=con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return stat;
	}
	
	//ִ�в�ѯ���,��ȡ����Դ
	public static  ResultSet getResultSet(Statement stat,String sql) {
		ResultSet rs=null;
		try {
			rs=stat.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	public static  ResultSet getResultSet(Connection con,String sql) {
		ResultSet rs=null;
		Statement stat=null;
		try {
			stat=con.createStatement();
			rs=stat.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("e."+e.getMessage());
		}
		return rs;
	}
	
	public static int getCount(Connection con,String sql) {
		int count=0;;
		try {
			count = con.createStatement().executeQuery(sql).getMetaData().getColumnCount();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

	public static void close(Connection conn) {
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			conn = null;
		}
	}
	
	public static void close(Statement stmt) {
		if(stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			stmt = null;
		}
	}
	
	public static void close(ResultSet rs) {
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			rs = null;
		}
	}
	
	
	
}
