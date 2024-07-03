package com.sunbeam.service;

import java.util.List;

import com.sunbeam.entities.BlogPost;

public interface BlogPostService {
	public List<BlogPost> getBlogPostByCategory(String categortName);
}
