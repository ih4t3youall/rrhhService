package ar.com.rrhhService.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.com.rrhhService.bo.UsuarioBO;
import ar.com.rrhhService.dto.CrearUsuarioDTO;

@Controller
public class UsuariosController {

	@Autowired
	private UsuarioBO usuarioBO;
	
	
	
	@RequestMapping("admFormCrearEmpleado.htm")
	public ModelAndView formCrearUsuario(){
		CrearUsuarioDTO usuarioDTO = new CrearUsuarioDTO();
		ModelAndView mav = new ModelAndView("usuarios/formCrearEmpleado");
		mav.addObject("usuarioDTO",usuarioDTO);
		return mav;
		
	}
	
	@RequestMapping("admCrearEmpleado.htm")
	public ModelAndView crearUsuario(CrearUsuarioDTO usuarioDTO){
		

		usuarioBO.crearUsuarioEmpleado(usuarioDTO);
		

		ModelAndView mav = formCrearUsuario();
		mav.addObject("exito","exito");
		return mav;
		
	}
	
}
