package com.sunbeam.dto;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

import com.sunbeam.entity.Company;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class VehicleDto {

	@NotBlank(message = "Vanme should not be blank......")
	private String vname;
	private Company company;
	@NotBlank(message = "vNumber is must ......")
	private String vnumber;
	@NotBlank(message = "vType is must .......")
	private String vtype;
	private Long userId;
	
}
