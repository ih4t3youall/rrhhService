package ar.com.rrhhService.bo;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;

import ar.com.rrhhService.dao.EmpleadoDAO;
import ar.com.rrhhService.dao.UserDAO;
import ar.com.rrhhService.dominio.Solicitud;
import ar.com.rrhhService.dominio.User;
import ar.com.rrhhService.dto.SolicitarPermisoDTO;

public class PermisosBO {

	private UserDAO userDAO;
	@Autowired
	private EmpleadoDAO empleadoDAO;
	@Autowired
	private DozerBeanMapper dozerMapper;

	public void solicitarPermiso(SolicitarPermisoDTO solicitarPermisoDTO, String username) {

		User user = userDAO.getUserByUsername(username);
		empleadoDAO.solictarPermiso(user.getEmpleadoIdEmpleado(),solicitarPermisoDTO);

		 dozerMapper.map(solicitarPermisoDTO, Solicitud.class);
		
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

}
