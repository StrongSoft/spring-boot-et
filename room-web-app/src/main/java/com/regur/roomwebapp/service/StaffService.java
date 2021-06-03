package com.regur.roomwebapp.service;

import com.regur.roomwebapp.model.Position;
import com.regur.roomwebapp.model.StaffMember;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
public class StaffService {
  private static final List<StaffMember> staff = new ArrayList<>();

  static {
    staff.add(new StaffMember(UUID.randomUUID().toString(), "John", "Doe", Position.CONCIERGE));
    staff.add(new StaffMember(UUID.randomUUID().toString(), "Jane", "Doe", Position.FRONT_DESK));
    staff.add(new StaffMember(UUID.randomUUID().toString(), "Oliver", "Handle", Position.SECURITY));
    staff.add(new StaffMember(UUID.randomUUID().toString(), "Sammy", "Smith", Position.HOUSEKEEPING));
  }

  public List<StaffMember> getAllStaff() {
    return staff;
  }
}
