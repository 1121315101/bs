package lyp.impl.cm;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import lyp.db.DBHelper;
import lyp.entity.DocSend;

public class DocSendImpl {

	public List<DocSend> fetchAll() {
		Connection conn = DBHelper.getConn();
		String sql = "select * from doc_send";
		ResultSet rs = DBHelper.getRS(conn, sql);
		List<DocSend> list = new ArrayList<>();
		try {
			while (rs.next()) {
				DocSend docSend = new DocSend();
				docSend.setId(rs.getString("doc_id"));
				docSend.setTitle(rs.getString("doc_title"));
				docSend.setCont(rs.getString("doc_cont"));
				docSend.setSecret(rs.getString("doc_secret"));
				docSend.setType(rs.getString("Type_id"));
				docSend.setUrgency(rs.getString("doc_urgency"));
				docSend.setDraftTime(rs.getDate("doc_draftTime").getTime());
				docSend.setDrafter(rs.getString("doc_drafter"));
				docSend.setChecker(rs.getString("doc_checker"));
				docSend.setState(rs.getString("doc_state"));
				list.add(docSend);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DBHelper.close(conn);
		return list;
	}

}
