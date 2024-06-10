package com.sunbeam.Javabeans;

import java.sql.Date;

import com.sunbeam.daos.UserDaoImpl;
import com.sunbeam.pojos.User;

public class register {
	int i;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	String DOB;
	//private Date birth;
	private int status;
	private String role;
	private User user;
	private Date birth=Date.valueOf(DOB);
	public void reg() {
		try {//String firstName2, String lastName2, String email2, String password2, Date dob, int status2,String role2
			user= new User(firstName,lastName,email,password,birth,0,"voter");
			UserDaoImpl usDao= new UserDaoImpl();
			i=usDao.save(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
