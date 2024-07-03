package com.sunbeam.dto;

import java.time.LocalDate;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

public class UserDto {
	
	@NotBlank
	private String uname;
	private String email;
	//@Size(min=6)
	private String password;
	private String city;
	private int contactNo;
	private LocalDate dob;

	
	public UserDto() {
		// TODO Auto-generated constructor stub
	}

	public UserDto(String uname, String email, String password, String city, int contactNo) {
		super();
		this.uname = uname;
		this.email = email;
		this.password = password;
		this.city = city;
		this.contactNo = contactNo;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getContactNo() {
		return contactNo;
	}
	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}

	
	
	
	
	
	
}
