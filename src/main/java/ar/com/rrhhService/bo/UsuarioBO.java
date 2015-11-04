package ar.com.rrhhService.bo;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;

import ar.com.rrhhService.dao.EmpleadoDAO;
import ar.com.rrhhService.dao.UserDAO;
import ar.com.rrhhService.dao.UserRoleDAO;
import ar.com.rrhhService.dominio.Empleado;
import ar.com.rrhhService.dominio.User;
import ar.com.rrhhService.dominio.UserRole;
import ar.com.rrhhService.dto.CrearUsuarioDTO;

public class UsuarioBO {
	private EmpleadoDAO empleadoDAO;

	private DozerBeanMapper dozerMapper;

	private UserDAO userDAO;

	private UserRoleDAO userRoleDAO;

	public void crearUsuarioEmpleado(CrearUsuarioDTO usuarioDTO) {
		User user = dozerMapper.map(usuarioDTO, User.class);
		Empleado emp = dozerMapper.map(usuarioDTO, Empleado.class);
		user.setEnabled(true);
		UserRole userRole = new UserRole();
		userRole.setRole("ROLE_EMPLEADO");
		userRole.setUser(user);
		List<UserRole> listUserRole = new ArrayList<UserRole>();
		listUserRole.add(userRole);
		user.setUserRoles(listUserRole);

		int idEmpleado = empleadoDAO.crearEmpleado(emp);

		user.setEmpleadoIdEmpleado(idEmpleado);
		userDAO.save(user);
		userDAO.save(emp);
	}

	public EmpleadoDAO getEmpleadoDAO() {
		return empleadoDAO;
	}

	public void setEmpleadoDAO(EmpleadoDAO empleadoDAO) {
		this.empleadoDAO = empleadoDAO;
	}

	public DozerBeanMapper getDozerMapper() {
		return dozerMapper;
	}

	public void setDozerMapper(DozerBeanMapper dozerMapper) {
		this.dozerMapper = dozerMapper;
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public UserRoleDAO getUserRoleDAO() {
		return userRoleDAO;
	}

	public void setUserRoleDAO(UserRoleDAO userRoleDAO) {
		this.userRoleDAO = userRoleDAO;
	}

}
