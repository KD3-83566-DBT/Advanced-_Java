package com.sunbeam.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="categories")
public class Category extends BaseEntity {
	@Column(length = 20, unique = true)
	private String name;
	private String description;
	@OneToMany(mappedBy="ProductCategory", cascade= CascadeType.ALL)
	private List<Product> product = new ArrayList<>();
	
public Category(){	
	}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public List<Product> getProduct() {
	return product;
}

public void setProduct(List<Product> product) {
	this.product = product;
}

@Override
public String toString() {
	return "Category [name=" + name + ", description=" + description + ", product=" + product + "]";
}

	
	
}
