package com.sunbeam.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
@Entity
@Table(name = "vehicles")
public class Vehicle extends BaseEntity {
	
	
	@NotBlank(message="Vname Should be null")
	private String vname;
	
	private Company company;
	@NotBlank(message="Vnumber Should be null")
	private String vnumber;
	@NotBlank(message="Vtype Should be null")
	private String vtype;
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name="user_id")
	private User user;
	
	
	

}
