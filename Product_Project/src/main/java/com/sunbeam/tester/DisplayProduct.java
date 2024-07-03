package com.sunbeam.tester;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import com.sunbeam.dao.ProductDao;
import com.sunbeam.dao.ProductDaoImpl;
import com.sunbeam.utils.HibernateUtils;

public class DisplayProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     try(SessionFactory fac =HibernateUtils.getFactory();
    		 Scanner sc= new Scanner(System.in)){
    	 ProductDao dao= new ProductDaoImpl();
    	 System.out.println("enter product id for serche Product");
    	 System.out.println(dao.getProduct(sc.nextLong()));
     }
	}

}
