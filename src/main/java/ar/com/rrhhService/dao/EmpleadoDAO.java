package ar.com.rrhhService.dao;

import java.math.BigInteger;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import ar.com.rrhhService.bo.PermisosBO;
import ar.com.rrhhService.dominio.Empleado;
import ar.com.rrhhService.dto.SolicitarPermisoDTO;

public class EmpleadoDAO {

	
	 @Autowired
	 private SessionFactory sessionFactory;
	
	 public void save(Object p) {
	        Session session = this.sessionFactory.openSession();
	        Transaction tx = session.beginTransaction();
	        session.persist(p);
	        tx.commit();
	        session.close();
	    }
	 
	 
		
	 public void delete(Object p) {
	        Session session = this.sessionFactory.openSession();
	        Transaction tx = session.beginTransaction();
	        session.delete(p);
	        tx.commit();
	        session.close();
	    }
	 
	 public Empleado getEmpleado(int idEmpleado){
		 Session session = this.sessionFactory.openSession();
		 Empleado empleado = (Empleado) session.get(Empleado.class, idEmpleado);
		 session.close();
		 return empleado;
		 
	 }
	 
	
	 
	    @SuppressWarnings("unchecked")
	    
	    public List<Empleado> list() {
	        Session session = this.sessionFactory.openSession();
	        
	        List<Empleado> personList = session.createQuery("select p  from "+Empleado.class.getName()+" p").list();
	        session.close();
	        return personList;
	    }
	    
	    public int crearEmpleado(Object p){
	    	
	    	Session session = this.sessionFactory.openSession();
	    	 Transaction tx = session.beginTransaction();
		        session.persist(p);
		        tx.commit();
	    	int lastId = ((BigInteger) session.createSQLQuery("SELECT LAST_INSERT_ID()").uniqueResult()).intValue();
	    	session.close();
	    	return lastId;
	    }

		public SessionFactory getSessionFactory() {
			return sessionFactory;
		}

		public void setSessionFactory(SessionFactory sessionFactory) {
			this.sessionFactory = sessionFactory;
		}



		
	    
}
