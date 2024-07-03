package com.sunbeam.utils;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.xdevapi.SessionFactory;

public class HibernateUtils {
private static org.hibernate.SessionFactory factory;
static {
	factory=new Configuration().configure().buildSessionFactory();
}
public static org.hibernate.SessionFactory getFactory() {
	return factory;
	
}
}
