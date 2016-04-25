package cyz.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cyz.DAO.FactoryImp;
import cyz.JavaBean.Agreement;
import cyz.JavaBean.Check;
import cyz.JavaBean.Contract;
import cyz.JavaBean.Cost;
import cyz.JavaBean.HR;
import cyz.JavaBean.MaterialBuy;
import cyz.JavaBean.MonthReport;
import cyz.JavaBean.ProjectDatils;

@WebServlet("/project")
public class project extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public project() {
        super();
       
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String projectid=request.getParameter("projectid");
		int pttype=Integer.parseInt(request.getParameter("pttype"));
		
		HttpSession session=request.getSession(true);
		String sess=(String) session.getAttribute("projectid");
		ProjectDatils pd=null;//1
		Contract contract=null;//2
		Agreement agree=null;//3
		HR hr=null;//4
		List<MonthReport> monthreportlist=null;//5
		MaterialBuy materialbuy=null;//6
		List<Cost> costlist=null;//7
		Check check=null;//
		
		if(!projectid .equals("nullstring")){
			session.setAttribute("projectid",projectid);
			switch (pttype) {
			case 1:
				pd=FactoryImp.getProjectDails(projectid);
				request.setAttribute("ProjectDatils", pd);
				session.setAttribute("projectname",pd.getProjectName());
				
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
				monthreportlist=FactoryImp.getMonReport(projectid);
				request.setAttribute("monthreportlist", monthreportlist);
				request.getRequestDispatcher("./cyz.XM/MonthReport.jsp").forward(request, response);
				response.getWriter().append("./cyz.XM/MonthReport.jsp");
				break;
			case 6:
				materialbuy=FactoryImp.getMaterialbuy(projectid);
				request.setAttribute("materialbuy", materialbuy);
				request.getRequestDispatcher("./cyz.XM/Matertial.jsp").forward(request, response);
				response.getWriter().append("./cyz.XM/Matertial.jsp");
				break;
			case 7:
				costlist=FactoryImp.getCost(projectid);
				request.setAttribute("costlist", costlist);
				request.getRequestDispatcher("./cyz.XM/Cost.jsp").forward(request, response);
				response.getWriter().append("./cyz.XM/Cost.jsp");
				break;
			case 8:check=FactoryImp.getCheck(projectid);
				request.setAttribute("check", check);
				request.getRequestDispatcher("./cyz.XM/Check.jsp").forward(request, response);
				response.getWriter().append("./cyz.XM/Check.jsp");
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
				monthreportlist=FactoryImp.getMonReport(sess);
				request.setAttribute("monthreport", monthreportlist);
				request.getRequestDispatcher("./cyz.XM/MonthReport.jsp").forward(request, response);
				response.getWriter().append("./cyz.XM/MonthReport.jsp");
				break;
			case 6:
				materialbuy=FactoryImp.getMaterialbuy(sess);
				request.setAttribute("materialbuy", materialbuy);
				request.getRequestDispatcher("./cyz.XM/Matertial.jsp").forward(request, response);
				response.getWriter().append("./cyz.XM/Matertial.jsp");
				break;
			case 7:
				costlist=FactoryImp.getCost(sess);
				request.setAttribute("costlist", costlist);
				request.getRequestDispatcher("./cyz.XM/Cost.jsp").forward(request, response);
				response.getWriter().append("./cyz.XM/Cost.jsp");
				break;
			case 8:check=FactoryImp.getCheck(sess);
				request.setAttribute("check", check);
				request.getRequestDispatcher("./cyz.XM/Check.jsp").forward(request, response);
				response.getWriter().append("./cyz.XM/Check.jsp");
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
				request.setAttribute("monthreport", monthreportlist);
				request.getRequestDispatcher("./cyz.XM/MonthReport.jsp").forward(request, response);
				response.getWriter().append("./cyz.XM/MonthReport.jsp");
				break;
			case 6:
				request.setAttribute("materialbuy", materialbuy);
				request.getRequestDispatcher("./cyz.XM/Matertial.jsp").forward(request, response);
				response.getWriter().append("./cyz.XM/Matertial.jsp");
				break;
			case 7:
				request.setAttribute("costlist", costlist);
				request.getRequestDispatcher("./cyz.XM/Cost.jsp").forward(request, response);
				response.getWriter().append("./cyz.XM/Cost.jsp");
				break;
			case 8:request.setAttribute("check", check);
				request.getRequestDispatcher("./cyz.XM/Check.jsp").forward(request, response);
				response.getWriter().append("./cyz.XM/Check.jsp");
				break;
			default:
				break;
		}
	}
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession(true);
		session.setAttribute("projectid","nullstring");
		request.getRequestDispatcher("./cyz.XM/Contract.jsp").forward(request, response);
		response.getWriter().append("./cyz.XM/Contract.jsp");
	}

}
