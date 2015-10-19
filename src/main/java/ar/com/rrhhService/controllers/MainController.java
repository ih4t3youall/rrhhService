package ar.com.rrhhService.controllers;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.com.rrhhService.dao.EmpleadoDAO;
import ar.com.rrhhService.dao.HorarioDAO;
import ar.com.rrhhService.dao.MotoDAO;
import ar.com.rrhhService.dominio.Empleado;
import ar.com.rrhhService.dominio.Horario;
import ar.com.rrhhService.dominio.Moto;

@Controller
public class MainController {

	@Autowired
	private MotoDAO motoDAO;
	@Autowired
	private EmpleadoDAO empleadoDAO;
	@Autowired
	private HorarioDAO horarioDAO;
	
	
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
		
		empleado.setHorarios(horarios);
		
		
		empleadoDAO.save(empleado);		
		horarioDAO.save(ho);
		
		
		
		
		Moto moto =  new Moto();
		moto.setMarca("honda");
		moto.setModelo("cbr600");
		motoDAO.save(moto);
		
		
		
		ModelAndView mav = new ModelAndView();
		return mav;
		
		
	}

	public MotoDAO getMotoDAO() {
		return motoDAO;
	}

	public void setMotoDAO(MotoDAO motoDAO) {
		this.motoDAO = motoDAO;
	}
	
	
	
}
