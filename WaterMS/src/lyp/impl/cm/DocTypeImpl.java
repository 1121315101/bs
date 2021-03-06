package lyp.impl.cm;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import lyp.db.DBHelper;
import lyp.entity.DocType;

public class DocTypeImpl {
	/**
	 * 获取所有的记录
	 * 
	 * @return
	 */
	public List<DocType> fetchAll() {
		Connection conn = DBHelper.getConn();
		String sql = "select * from doc_type";
		ResultSet rs = DBHelper.getRS(conn, sql);
		List<DocType> list = new ArrayList<>();
		try {
			while (rs.next()) {
				DocType docType = new DocType();
				docType.setId(rs.getString("type_id"));
				docType.setCont(rs.getString("type_cont"));
				list.add(docType);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DBHelper.close(conn);
		return list;
	}
}
