package com.yash.pfs.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController{
	
	@RequestMapping("/processLogin")
	public String processLogin(@RequestParam("email") String email,@RequestParam("@password") String password, Model model,
			HttpServletRequest req){
		return "";
	}
}
