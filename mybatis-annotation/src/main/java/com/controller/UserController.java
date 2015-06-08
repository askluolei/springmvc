package com.controller;

import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.service.UserService;

@Controller
public class UserController {
	
	@Resource
	private UserService service;
	
	static Logger logger=LogManager.getLogger(UserController.class.getName());
	
	@RequestMapping("login")
	public String login(@RequestParam String username,@RequestParam String password){
		logger.info("login");
		if(service.countLogin(username, password))
			return "success";
		else
			return "error";
	}

}
