package com.sunbeam.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import com.fasterxml.jackson.core.sym.Name;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Setter
@Table(name="Rooms")
public class Room extends BaseEntity {
@Column(name="room_no",unique=true)
private Long roomNo;
@Enumerated(EnumType.STRING)
private TypeRoom type;
private double price;
private boolean availability;

}
