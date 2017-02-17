package com.starsconnect.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.starsconnect.dao.UsersDao;

@Controller
public class HomeController {

	@Autowired
	UsersDao usersService;
	
	@RequestMapping("/")
	public String showHome(){
		return "home";
	}
		
}