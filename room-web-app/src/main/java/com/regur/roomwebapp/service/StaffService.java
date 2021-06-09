package com.regur.roomwebapp.service;

import com.regur.roomwebapp.data.StaffMemberRepository;
import com.regur.roomwebapp.model.StaffMember;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class StaffService {
  private final StaffMemberRepository staffMemberRepository;

  public StaffService(StaffMemberRepository staffMemberRepository) {
    this.staffMemberRepository = staffMemberRepository;
  }

  public List<StaffMember> getAllStaff() {
    return staffMemberRepository.findAll();
  }
}
