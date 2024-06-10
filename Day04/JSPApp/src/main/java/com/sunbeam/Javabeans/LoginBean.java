package com.sunbeam.Javabeans;

import com.sunbeam.daos.CandidateDaoImpl;
import com.sunbeam.daos.UserDaoImpl;
import com.sunbeam.pojos.Candidate;
import com.sunbeam.pojos.User;

public class LoginBean {
private String email;
private String passwd;
private User user;
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return passwd;
}
public void setPassword(String password) {
	this.passwd = password;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public void authenticate(){
	try {
		UserDaoImpl cando= new UserDaoImpl();
		user = cando.findByEmail(email);
		if(user!=null &&passwd.equals(user.getPassword())) {
		 user=user;
		}
		else {
			user=null;
		}

	} catch (Exception e) {
		e.printStackTrace();
	}	
	
}
}
