package com.sunbeam.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)


public class User extends BaseEntity{
	
	
	private String uname;
	
	private String email;

	private String password;
	
	private String city;

	@Column(name = "contact_no")
	private int contactNo;
	
	private LocalDate dob;
	
//	Uid (unique identifier for each User)
//	2) Uname (Cannot be Blank)
//	3) Email (Cannot be Blank)
//	4) Password (Cannot be blank, min 6 characters)
//	5) City (Cannot be Blank)
//	6) Contact_No (Cannot be blank, min 10 digit)
//	7) Birth_Date(Cannot be Blank)


	
}
