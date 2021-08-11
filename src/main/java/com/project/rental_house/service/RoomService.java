package com.project.rental_house.service;

import com.project.rental_house.model.Account;
import com.project.rental_house.model.Room;
import com.project.rental_house.repository.AccountRepository;
import com.project.rental_house.repository.RoomRepository;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class RoomService {
    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public List<Room> findAll() {
        List<Room> list = roomRepository.findAll();

        if (list.isEmpty()) throw new ResourceNotFoundException("Khong co tai khoan nao");
        return list;
    }
}

