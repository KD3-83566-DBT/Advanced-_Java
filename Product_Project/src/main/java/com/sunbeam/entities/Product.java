package com.sunbeam.entities;

import javax.persistence.*;

@Entity
public class Product {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
@Column(length = 20)
private Category category;
@Column(length = 30,unique = true)
private String name;
private double price;
private int available_quantity;
  
public Product() {
	
}
public Product(Category category, String name, double price, int available_quantity) {
	super();
	this.category = category;
	this.name = name;
	this.price = price;
	this.available_quantity = available_quantity;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Category getCategory() {
	return category;
}
public void setCategory(Category category) {
	this.category = category;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getAvailable_quantity() {
	return available_quantity;
}
public void setAvailable_quantity(int available_quantity) {
	this.available_quantity = available_quantity;
}
@Override
public String toString() {
	return "Product [id=" + id + ", category=" + category + ", name=" + name + ", price=" + price
			+ ", available_quantity=" + available_quantity + "]";
}

}
