package com.starsconnect.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.starsconnect.dao.User;
import com.starsconnect.service.UsersService;

@Controller
public class LoginController {

	UsersService usersService;
	
	@Autowired	
	public void setUsersService(UsersService usersService) {
		this.usersService = usersService;
	}

	@RequestMapping("/login")
	public String showLogin(){
		return "login";
	}

	@RequestMapping("/loggedin")
	public String showLoggedin(Model model){
		List<User> users = usersService.getAllUsers();
		model.addAttribute("users",users);
		return "loggedin";
	}
	
	@RequestMapping("/newaccount")
	public String showNewAccount(Model model){
		model.addAttribute("user", new User());
		return "newaccount";
	}
	
	@RequestMapping(value="/createaccount", method=RequestMethod.POST)
	public String createAccount(User user, BindingResult result){
		
		if (result.hasErrors()){
			return "createaccount";
		}
		// default set for now
		user.setAuthority("user");
		user.setEnabled(1);
		user.setOptin(false);
		user.setVerified(false);
			
		// add new user
		usersService.saveOrUpdateUser(user);
				
		return "accountcreated";
	}


}














