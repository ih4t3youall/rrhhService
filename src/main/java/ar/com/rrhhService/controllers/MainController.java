package ar.com.rrhhService.controllers;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.com.rrhhService.dao.EmpleadoDAO;
import ar.com.rrhhService.dao.HorarioDAO;
import ar.com.rrhhService.dao.SolicitudDAO;
import ar.com.rrhhService.dao.UserDAO;
import ar.com.rrhhService.dao.UserRoleDAO;
import ar.com.rrhhService.dominio.Empleado;
import ar.com.rrhhService.dominio.Horario;
import ar.com.rrhhService.dominio.Solicitud;
import ar.com.rrhhService.dominio.User;
import ar.com.rrhhService.dominio.UserRole;

@Controller
public class MainController {

	@Autowired
	private EmpleadoDAO empleadoDAO;
	@Autowired
	private HorarioDAO horarioDAO;
	@Autowired
	private SolicitudDAO solicitudDAO;
	@Autowired
	private UserDAO userDAO;
	@Autowired
	private UserRoleDAO userRoleDAO;
	
	
	
	
	
	@RequestMapping("crearUsuarios.htm")
	public ModelAndView crearUsuarios(){
		
		
		User user = new User();
		user.setUsername("usuarioname1");
		user.setPassword("password1");
		user.setEnabled(true);
		
		UserRole userRole = new UserRole();
		userRole.setRole("un_rol");
		userRole.setUser(user);
		
		userDAO.save(user);
		userDAO.save(userRole);
		

		
		ModelAndView mav = new ModelAndView();
		return mav;
		
	}
	
	@RequestMapping("crearEmpleado.htm")
	public ModelAndView crearUsuarioAdministrador(){
		
		Empleado empleado = new Empleado();
		empleado.setNombre("nombre");
		empleado.setApellido("apellido");
		long crearEmpleado = empleadoDAO.crearEmpleado(empleado);
		System.out.println(crearEmpleado);
		
//		INSERT INTO pdfindexer.users (USERNAME,PASSWORD, ENABLED,nombre,apellido,razonsocial,telefono,ruc,mail,tipo_usuario,caduca,temporal)
//		VALUES ('root', 'root', TRUE,'martin','lquerica','razonsocial','4220929','ruc','sourceSistemas@gmail.com','vip','2100-03-10',true);
//		 
//		INSERT INTO pdfindexer.user_roles ( USER_ID,AUTHORITY)
//		VALUES ( 33, 'ROLE_USER');
		
		
		ModelAndView mav = new ModelAndView();
		return mav;
		
	}
	
	
	@RequestMapping("traerEmpleado.htm")
	public ModelAndView traerEmpleado(){
		
		
		Empleado empleado = empleadoDAO.getEmpleado(1);
		
		ModelAndView mav = new ModelAndView();
		return mav;
	}
	
	
	@RequestMapping("inicio.htm")
	public ModelAndView inicio(){
		
		
		Empleado empleado = new Empleado();
		empleado.setNombre("martin");
		empleado.setApellido("lequerica");
		empleado.setDireccion("una direccion");
		empleado.setLegajo("un legajo");
		empleado.setTelefono("un telefono");
		List<Horario> horarios = new ArrayList<Horario>();
		Horario ho = new Horario();

		
		
		// 1) create a java calendar instance
		Calendar calendar = Calendar.getInstance();
		 
		// 2) get a java.util.Date from the calendar instance.
//		    this date will represent the current instant, or "now".
		java.util.Date now = calendar.getTime();
		 
		// 3) a java current time (now) instance
		java.sql.Timestamp currentTimestamp = new java.sql.Timestamp(now.getTime());
		
		ho.setEntrada(currentTimestamp);
		ho.setSalida(currentTimestamp);
		ho.setFecha(currentTimestamp);
		ho.setEmpleado(empleado);
		horarios.add(ho);
		
		Solicitud sol = new Solicitud();
		List<Solicitud> solicitudes = new ArrayList<Solicitud>();
		sol.setEmpleado(empleado);
		sol.setFecha_realizado(currentTimestamp);
		sol.setLicencia_fin(currentTimestamp);
		sol.setLicencia_inicio(currentTimestamp);
		
		solicitudes.add(sol);
		
		empleado.setHorarios(horarios);
		empleado.setSolicituds(solicitudes);
		
		
		
		
		empleadoDAO.save(empleado);		
		horarioDAO.save(ho);
		solicitudDAO.save(sol);
		
		
		
		
//		Moto moto =  new Moto();
//		moto.setMarca("honda");
//		moto.setModelo("cbr600");
//		motoDAO.save(moto);
		
		
		
		ModelAndView mav = new ModelAndView();
		return mav;
		
		
	}

	
	
}
