package com.yash.pfs.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.yash.pfs.model.User;
import com.yash.pfs.model.User_Schedule;
import com.yash.pfs.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController{
	
	User loggedInUser = null;
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/login")
	public ModelAndView loginScreen(){
		ModelAndView mav=new ModelAndView("/user/userLogin");
		return mav;
	}
	
	
	
	@RequestMapping("/processLogin")
	public String processLogin(@RequestParam("email") String email,@RequestParam("password") String password, Model model,HttpServletRequest req) {
		System.out.println("in processLogin");
		
		User user=new User();
		user.setEmail(email);
		user.setPassword(password);
		
		loggedInUser = userService.authenticateUser(user);
		if(loggedInUser!=null){
			//set session object
			req.getSession().setAttribute("loggedInUser",loggedInUser);
			switch(loggedInUser.getRoles().getRole_id()){	
			//if user
			case 1:
				//model.addAttribute("users",loggedInUser);
				model.addAttribute("fname", loggedInUser.getFirstname());
				return "/user/trainer/trainerPage";
			case 2:
				model.addAttribute("fname", loggedInUser.getFirstname());
				return "/user/gymUser/userPage";
			default:
				return "/user/errors/errorPage";
					
			}
		}
		return null;
	}
	
	@RequestMapping("/viewUsers")
	public String viewUsersForm(HttpSession session,Model model, HttpServletRequest req) {
		System.out.println("in view location");
		User loggedInUser = (User) session.getAttribute("loggedInUser");
		List<User> usersList=userService.getUsers(loggedInUser.getId());
		model.addAttribute("users", usersList);
		return "/user/trainer/viewLocationshomepage";
	}
	
	@RequestMapping("/viewSchedule")
	public String viewScheduleForm(HttpSession session,Model model, HttpServletRequest req) {
		
		User loggedInUser = (User) session.getAttribute("loggedInUser");
		List<User_Schedule> userScheduleList=userService.getUserScheduleList(loggedInUser.getId());
		model.addAttribute("user_schedule", userScheduleList);
		return "/user/gymUser/viewLocationshomepage";
	}
	
	@RequestMapping("/viewScheduleToday")
	public String viewScheduleTodayForm(HttpSession session,Model model, HttpServletRequest req) {
		
		User loggedInUser = (User) session.getAttribute("loggedInUser");
		
		
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		   //get current date time with Date()
		   Date date = new Date();
		   System.out.println(dateFormat.format(date));

		   //get current date time with Calendar()
		   Calendar cal = Calendar.getInstance();
		
		   
		List<User_Schedule> userScheduleList=userService.getUserSchedule(loggedInUser.getId(),dateFormat.format(cal.getTime()));
		model.addAttribute("user_schedule", userScheduleList);
		return "/user/gymUser/viewLocationstodayhomepage";
	}
	
	@RequestMapping("/logout")
	public String logoutUser(HttpSession session){
		session.setAttribute("loggedInUser", null); //session to null
		return "redirect:/index.jsp";
	}
	
	
	
	
}
