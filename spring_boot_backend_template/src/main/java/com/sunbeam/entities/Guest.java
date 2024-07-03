package com.sunbeam.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Table(name="guests")
@Setter
@Getter
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Guest extends BaseEntity {
	//Guest :Guest ID  first name ,last name , dob
	@Column(name="frist_name")
private String fristName;
	@Column(name="last_name")
private String lastName;
	@Column(name="")
private LocalDate dob;

}
