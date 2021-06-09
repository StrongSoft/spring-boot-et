package com.regur.roomwebapp.controller;

import com.regur.roomwebapp.model.StaffMember;
import com.regur.roomwebapp.service.StaffService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/staff")
public class StaffRestController {
  private final StaffService staffService;

  public StaffRestController(StaffService staffService) {
    this.staffService = staffService;
  }

  @GetMapping
  public List<StaffMember> getAllStaff(){
    return staffService.getAllStaff();
  }
}
