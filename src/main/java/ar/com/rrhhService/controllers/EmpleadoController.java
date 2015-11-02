package ar.com.rrhhService.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmpleadoController {
	@RequestMapping("empleadoInicio.htm")
	public ModelAndView inicioEmpleado(){
		
		ModelAndView mav = new ModelAndView("empleado/inicioEmpleado");
		
		
		return mav;
		
	}

}
