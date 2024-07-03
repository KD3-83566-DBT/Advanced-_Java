package com.sunbeam.dto;

import java.time.LocalDate;

import javax.persistence.Column;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class GuestDto {

	private String fristName;

	private String lastName;

	private LocalDate dob;
}
