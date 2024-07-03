package com.sunbeam.tester;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import com.sunbeam.dao.ProductDao;
import com.sunbeam.dao.ProductDaoImpl;
import com.sunbeam.entities.Category;
import com.sunbeam.utils.HibernateUtils;

public class getDiscount {

	public static void main(String[] args) {
		try(SessionFactory s=HibernateUtils.getFactory();
				Scanner sc= new Scanner(System.in)){
			ProductDao dao= new ProductDaoImpl();
			System.out.println("Enter Category and discount for that Category");
			System.out.println(dao.getDiscount(Category.valueOf(sc.next().toUpperCase()), sc.nextDouble()));
		}catch (Exception e) {
			
		}

	}

}
