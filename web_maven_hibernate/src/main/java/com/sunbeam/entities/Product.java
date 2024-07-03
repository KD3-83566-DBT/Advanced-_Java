package com.sunbeam.entities;

import javax.persistence.*;

@Entity
@Table(name="Products")
public class Product extends BaseEntity {
@Column(unique = true, length = 20)	
private String name;
private double price;
@Column(name="available_qty")
private int availableQty;
@ManyToOne
@JoinColumn(name="category_id", nullable = false)
private Category ProductCategory;
  
public Product() {
	
}

@Override
public String toString() {
	return "Product [name=" + name + ", price=" + price + ", availableQty=" + availableQty + ", ProductCategory="
			+ ProductCategory + "]";
}


public Product(String name, double price, int availableQty, Category productCategory) {
	super();
	this.name = name;
	this.price = price;
	this.availableQty = availableQty;
	ProductCategory = productCategory;
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

public int getAvailableQty() {
	return availableQty;
}

public void setAvailableQty(int availableQty) {
	this.availableQty = availableQty;
}

public Category getProductCategory() {
	return ProductCategory;
}

public void setProductCategory(Category productCategory) {
	ProductCategory = productCategory;
}



}
