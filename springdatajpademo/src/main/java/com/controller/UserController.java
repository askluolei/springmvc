package com.controller;

import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.UserService;

@Controller
public class UserController {
	
	@Resource
	private UserService userService;
	
	static Logger logger=LogManager.getLogger();
	
	@RequestMapping("login")
	public String login(String username,String password,ModelMap model){
		logger.info("login");
		if(userService.count(username, password)){
			model.addAttribute("username", username);
			model.addAttribute("password", password);
			return "success";
		}
		else
			return "error";
	}
	
	@RequestMapping("/")
	public String common(){
		return "index";
	}

}
