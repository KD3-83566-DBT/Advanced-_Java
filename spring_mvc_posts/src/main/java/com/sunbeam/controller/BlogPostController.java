package com.sunbeam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sunbeam.service.BlogPostService;

@Controller
@RequestMapping("/posts")
public class BlogPostController {
	
	@Autowired
	private BlogPostService blogPostService;
public BlogPostController() {
	System.out.println("in ctor - "+getClass().getName());
}
@GetMapping("/view")
public String  getBlogPostByCategory(@RequestParam String categoryName ,Model modelAttributeMap) {
	
	System.out.println("in get blog posts" +categoryName);
	modelAttributeMap.addAttribute("blog_list", blogPostService.getBlogPostByCategory(categoryName));
	return "/posts/bloglist";
	
}
}
