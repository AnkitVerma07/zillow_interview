package interview.zillow.db.repository;

import java.sql.DriverManager;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import interview.zillow.db.entity.People;
import interview.zillow.db.entity.User;

/**
 * @author Ankit Verma
 * get the user data object from service and store to DB using hibernate
 */
public class UserRepo {
	
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	Session session = sessionFactory.openSession();
	
	public void postUserData(User userData){
		session.beginTransaction();
		session.save(userData);
		session.getTransaction().commit();
		session.close();
		session.getSessionFactory().close();
	   }
	
	public void postPersonData(People peopleData){
		session.beginTransaction();
		session.save(peopleData);
		session.getTransaction().commit();
		session.close();
		session.getSessionFactory().close();
	   }
	
	
	public List<People> getAllPeople(){
		session.beginTransaction();
		Query query = session.createQuery("from People");
		List<People> expList = (List<People>)query.list();
		session.getTransaction().commit();
		session.close();
		session.getSessionFactory().close();
		return expList;
	   }
}
