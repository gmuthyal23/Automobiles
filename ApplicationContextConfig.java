package com.niit.shoppingback.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.shoppingback.dao.CategoryDAO;
import com.niit.shoppingback.dao.CategoryDAOImpl;
import com.niit.shoppingback.model.Category;



@Configuration
@ComponentScan
@EnableTransactionManagement
public class ApplicationContextConfig {

	@Bean(name = "dataSource")
	public DataSource getDataSource() {

		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/sagar");
		dataSource.setUsername("sa");
		dataSource.setPassword("");

		return dataSource;
	}

	private Properties getHibernateProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		properties.put("hibernate.hbm2ddl.auto", "update");
		properties.put("hibernate.current_session_context_class", "thread");
		return properties;
	}

	@Autowired
	@Bean(name = "sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource) {

		LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
		sessionBuilder.addProperties(getHibernateProperties());

		sessionBuilder.addAnnotatedClass(Category.class);
		//sessionBuilder.addAnnotatedClass(Supplier.class);
		//sessionBuilder.addAnnotatedClass(Product.class);
		//sessionBuilder.addAnnotatedClass(UserDetails.class);
		return sessionBuilder.buildSessionFactory();
	}

	@Autowired
	@Bean(name = "transactionmanager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);

		return transactionManager;
	}

	
	  @Autowired
	  @Bean(name="categoryDAO") public CategoryDAO
	  getCategoryDAO(SessionFactory sessionFactory) { return new
			  CategoryDAOImpl(sessionFactory);
	  }
	  @Autowired
	  @Bean(name="category")
	  public Category getCategory() {
		  return new  Category();
	  }

	 /* @Autowired
	  @Bean(name="productDAO") public ProductDAO
	  getCategoryDAO(SessionFactory sessionFactory ){ return new
			  ProductDAOImpl(sessionFactory);
	    }
	  @Autowired
	  @Bean(name="product")
	  public Product getProduct(){
		  return new Product();
		  
	  }*/
}

