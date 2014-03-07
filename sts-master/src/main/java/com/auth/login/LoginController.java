package com.auth.login;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	@Autowired
    private LoginService loginService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String loginPage(ModelMap model, Principal principal){
		//System.out.println(" DB ==> "+loginService.getAdminDetails("admin", "admin123"));
		return "redirect:/login";
	}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(ModelMap model, Principal principal){
		
		 Authentication auth = SecurityContextHolder.getContext().getAuthentication();

			if (!(auth instanceof AnonymousAuthenticationToken)) 

			    return "redirect:/home";
			else
				return "login";
		
	}
	 @RequestMapping(value="/loginfailed", method = RequestMethod.GET)  
	 public String loginerror(ModelMap model) {  
	   
	  model.addAttribute("error", "true");  
	  return "login";  
	   
	 }  
	   
	 @RequestMapping(value="/logout", method = RequestMethod.GET)  
	 public String logout(ModelMap model) {  
	  model.addAttribute("logout", "successfull");  
	  return "login";  
	   
	 }  
	 @RequestMapping(value="/404", method = RequestMethod.GET)  
	 public String accessDenied(ModelMap model) {  
	   
	  return "404";  
	   
	 }  
	 public String getLoggedUserDetails() {
		 Authentication auth = SecurityContextHolder.getContext().getAuthentication();

			if (!(auth instanceof AnonymousAuthenticationToken)) {

			    /* The user is logged in :) */
			    return "redirect:/home";
			}
			else
				return "redirect:/login";
		}
}
