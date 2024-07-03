package com.sunbeam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sunbeam.service.BlogPostService;

@Component
@RequestMapping("/poststitle")
public class BlogPostByTitleController {
	@Autowired
	private BlogPostService blogPostService;
public BlogPostByTitleController() {
	System.out.println("in ctrc -:"+getClass().getName());
}
@GetMapping("/viewtitle")
public String  getBlogPostByTitle(@RequestParam String title ,Model modelAttributeMap) {
	
	System.out.println("in get blog posts" +title);
	modelAttributeMap.addAttribute("titlelist", blogPostService.getBlogPostByTitle(title));
	return "/posts/titlelist";
	
}
}
