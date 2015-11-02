package ar.com.rrhhService.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class LoginController {

	
	@RequestMapping("/login.htm")
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView("login/login");
		return mav;

	}
	
	@RequestMapping("pruebas.htm")
	public ModelAndView pruebas(){
		ModelAndView mav = new ModelAndView("pruebas");
		return mav;
		
		
		
	}

	@RequestMapping(value="/loginfailed.htm", method = RequestMethod.GET)
	public ModelAndView loginfailed(ModelMap model) {
		ModelAndView mav = new ModelAndView("login/login");
		

		return mav;

	}


	
	@RequestMapping(value="/logout.htm", method = RequestMethod.GET)
	public ModelAndView logout(ModelMap model) {
 
		ModelAndView mav = new ModelAndView("/login/login");
		
		return mav;
 
	}
	
	

}
