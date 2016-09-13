package com.niit.shoppingback.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

//import javax.management.Query;

//import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.shoppingback.model.Category;
@EnableTransactionManagement
@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	//private static final Query SessionFactory=null;
	@Autowired
	private SessionFactory sessionFactory;
	public CategoryDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
		
	}

	public boolean save(Category category) {
		// TODO Auto-generated method stub
		try {
			Session s= sessionFactory.getCurrentSession();
			Transaction tx= s.beginTransaction();
			s.save(category);
			tx.commit();
			return true;
			//sessionFactory.getCurrentSession().save(category);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
	}
@Transactional
	public boolean update(Category category) {
		// TODO Auto-generated method stub
		try {
			Session s= sessionFactory.getCurrentSession();
			Transaction tx=s.beginTransaction();
			s.update(category);
			tx.commit();
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}


	@Transactional
	public boolean  delete(Category category) {
		
		// TODO Auto-generated method stub
		
		try {
		 Session s = sessionFactory.getCurrentSession();
		 Transaction tx=s.beginTransaction();
			s.delete(category);
			tx.commit();
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}

	public Category get(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Category> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
