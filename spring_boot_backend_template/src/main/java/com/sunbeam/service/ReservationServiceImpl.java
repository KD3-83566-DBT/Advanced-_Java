package com.sunbeam.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sunbeam.custom_exceptions.ResourceNotFoundException;
import com.sunbeam.dao.GuestDao;
import com.sunbeam.dao.ReservationDao;
import com.sunbeam.dao.RoomDao;
import com.sunbeam.dto.ReservationDto;
import com.sunbeam.entities.Guest;
import com.sunbeam.entities.Reservation;
import com.sunbeam.entities.Room;
@Service
@Transactional
public class ReservationServiceImpl implements ReservationService{
@Autowired
private ReservationDao reservationDao;
@Autowired
private RoomDao roomDao;
@Autowired
private GuestDao guestDao;
@Autowired
private ModelMapper modelMapper;
	@Override
	public ReservationDto addReservation(ReservationDto dto) {
		Reservation r=null;
		Room room =roomDao.findById(dto.getRoomNumber()).orElseThrow(() -> new ResourceNotFoundException("Invalid Romm id!!!"));
		if(room.isAvailability()) {
			Guest guest=guestDao.findById(dto.getGuestId()).orElseThrow(() -> new ResourceNotFoundException("Invalid Romm id!!!"));
			room.setAvailability(false);
			Reservation reservation=modelMapper.map(dto, Reservation.class);
			reservation.setRoom(room);
			reservation.setGuest(guest);
			
		 r =reservationDao.save(reservation);
		}
		
		return modelMapper.map(r, ReservationDto.class);
	}

}
