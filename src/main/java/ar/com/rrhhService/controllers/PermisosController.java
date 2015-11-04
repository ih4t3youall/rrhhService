package ar.com.rrhhService.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.com.rrhhService.dto.SolicitarPermisoDTO;

@Controller
public class PermisosController {

	
	
	@RequestMapping("empFormSolicitarPermisos.htm")
	public ModelAndView formSolicitarPermisos(){
		
		ModelAndView mav = new ModelAndView("permisos/formSolicitarPermisos");
		SolicitarPermisoDTO solicitarPermisoDTO = new SolicitarPermisoDTO();
		mav.addObject("solicitarPermisoDTO",solicitarPermisoDTO);
		
		return mav;
	}
	
}
