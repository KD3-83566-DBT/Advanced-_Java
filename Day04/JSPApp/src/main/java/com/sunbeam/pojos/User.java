package com.sunbeam.pojos;

import java.sql.Date;

public class User {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private Date birth;
	private int status;
	private String role;

	public User(int id,String firstName, String lastName, String email, String password, Date birth, int status, String role) {
		 this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.birth = birth;
		this.status = status;
		this.role = role;
	}
  //new User(frist_name,last_name, email,passwd,date,status,role);
	public User( String firstName2, String lastName2, String email2, String password2, Date dob, int status2,
			String role2) {
		// TODO Auto-generated constructor stub
		//this.id = id;
		this.firstName = firstName2;
		this.lastName = lastName2;
		this.email = email2;
		this.password = password2;
		this.birth = dob;
		this.status = status2;
		this.role = role2;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", birth=" + birth + ", status=" + status + ", role=" + role + "]";
	}
}
