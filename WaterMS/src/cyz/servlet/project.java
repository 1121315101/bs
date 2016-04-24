package cyz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cyz.DAO.FactoryImp;
import cyz.JavaBean.Agreement;
import cyz.JavaBean.Contract;
import cyz.JavaBean.HR;
import cyz.JavaBean.MonthReport;
import cyz.JavaBean.ProjectDatils;

/**
 * Servlet implementation class project
 */
@WebServlet("/project")
public class project extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public project() {
        super();
       
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String projectid=request.getParameter("projectid");
		int pttype=Integer.parseInt(request.getParameter("pttype"));
		HttpSession session=request.getSession(true);
		String sess=(String) session.getAttribute("projectid");
		ProjectDatils pd=null;//1
		Contract contract=null;//2
		Agreement agree=null;//3
		MonthReport monthreport=null;//4
		HR hr=null;//4
		
		if(!projectid .equals("nullstring")){
			session.setAttribute("projectid",projectid);
			switch (pttype) {
			case 1:
				pd=FactoryImp.getProjectDails(projectid);
				request.setAttribute("ProjectDatils", pd);
				System.out.println("获取projectid");
				request.getRequestDispatcher("./cyz.XM/Project.jsp").forward(request, response);
				response.getWriter().append("./cyz.XM/Project.jsp");
				break;
			case 2:
				contract=FactoryImp.getContract(projectid);
				request.setAttribute("contract", contract);
				request.getRequestDispatcher("./cyz.XM/Contract.jsp").forward(request, response);
				response.getWriter().append("./cyz.XM/Contract.jsp");
				break;
			case 3:
				agree=FactoryImp.getAgreement(projectid);
				request.setAttribute("agreement", agree);
				request.getRequestDispatcher("./cyz.XM/Agreement.jsp").forward(request, response);
				response.getWriter().append("./cyz.XM/Agreement.jsp");
				break;
			case 4:hr=FactoryImp.getHR(projectid);
				request.setAttribute("hr", hr);
				request.getRequestDispatcher("./cyz.XM/HR.jsp").forward(request, response);
				response.getWriter().append("./cyz.XM/HR.jsp");
			break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				break;
			default:
				break;
		}
		
		}
		
		if(projectid .equals("nullstring") && sess!=null && !sess.equals("nullstring")){
			switch (pttype) {
			case 1:
				pd=FactoryImp.getProjectDails(sess);
				request.setAttribute("ProjectDatils", pd);
				request.getRequestDispatcher("./cyz.XM/Project.jsp").forward(request, response);
				response.getWriter().append("./cyz.XM/Project.jsp");
				break;
			case 2:
				contract=FactoryImp.getContract(sess);
				request.setAttribute("contract", contract);
				request.getRequestDispatcher("./cyz.XM/Contract.jsp").forward(request, response);
				response.getWriter().append("./cyz.XM/Contract.jsp");
				break;
			case 3:
				agree=FactoryImp.getAgreement(sess);
				request.setAttribute("agreement", agree);
				request.getRequestDispatcher("./cyz.XM/Agreement.jsp").forward(request, response);
				response.getWriter().append("./cyz.XM/Agreement.jsp");
				break;
			case 4:
				hr=FactoryImp.getHR(sess);
				request.setAttribute("hr", hr);
				request.getRequestDispatcher("./cyz.XM/HR.jsp").forward(request, response);
				response.getWriter().append("./cyz.XM/HR.jsp");
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				break;
			default:
				break;
		}
	}
	if(projectid .equals("nullstring") && sess==null ){
			switch (pttype) {
			case 1:
				request.setAttribute("ProjectDatils", pd);
				request.getRequestDispatcher("./cyz.XM/Project.jsp").forward(request, response);
				response.getWriter().append("./cyz.XM/Project.jsp");
				break;
			case 2:
				request.setAttribute("contract", contract);
				request.getRequestDispatcher("./cyz.XM/Contract.jsp").forward(request, response);
				response.getWriter().append("./cyz.XM/Contract.jsp");
				break;
			case 3:
				request.setAttribute("agreement", agree);
				request.getRequestDispatcher("./cyz.XM/Agreement.jsp").forward(request, response);
				response.getWriter().append("./cyz.XM/Agreement.jsp");
				break;
			case 4:
				request.setAttribute("hr", hr);
				request.getRequestDispatcher("./cyz.XM/HR.jsp").forward(request, response);
				response.getWriter().append("./cyz.XM/HR.jsp");
				break;
			case 5:
				request.setAttribute("monthreport", monthreport);
				request.getRequestDispatcher("./cyz.XM/MonthReport.jsp").forward(request, response);
				response.getWriter().append("./cyz.XM/MonthReport.jsp");
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				break;
			default:
				break;
		}
	}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
