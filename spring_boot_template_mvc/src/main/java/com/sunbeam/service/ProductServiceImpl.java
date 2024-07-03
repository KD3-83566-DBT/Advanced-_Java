package com.sunbeam.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunbeam.dao.ProductDao;
import com.sunbeam.entities.Product;
@Service
@Transactional
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductDao dao;
 public ProductServiceImpl() {
 }
	@Override
	public Product findAllProductBy() {
		
		return (Product) dao.findAllProduct();
	}

}
