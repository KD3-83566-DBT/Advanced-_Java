package com.sunbeam.tester;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import com.sunbeam.dao.ProductDao;
import com.sunbeam.dao.ProductDaoImpl;
import com.sunbeam.entities.Category;
import com.sunbeam.entities.Product;

import com.sunbeam.utils.HibernateUtils;

public class AddProductInTable {

	public static void main(String[] args) {
		try(SessionFactory fac=HibernateUtils.getFactory();
				Scanner sc= new Scanner(System.in)){
			ProductDao dao= new ProductDaoImpl();
			System.out.println(" enter  category name  ,product_name , price , available quantity");
			Product p =new Product(Category.valueOf(sc.next().toUpperCase()), sc.next(),sc.nextDouble(),sc.nextInt());
			System.out.println(dao.addProduct(p));
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
