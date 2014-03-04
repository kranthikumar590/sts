package com.auth.login;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.authentication.switchuser.SwitchUserGrantedAuthority;
import org.springframework.stereotype.Component;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {

	
	static Logger log = Logger.getLogger(CustomAuthenticationProvider.class
			.getName());

	@Override
	public Authentication authenticate(Authentication authentication) {
		String name = authentication.getName();
		// System.out.println("Auth name from textfield... "+name);
		String password = authentication.getCredentials().toString();
		

		String role = "ROLE_USER";
		try {
			
		} catch (NullPointerException e) {

			log.info("User Name [ " + name + "  ] doesnot exists....");
		}

		if (name.equals("admin") && password.equals("admin123")) {
			// System.out.println(school_name);

			List<GrantedAuthority> grantedAuths = new ArrayList<GrantedAuthority>();
			grantedAuths.add(new SwitchUserGrantedAuthority(role,
					authentication));
			Authentication auth = new UsernamePasswordAuthenticationToken(name,
					password, grantedAuths);

			return auth;
		} else {
			return null;
		}
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}

}