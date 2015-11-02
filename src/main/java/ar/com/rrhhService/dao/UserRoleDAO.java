package ar.com.rrhhService.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import ar.com.rrhhService.dominio.Moto;
import ar.com.rrhhService.dominio.UserRole;

public class UserRoleDAO {

	
	 @Autowired
	 private SessionFactory sessionFactory;
	
	 public void save(Object p) {
	        Session session = this.sessionFactory.openSession();
	        Transaction tx = session.beginTransaction();
	        session.persist(p);
	        tx.commit();
	        session.close();
	    }
	 
	    @SuppressWarnings("unchecked")
	    
	    public List<Moto> list() {
	        Session session = this.sessionFactory.openSession();
	        List<Moto> personList = session.createQuery("select p  from "+UserRole.class.getName()+" p").list();
	        session.close();
	        return personList;
	    }

		public SessionFactory getSessionFactory() {
			return sessionFactory;
		}

		public void setSessionFactory(SessionFactory sessionFactory) {
			this.sessionFactory = sessionFactory;
		}
	    
}
