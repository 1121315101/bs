package lyp.cm;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import lyp.entity.DocSend;
import lyp.impl.cm.DocSendImpl;

/**
 * Servlet implementation class GetData
 */
@WebServlet("/GetData")
public class GetData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GetData() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String data = request.getParameter("data");
		String result = null;
		switch (data) {
		case "recDoc":
			result = getRecDoc();
			break;
		default:
			result = "";
			break;
		}
		response.getWriter().append(result);
	}

	private String getRecDoc() {
		List<DocSend> list = new DocSendImpl().fetchAll();
		JSONArray jsonArray = new JSONArray();
		for (DocSend docType : list) {
			jsonArray.put(docType.toJSON());
		}
		JSONObject resultJSON = new JSONObject();
		try {
			resultJSON.put("value", jsonArray.toString());
			resultJSON.put("name", getName(DocSend.nameSend));
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return resultJSON.toString();
	}

	private String getName(String[] name) {
		JSONArray jsonArray = new JSONArray();
		try {
			for (int i = 0; i < name.length; ++i) {
				JSONObject value = new JSONObject();
				value.put("name", name[i]);
				jsonArray.put(value);
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return jsonArray.toString();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
