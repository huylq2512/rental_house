package com.project.rental_house.controller;

import com.project.rental_house.model.Room;
import com.project.rental_house.service.RoomService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/room")
public class RoomController {
    private RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping("")
    public ResponseEntity<List<Room>> findAll() {
        List<Room> list = roomService.findAll();
        return ResponseEntity.ok(list);
    }
}
