package com.sunbeam.service;



import java.util.List;

import com.sunbeam.dto.RoomDto;

public interface RoomService {
	RoomDto addroom(RoomDto dto);
	List<RoomDto> avilableRoom();
}
