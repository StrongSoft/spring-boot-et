package com.regur.roomwebapp.data;

import com.regur.roomwebapp.model.StaffMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffMemberRepository extends JpaRepository<StaffMember, String> {

}
