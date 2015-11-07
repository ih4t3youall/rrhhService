package ar.com.rrhhService.controllers;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.com.rrhhService.bo.PermisosBO;
import ar.com.rrhhService.dao.MotivoDAO;
import ar.com.rrhhService.dominio.Motivo;
import ar.com.rrhhService.dto.SolicitarPermisoDTO;

@Controller
public class PermisosController {
	@Autowired
	private PermisosBO permisosBO;
	@Autowired
	private MotivoDAO motivoDAO;
	
	@RequestMapping("empFormSolicitarPermisos.htm")
	public ModelAndView formSolicitarPermisos(){
		
		ModelAndView mav = new ModelAndView("permisos/formSolicitarPermisos");
		SolicitarPermisoDTO solicitarPermisoDTO = new SolicitarPermisoDTO();
	
		List<Motivo> list = motivoDAO.list();
		
		mav.addObject("motivos",list);
		
		mav.addObject("solicitarPermisoDTO",solicitarPermisoDTO);
		
		return mav;
	}

	
	
	
	@RequestMapping("empSolicitarPermisos.htm")
	public ModelAndView SolicitarPermisos(SolicitarPermisoDTO solicitarPermisoDTO,Principal principal){
		
		ModelAndView mav = new ModelAndView("exito/permisoExito");
		permisosBO.solicitarPermiso(solicitarPermisoDTO,principal.getName());
		mav.addObject("exito","exito");
		return mav;
	}
	
	
}
