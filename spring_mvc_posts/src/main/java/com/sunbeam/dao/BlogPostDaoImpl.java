package com.sunbeam.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.sql.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sunbeam.entities.BlogPost;
import com.sunbeam.entities.Category;
@Repository
public class BlogPostDaoImpl implements BlogPostDao{
@Autowired
private SessionFactory factory;
	@Override
	public List<BlogPost> getBlogPostByCategory(String categortName) {
		String jpql="select p from BlogPost p where p.selectedCategory.categoryName=:categ";
		return  factory.getCurrentSession().createQuery(jpql,BlogPost.class).setParameter("categ",categortName).getResultList();
	}

}
