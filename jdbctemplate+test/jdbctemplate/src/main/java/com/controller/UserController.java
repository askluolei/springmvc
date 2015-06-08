package com.controller;

import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.model.User;
import com.service.UserService;

@Controller
public class UserController {
	
	@Resource
	private UserService userServiceImpl;
	
	static Logger logger=LogManager.getLogger(UserController.class.getName());
	
	@RequestMapping("login")
	public String login(@ModelAttribute("user") User user){
		logger.info("login");
		boolean flog=userServiceImpl.login(user.getUsername(), user.getPassword());
		if(flog){
			return "success";
		}
		else
			return "error";
	}
	
	@RequestMapping("hello")
	public String hello(String hello){
		logger.info("hello");
		return "success";
	}

}
