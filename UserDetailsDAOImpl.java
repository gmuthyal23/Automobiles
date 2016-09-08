package Com.Automobiles.Shopping.dao;

import java.util.List;


import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import Com.Automobiles.Shopping.model.UserDetails;

@EnableTransactionManagement
@Repository

public class UserDetailsDAOImpl implements UserDetailsDAO {

	//private static final Query SessionFactory = null;
	@Autowired
	private SessionFactory sessionFactory;

	public UserDetailsDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;

	}
	
  @Transactional
	public boolean save(UserDetails userdetails) {
		try {
			Session s= sessionFactory.getCurrentSession();
			Transaction t = s.beginTransaction();
			//sessionFactory.getCurrentSession().save(userdetails);
			s.save(userdetails);
			t.commit();
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}
   public UserDetailsDAOImpl() {
	   System.out.println("User DAO Impl");
}
@Transactional
	public boolean update(UserDetails userdetails) {
		try {
			sessionFactory.getCurrentSession().update(userdetails);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}
@Transactional
	public boolean delete(UserDetails userdetails) {
		try {
			Session s= sessionFactory.getCurrentSession();
			Transaction t= s.beginTransaction();
		//	sessionFactory.getCurrentSession().delete(userdetails);
			s.save(userdetails);
			t.commit();
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}
@Transactional
	public UserDetails get(String id) {

		String hql = "from UserDetails where id=" + " ' " + id + "'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<UserDetails> list = query.list();
		if (list == null)

			return null;
		else {
			return list.get(0);
		}
	}
@Transactional
	public List<UserDetails> list() {
		String hql = "from UserDetails";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();

	}
}
