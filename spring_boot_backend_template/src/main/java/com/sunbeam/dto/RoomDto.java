package com.sunbeam.dto;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.sunbeam.entities.TypeRoom;

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
public class RoomDto {
	private Long roomNo;
	private TypeRoom type;
	private double price;
	private boolean availability;

}
