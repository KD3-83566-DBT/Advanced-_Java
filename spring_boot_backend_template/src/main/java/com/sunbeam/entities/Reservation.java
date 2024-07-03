package com.sunbeam.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Getter
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Table(name="reservations")
@Setter
public class Reservation  extends BaseEntity{
//Reservation:Reservation ID, guest id, check-in date, check-out date, room ID, total price.
	@Column(name="checkIn_date")
	private LocalDate checkIn;
	@Column(name="checkOut_date")
	private LocalDate checkout;
	private double totalPrice;
	@ManyToOne
	@JoinColumn(name="guest_id")
	private Guest guest;
	@ManyToOne
	@JoinColumn(name="room_id")
	private Room room;
	
	
}
