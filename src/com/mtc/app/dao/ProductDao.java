package com.mtc.app.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.mtc.app.entity.Product;
import com.mtc.app.util.HibernateUtil;

public class ProductDao {
	private SessionFactory sessionFactory;
	public ProductDao(){
		sessionFactory=HibernateUtil.getSessionFactory();
	}
	
public Product FindByInt(int id)
{
	Session session=sessionFactory.openSession();
	Product p=session.get(Product.class,id);
	session.close();
	return p;
	
}
public List<Product> findall()
{
	Session session=sessionFactory.openSession();
	Query<Product> q=session.createQuery("from Product");
	List<Product> products=q.list();
	session.close();
	return products;
	
}
}
