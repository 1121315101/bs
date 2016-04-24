package cyz.servlet;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cyz.DAO.FactoryImp;
import cyz.JavaBean.Project;

@WebServlet("/projectList")
public class projectList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public projectList() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		response.setContentType("UTF-8");
		request.setCharacterEncoding("UTF-8");
		int ptype =Integer.parseInt(request.getParameter("ptype"));
		int ppage =Integer.parseInt(request.getParameter("ppage"));
		HttpSession session=request.getSession(true);
		if(session.getAttribute("ptype")==null){
			session.setAttribute("ptype", ptype);
		}
		if(session.getAttribute("ppage")==null){
			session.setAttribute("ppage", ppage);
		}
		System.out.println("ptype="+ptype+"ppage="+ppage+"psize="+2);;
		switch(ptype){
			case 0 :
				session.setAttribute("ptype", ptype);
				session.setAttribute("ppage", ppage);
				break;
			case 11:
				Integer pptype =(Integer) session.getAttribute("ptype");
				if(pptype!=null){
					ptype=(int)pptype;
				}
				ppage=1;
				session.setAttribute("ppage", ppage);
				break;
			case 1:
				session.setAttribute("ptype", ptype);
				session.setAttribute("ppage", ppage);
				break;
			case 2:
				session.setAttribute("ptype", ptype);
				session.setAttribute("ppage", ppage);
				break;
			case 12:
				Integer ppptype =(Integer) session.getAttribute("ptype");
				if(ppptype!=null){
					ptype=(int)ppptype;
				}
				session.setAttribute("ppage", ppage);
				break;
		}
		Map<String, Object> map= FactoryImp.getProjectList(ptype,ppage,2);
		List<Project> list=(List<Project>) map.get("1");
		String count =(String) map.get("2");
		request.setAttribute("list", list);
		request.setAttribute("count", count);
		request.getRequestDispatcher("./cyz.XM/ProjectList.jsp").forward(request, response);
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		response.setContentType("UTF-8");
		request.setCharacterEncoding("UTF-8");
		String hetong =request.getParameter("hetong");
		String xiangmu =request.getParameter("xiangmu");
		System.out.println("---------------------------");
		List<Project> list=null;
		String count=null;
		if(xiangmu!=null){
			Map<String, Object> map=FactoryImp.getProjectList(xiangmu);
			list=(List<Project>) map.get("1");
			count =(String) map.get("2");
		}
		if(xiangmu==null && hetong!=null){
			
		}
		if(hetong==null && xiangmu==null){
			Map<String, Object> map=FactoryImp.getProjectList(0,1,2);
			list=(List<Project>) map.get("1");
			count =(String) map.get("2");
		}
		
		request.setAttribute("list", list);
		request.setAttribute("count", count);
		request.getRequestDispatcher("./cyz.XM/ProjectList.jsp").forward(request, response);
		response.getWriter().append("./cyz.XM/ProjectList.jsp");
		
		
	}

}
