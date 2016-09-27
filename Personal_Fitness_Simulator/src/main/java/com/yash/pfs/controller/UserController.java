package com.yash.pfs.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		webDataBinder.registerCustomEditor(Date.class,"date",new CustomDateEditor(dateFormat, true));
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
		Date date1 = new Date(); // timestamp now
		Calendar cal = Calendar.getInstance(); // get calendar instance
		cal.setTime(date1); // set cal to date
		cal.set(Calendar.HOUR_OF_DAY, 0); // set hour to midnight
		cal.set(Calendar.MINUTE, 0); // set minute in hour
		cal.set(Calendar.SECOND, 0); // set second in minute
		cal.set(Calendar.MILLISECOND, 0); // set millis in second
		Date zeroedDate = cal.getTime(); // actually computes the new Date
		//System.out.println("cal.getTime:" + zeroedDate);
		List<User_Schedule> userScheduleList = userService.getUserSchedule(loggedInUser.getId(), zeroedDate);
		model.addAttribute("user_schedule", userScheduleList);
		return "/user/gymUser/viewLocationstodayhomepage";
	}
	
	@RequestMapping("/addSchedule")
	public String addSchedule(@RequestParam(value="can_id") String can_id, Model model, HttpSession session){
		//model.addAttribute("user_id", can_id);
		System.out.println("in add schedule..");
		session.setAttribute("fk_user_id", Integer.parseInt(can_id));
		return "/user/trainer/addSchedulePage";
	}
	
	@RequestMapping("/processScheduleInsert")
	public ResponseEntity  insertSchedule(Model model, @ModelAttribute("user_schedule") User_Schedule user_schedule, HttpSession session){
		user_schedule.setFk_user_id((Integer)session.getAttribute("fk_user_id"));
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date=new Date();
		Calendar cal=Calendar.getInstance();
		cal.setTime(date);
		cal.set(Calendar.HOUR_OF_DAY,0);
		cal.set(Calendar.MINUTE,0);
		cal.set(Calendar.SECOND,0);
		cal.set(Calendar.MILLISECOND,0);
		Date zeroedDate=cal.getTime();
		//user_schedule.setDate(zeroedDate);
		user_schedule.setCreated_by(3);
		user_schedule.setLast_modified_by(3);

		userService.insertSchedule(user_schedule);
		return new ResponseEntity(HttpStatus.OK);
		
	}
	
	@RequestMapping("/viewScheduleTrainer")
	public String viewScheduleTrnr(HttpSession session,Model model, HttpServletRequest req, @RequestParam(value="can_id") String can_id) {
		System.out.println("viewScheduleTrnr...");
		//User loggedInUser = (User) session.getAttribute("loggedInUser");
		List<User_Schedule> userScheduleList=userService.getUserScheduleList(Integer.parseInt(can_id));
		model.addAttribute("user_schedule", userScheduleList);
		return "/user/gymUser/viewLocationsToday";
	}
	
	@RequestMapping("/logout")
	public String logoutUser(HttpSession session){
		session.setAttribute("loggedInUser", null); //session to null
		return "redirect:/index.jsp";
	}
	
	
	
	
}
