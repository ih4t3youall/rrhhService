package ar.com.rrhhService.handler;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.WebAttributes;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import ar.com.rrhhService.controllers.AdminController;

public class CustomlAuthenticationSuccessHandler  implements AuthenticationSuccessHandler {

	@Autowired
	private AdminController adminController;
	
	private HttpServletResponse response;
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse responce, Authentication authentication)
			throws IOException, ServletException {
		this.response = responce;
		determineTargetUrl(authentication);
		
	}
	
		 
		    /** Builds the target URL according to the logic defined in the main class Javadoc. */
		    protected void determineTargetUrl(Authentication authentication) {
		        boolean isUser = false;
		        boolean isAdmin = false;
		        boolean isEmpleado = false;
		        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
		        for (GrantedAuthority grantedAuthority : authorities) {
		            if (grantedAuthority.getAuthority().equals("ROLE_USER")) {
		                isUser = true;
		                break;
		            } else if (grantedAuthority.getAuthority().equals("ROLE_ADMIN")) {
		                isAdmin = true;
		                break;
		            }else if (grantedAuthority.getAuthority().equals("ROLE_EMPLEADO")) {
		            	isEmpleado = true;
		                break;
		            }
		        }
		 
		         if (isAdmin) {
		        	   try {
						response.sendRedirect("adm_inicio.htm");
					} catch (IOException e) {
						e.printStackTrace();
					}
		        	
		        } else if(isEmpleado){
					try {
						response.sendRedirect("adm_inicio.htm");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		        }else {
		            throw new IllegalStateException();
		        }
		    }
		 
		    protected void clearAuthenticationAttributes(HttpServletRequest request) {
		        HttpSession session = request.getSession(false);
		        if (session == null) {
		            return;
		        }
		        session.removeAttribute(WebAttributes.AUTHENTICATION_EXCEPTION);
		    }
		 

}
