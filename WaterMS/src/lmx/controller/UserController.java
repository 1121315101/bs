package lmx.controller;

import javax.servlet.http.HttpSession;

import lmx.service.UserService;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("userSession")
@RequestMapping("/lmx")
public class UserController {
	@Autowired
	private UserService userServiceImpl;
	
	@RequestMapping("/checkUser")
	public String check(@RequestParam("username") String username,
			@RequestParam("password") String password,HttpSession session){
		/*System.out.println(session.getAttribute("userSession") + "======");*/
		if(userServiceImpl.find(username,password) != -1 && session.getAttribute("userSession") != null){
			return "index.jsp";
		}else{
			return "/index.jsp";
		}
	}
	@RequestMapping("/checkUserbyJson")
	@ResponseBody
	public String checkUser(@RequestParam("jsonString") String jsonString,Model model/*,HttpSession session*/){
		/*if(session == null)
			System.out.println("空");
		else
			System.out.println(session.getAttribute("userSession") + "------");
		if(session.getAttribute("userSession") == null)
			System.out.println("空");*/
		JSONObject object = JSONObject.fromObject(jsonString);
		long tmp = userServiceImpl.find(object.getString("username"),object.getString("password"));
		if(tmp != -1){
			model.addAttribute("userSession",tmp);
			return "true";
		}else{
			return "false";
		}
	}
}
