package com.regur.roomwebapp.service;

import com.regur.roomwebapp.data.RoomRepository;
import com.regur.roomwebapp.model.Room;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class RoomService {
  private final RoomRepository roomRepository;

  public RoomService(RoomRepository roomRepository) {
    this.roomRepository = roomRepository;
  }

  public List<Room> getAllRooms(){
    return roomRepository.findAll();
  }

  public Room findById(long id) {
    return roomRepository.findById(id).get();
  }
}
