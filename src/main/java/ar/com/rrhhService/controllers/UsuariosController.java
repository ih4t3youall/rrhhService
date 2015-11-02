package ar.com.rrhhService.controllers;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.com.rrhhService.dao.UserDAO;
import ar.com.rrhhService.dao.UserRoleDAO;
import ar.com.rrhhService.dominio.User;
import ar.com.rrhhService.dominio.UserRole;
import ar.com.rrhhService.dto.CrearUsuarioDTO;

@Controller
public class UsuariosController {

	@Autowired
	private UserDAO userDAO;
	@Autowired
	private UserRoleDAO userRoleDAO;
	
	@Autowired
	private DozerBeanMapper dozerMapper;
	
	@RequestMapping("admFormCrearEmpleado.htm")
	public ModelAndView formCrearUsuario(){
		CrearUsuarioDTO usuarioDTO = new CrearUsuarioDTO();
		ModelAndView mav = new ModelAndView("usuarios/formCrearEmpleado");
		mav.addObject("usuarioDTO",usuarioDTO);
		return mav;
		
	}
	
	@RequestMapping("admCrearEmpleado.htm")
	public ModelAndView crearUsuario(CrearUsuarioDTO usuarioDTO){
		
		User map = dozerMapper.map(usuarioDTO, User.class);
		
//		
//		User user = new User();
//		user.setEnabled(true);
//		user.setPassword(usuarioDTO.getPassword());
//		user.setUsername(usuarioDTO.getUsername());
//		
//		UserRole userRole = new UserRole();
//		userRole.setRole("EMPLEADO_USER");
//		userRole.setUser(user);
//		List<UserRole> listUserRole = new ArrayList<UserRole>();
//		listUserRole.add(userRole);
//		user.setUserRoles(listUserRole);
//		
//		userDAO.save(user);
//		userRoleDAO.save(userRole);
		ModelAndView mav = new ModelAndView();
		return mav;
		
	}
	
}
