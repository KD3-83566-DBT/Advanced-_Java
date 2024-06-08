package com.sunbeam.entity;

import java.time.LocalDate;

public class users {
		int id;
		String frist_name;
		String last_name;
		String email;
		String password;
		LocalDate date;
		boolean status;
		String role;
		
	public users() {	
	}

	public users(int id, String frist_name, String last_name, String email, String password, LocalDate date,
			boolean status, String role) {
		super();
		this.id = id;
		this.frist_name = frist_name;
		this.last_name = last_name;
		this.email = email;
		this.password = password;
		this.date = date;
		this.status = status;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFrist_name() {
		return frist_name;
	}

	public void setFrist_name(String frist_name) {
		this.frist_name = frist_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
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

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	

}
