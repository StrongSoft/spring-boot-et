package com.regur.roomwebapp.controller;

import com.regur.roomwebapp.model.Room;
import com.regur.roomwebapp.service.RoomService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rooms")
public class RoomRestController {
  private final RoomService roomService;

  public RoomRestController(RoomService roomService) {
    this.roomService = roomService;
  }

  @GetMapping
  public List<Room> getAllRooms(){
    return roomService.getAllRooms();
  }
}
