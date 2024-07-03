package com.sunbeam.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sunbeam.dao.GuestDao;
import com.sunbeam.dto.GuestDto;
import com.sunbeam.entities.Guest;

import lombok.Setter;
@Transactional
@Service
public class GuestServiceImpl implements GuestService {

	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private GuestDao guestDao;
	@Override
	public GuestDto addGuest(GuestDto dto) {
		Guest guest=modelMapper.map(dto, Guest.class);
		Guest pGuest=guestDao.save(guest);
		return modelMapper.map(pGuest,GuestDto.class );
	}

	
}
