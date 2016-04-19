package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBHelper {

	private static String databasePath, user, pwd;
	static {
		databasePath = "jdbc:mysql://localhost/waterms";
		user = "root";
		pwd = "";
	}

	/**
	 * 获取与数据库的连接
	 * 
	 * @return
	 */
	public static Connection getConn() {
		Connection conn = null;
		try {
			Class.forName("org.gjt.mm.mysql.Driver").newInstance();
			conn = DriverManager.getConnection(databasePath, user, pwd);
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static ResultSet getRS(Connection conn, String sql) {
		ResultSet rs = null;
		try {
			if (conn != null)
				rs = conn.createStatement().executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

	/**
	 * 关闭连接
	 * 
	 * @param conn
	 *            需要关闭的连接
	 */
	public static void close(Connection conn) {
		try {
			if (null != conn)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}