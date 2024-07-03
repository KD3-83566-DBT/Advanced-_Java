package com.sunbeam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sunbeam.dao.BlogPostDao;
import com.sunbeam.entities.BlogPost;
@Service//spring bean Holding BL singleton and eager
@Transactional //for automatic Tx management
public class BlogPostServiceImpl implements BlogPostService {
  
	@Autowired //byType
	private BlogPostDao blogPost;
	@Override
	public List<BlogPost> getBlogPostByCategory(String categortName) {
		
		return  blogPost.getBlogPostByCategory(categortName);
	}
	@Override
	public BlogPost getBlogPostByTitle(String title) {
		
		return blogPost.getBlogPostByTitle(title);
	}

}
