package ar.com.rrhhService.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {

	@RequestMapping("adm_inicio.htm")
	public ModelAndView adminInicio(){
		
		ModelAndView mav = new ModelAndView("administrador/adm_inicio");
		
		
		return mav;
	}
	
}
