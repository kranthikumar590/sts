package com.auth.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

@Component
public class MyAuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {

	
	static Logger log = Logger.getLogger(MyAuthenticationSuccessHandler.class.getName());
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
        Authentication authentication) throws IOException, ServletException {
    	
    	Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username
        
        String role="ROLE_SENIORADMIN";
        try{
        	           
            if(role.equals("ROLE_JUNIORADMIN")){
            	setDefaultTargetUrl("/junior/homepage");
            }
            if(role.equals("ROLE_SENIORADMIN")){
            	setDefaultTargetUrl("/home");
            }	
            super.onAuthenticationSuccess(request, response, authentication);
        }
        catch(NullPointerException e){
        	
        	 log.info("User Name [ "+name+"  ] doesnot exists....");
        }
        // changeLastLoginTime(username)
    	
        
        
    }
}
