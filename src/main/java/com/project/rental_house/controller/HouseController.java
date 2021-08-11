package com.project.rental_house.controller;

import com.project.rental_house.model.House;
import com.project.rental_house.service.HouseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/house")
public class HouseController {
    private HouseService houseService;

    public HouseController(HouseService houseService) {
        this.houseService = houseService;
    }

    @GetMapping("")
    public ResponseEntity<List<House>> findAll() {
        List<House> list = houseService.findAll();
        return ResponseEntity.ok(list);
    }
}
