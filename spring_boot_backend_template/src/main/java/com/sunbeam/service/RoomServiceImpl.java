package com.sunbeam.service;


import java.time.LocalDate;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sunbeam.dao.RoomDao;
import com.sunbeam.dto.RoomDto;
import com.sunbeam.entities.Room;
@Service
@Transactional
public class RoomServiceImpl implements RoomService {
@Autowired
private ModelMapper modelMapper;
@Autowired
private RoomDao roomDao;
	@Override
	public RoomDto addroom(RoomDto dto) {
		Room room=modelMapper.map(dto, Room.class);
		Room parsistantRoom=roomDao.save(room);
		return modelMapper.map(parsistantRoom, RoomDto.class);
		
	}
	@Override
	public List<RoomDto> avilableRoom() {
		
		return null;
	}
	

}
