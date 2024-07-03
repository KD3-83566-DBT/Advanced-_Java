package com.sunbeam.entities;

import java.time.LocalDate;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name="users")
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
//@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
@Column(name="frist_name",length = 25)
private String firstName;
@Column(name="last_name",length = 25)
private String lastName;
@Column(length = 20,unique=true)
private String email;
@Column(length = 25,nullable = false) 
private String password;
private LocalDate dob;
@Column(name="reg_amount")
private double regAmount;
@Enumerated(EnumType.STRING)
@Column(length = 20)
private Role role;
@Lob 
private byte[] image;
public User(String firstName, String lastName, 
		String email, String password, LocalDate dob, double regAmount,
		Role role) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.password = password;
	this.dob = dob;
	this.regAmount = regAmount;
	this.role = role;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getFristName() {
	return firstName;
}
public void setFristName(String fristName) {
	this.firstName = fristName;
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
public LocalDate getDob() {
	return dob;
}
public void setDob(LocalDate dob) {
	this.dob = dob;
}
public double getRegAmount() {
	return regAmount;
}
public void setRegAmount(double regAmount) {
	this.regAmount = regAmount;
}
public Role getRole() {
	return role;
}
public void setRole(Role role) {
	this.role = role;
}
public byte[] getImage() {
	return image;
}
public void setImage(byte[] image) {
	this.image = image;
}
@Override
public String toString() {
	return "User [id=" + id + ", fristName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", password="
			+ password + ", dob=" + dob + ", regAmount=" + regAmount + ", role=" + role + ", image="
			+ Arrays.toString(image) + "]";
}

}
