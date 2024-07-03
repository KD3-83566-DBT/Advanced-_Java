package com.sunbeam.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString(callSuper = true)
@Table(name="customers")
@NoArgsConstructor
public class Customer extends BaseEntity {

private int number;
private String fristName;
private String lastName;
private String type;
private double totalMilk;

public Customer(int number, String fristName, String lastName, String type, double totalMilk) {
	super();
	//@Column(name = "name", length = 30, unique = true)
	this.number = number;
	this.fristName = fristName;
	this.lastName = lastName;
	this.type = type;
	this.totalMilk = totalMilk;
}

}
