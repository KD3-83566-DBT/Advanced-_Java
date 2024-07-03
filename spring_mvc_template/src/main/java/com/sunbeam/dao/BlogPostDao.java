package com.sunbeam.dao;

import java.util.List;

import com.sunbeam.entities.BlogPost;

public interface BlogPostDao {
List<BlogPost> getBlogPostByCategory(String categortName);
BlogPost getBlogPostByTitle(String title);
}