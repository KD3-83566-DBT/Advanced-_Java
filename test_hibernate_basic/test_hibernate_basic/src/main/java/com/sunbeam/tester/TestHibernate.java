package com.sunbeam.tester;

import org.hibernate.SessionFactory;
//import static com.sunbeam.utils.HibernateUtils.getFactory;
import com.sunbeam.utils.HibernateUtils;

public class TestHibernate {
	public static void main(String []args ) { 
try(SessionFactory sf =HibernateUtils.getFactory()){
	System.out.println("hibernate us running ....");
}catch(Exception e) {
	e.printStackTrace();
	//<mapping class="com.sunbeam.entities.User"/>
}
}
}
