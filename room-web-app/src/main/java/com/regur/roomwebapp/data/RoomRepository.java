package com.regur.roomwebapp.data;

import com.regur.roomwebapp.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {

}
