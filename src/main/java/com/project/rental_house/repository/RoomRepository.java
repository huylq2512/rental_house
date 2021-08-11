package com.project.rental_house.repository;

import com.project.rental_house.model.Account;
import com.project.rental_house.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RoomRepository extends JpaRepository<Room, Long > {

}
