package com.senior.controllers;

import java.security.Principal;
import java.util.Date;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.admin.auth.Admin;
import com.admin.auth.AdminService;

@Controller
public class HomePage {
	static Logger log = Logger.getLogger(HomePage.class.getName());
	@Autowired
    private AdminService adminService;
	@RequestMapping(value="/senior/homepage", method = RequestMethod.GET)
	public String seniorHomepage(ModelMap model, Principal principal) {
			model.addAttribute("date", new Date());
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	        String name = auth.getName(); //get logged in username
	        //String pass=(String) auth.getCredentials();
	        //System.out.println(name);
	        //System.out.println(pass);
	        String admin_name=null;
	        try{
	        	Admin admin=adminService.getAdminDetails(name);
	        	admin_name=admin.getAdmin_name();
	            model.addAttribute("admin_name", admin_name);
	            
	         }
	        catch(NullPointerException e){
	        	
	        	log.info("User Name [ "+name+"  ] doesnot exists....");
	        }
	        model.addAttribute("schoolsList", adminService.listSchools());
	        model.addAttribute("schoolsListLength", adminService.listSchools().size());  
			return "/senior_admin/homepage";
	}
	
}
