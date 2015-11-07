package ar.com.rrhhService.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import ar.com.rrhhService.dominio.User;

public class UserDAO {

	
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
	    
	    public List<User> list() {
	        Session session = this.sessionFactory.openSession();
	        List<User> personList = session.createQuery("select p  from "+User.class.getName()+" p").list();
	        session.close();
	        return personList;
	    }
	    
	    public User getUserByUsername(String username){
	    	
	    	Criteria criteria = sessionFactory.openSession().createCriteria(User.class);
	    	criteria.add(Restrictions.eq("username", username));
	    	Object uniqueResult = criteria.uniqueResult();
	    	User user  = (User) uniqueResult;
	    	return user;
	    	
	    }
	    

		public SessionFactory getSessionFactory() {
			return sessionFactory;
		}

		public void setSessionFactory(SessionFactory sessionFactory) {
			this.sessionFactory = sessionFactory;
		}
	    
	    
	    
}
