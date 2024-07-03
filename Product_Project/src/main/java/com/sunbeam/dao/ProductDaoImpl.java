package com.sunbeam.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.*;

import com.sunbeam.entities.Category;
import com.sunbeam.entities.Product;
import com.sunbeam.utils.HibernateUtils;

public class ProductDaoImpl implements ProductDao {

	@Override
	public String addProduct(Product p1) {
		String meg="product not addes";
		Session session=HibernateUtils.getFactory().getCurrentSession();
		Transaction tx=session.beginTransaction();
		try {
			Serializable productId= session.save(p1);
			tx.commit();
			meg="product added in table" +productId;
		}catch (Exception e) {
			// TODO: handle exception
			if(tx != null)
				tx.rollback();
			throw e;
		}
		return meg;
	}

	@Override
	public Product getProduct(Long id) {
		Product pro;
		Session session=HibernateUtils.getFactory().getCurrentSession();
		Transaction tx=session.beginTransaction();
		try {
			pro=session.get(Product.class, id);
			tx.commit();
		}
		catch (Exception e) {
			// TODO: handle exception
			if(tx != null)
				tx.rollback();
			throw e;
		}
		return pro;
	}
	@Override
	public List<Product> DisplayByCategoryPrice(double sPrice,double ePrice,Category category) {
		List<Product> pro;
	String jpql="select p from  Product p where p.price between :sPrice and :ePrice and p.category=:category ";
	Session session=HibernateUtils.getFactory().getCurrentSession();
	Transaction tx=session.beginTransaction();
	try {
		pro=session.createQuery(jpql,Product.class).setParameter("sPrice", sPrice).setParameter("ePrice", ePrice).setParameter("category", category).getResultList();
		tx.commit();
	}catch (Exception e) {
		// TODO: handle exception
		if(tx != null)
			tx.rollback();
		throw e;
	}
	return pro;
	

	}

	@Override
	public String deleteProduct(String name) {
		String meg="product is faill to delete...........";
		String jpql="select p from Product p where p.name=:name";
		
		
		Session session=HibernateUtils.getFactory().getCurrentSession();
		Transaction tx=session.beginTransaction();
		try {
			Product p=session.createQuery(jpql,Product.class)
					.setParameter("name", name)
					.getSingleResult();
			session.delete(p);
			meg = "Product details deleted...";
			tx.commit();
		}catch (Exception e) {
			// TODO: handle exception
			if(tx!=null)
				tx.rollback();
			throw e;
		}
		
		return meg;
	}

	@Override
	public String getDiscount(Category category,double discount) {
		String m="discount is no applied ....";
		String jpql="Update Product p set p.price=p.price-:discount where p.category=:category ";
		Session session=HibernateUtils.getFactory().getCurrentSession();
		Transaction tx=session.beginTransaction();
		try {
			int rows=session.createQuery(jpql)
					.setParameter("discount", discount)
					.setParameter("category", category)
					.executeUpdate();
			tx.commit();
			m = "Applied discount to users - " + rows;		
		}catch (RuntimeException  e) {

if(tx!=null)
	tx.rollback();
throw e;
		}
		return m;
	}
}
