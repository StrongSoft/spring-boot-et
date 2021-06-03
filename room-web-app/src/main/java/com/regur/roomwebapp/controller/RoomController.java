package com.regur.roomwebapp.controller;

import com.regur.roomwebapp.model.Room;
import com.regur.roomwebapp.service.RoomService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/rooms")
public class RoomController {
  private final RoomService roomService;

  @Autowired
  public RoomController(RoomService roomService) {
    this.roomService = roomService;
  }

  @GetMapping
  public String getAll(Model model){
    List<Room> rooms = roomService.getAllRooms();
    model.addAttribute("rooms", rooms);
    return "rooms";
  }

}
