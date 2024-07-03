package com.sunbeam.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sunbeam.entities.Room;

public interface RoomDao extends JpaRepository<Room, Long> {
	@Query("select new com.sunbeam.dto.UserDetails(firstName,lastName,dob,regAmount) from User u  where u.userAddress.city=:city")
	List<Room> fetchAvilableRoom (LocalDate date);
}
