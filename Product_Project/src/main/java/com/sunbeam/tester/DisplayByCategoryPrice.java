package com.sunbeam.tester;
import java.util.*;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import com.sunbeam.dao.ProductDao;
import com.sunbeam.dao.ProductDaoImpl;
import com.sunbeam.entities.Category;
import com.sunbeam.entities.Product;
import com.sunbeam.utils.HibernateUtils;

import antlr.collections.List;
import java.util.*;
public class DisplayByCategoryPrice {

	public static void main(String[] args) {
		  try(SessionFactory fac =HibernateUtils.getFactory();
		    		 Scanner sc= new Scanner(System.in)){
			  ProductDao dao= new ProductDaoImpl();
			  System.out.println("enter price for start range and  end price and category");
			 System.out.println(dao.DisplayByCategoryPrice(sc.nextInt(),sc.nextInt(),Category.valueOf(sc.next().toUpperCase())));
					
						
		}catch (Exception e) {
			// TODO: handle exception
			
		}

	}

}
