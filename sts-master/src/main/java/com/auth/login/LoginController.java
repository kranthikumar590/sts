package com.auth.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String loginPage(){
		
		return "login";
	}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(){
		
		return "login";
	}
	 @RequestMapping(value="/fail2login", method = RequestMethod.GET)  
	 public String loginerror(ModelMap model) {  
	   
	  model.addAttribute("error", "true");  
	  return "login";  
	   
	 }  
	   
	 @RequestMapping(value="/logout", method = RequestMethod.GET)  
	 public String logout(ModelMap model) {  
	   
	  return "login";  
	   
	 }  
	 @RequestMapping(value="/404", method = RequestMethod.GET)  
	 public String accessDenied(ModelMap model) {  
	   
	  return "404";  
	   
	 }  
}
