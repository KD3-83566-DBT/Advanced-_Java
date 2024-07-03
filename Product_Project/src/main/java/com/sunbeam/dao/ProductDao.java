package com.sunbeam.dao;

import java.util.List;

import com.sunbeam.entities.Category;
import com.sunbeam.entities.Product;

public interface ProductDao {
String addProduct(Product p);
Product getProduct(Long id);
List<Product> DisplayByCategoryPrice(double sPrice,double ePrice,Category categgory);
String deleteProduct(String name);
String getDiscount(Category c,double discount);
}
