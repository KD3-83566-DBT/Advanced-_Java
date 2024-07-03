package com.sunbeam.tester;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import com.sunbeam.dao.ProductDao;
import com.sunbeam.dao.ProductDaoImpl;
import com.sunbeam.utils.HibernateUtils;

public class DeleteProductByName {

	public static void main(String[] args) {
		try(SessionFactory f=HibernateUtils.getFactory();
				Scanner sc= new Scanner(System.in)){
			ProductDao dao= new ProductDaoImpl();
			System.out.println("enter Product name for delete");
			System.out.println(dao.deleteProduct(sc.next()));
		}catch (Exception e) {
			// TODO: handle exception
		}

	}

}
