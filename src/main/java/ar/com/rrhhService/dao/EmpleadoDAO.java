package ar.com.rrhhService.dao;

import java.math.BigInteger;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import ar.com.rrhhService.dominio.Empleado;

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
	    
	    public long crearEmpleado(Object p){
	    	
	    	Session session = this.sessionFactory.openSession();
	    	 Transaction tx = session.beginTransaction();
		        session.persist(p);
		        tx.commit();
	    	Long lastId = ((BigInteger) session.createSQLQuery("SELECT LAST_INSERT_ID()").uniqueResult()).longValue();
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
