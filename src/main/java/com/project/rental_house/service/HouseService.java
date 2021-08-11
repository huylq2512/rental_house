package com.project.rental_house.service;

import com.project.rental_house.model.Account;
import com.project.rental_house.model.House;
import com.project.rental_house.repository.AccountRepository;
import com.project.rental_house.repository.HouseRepository;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class HouseService {
    private final HouseRepository houseRepository;

    public HouseService(HouseRepository houseRepository) {
        this.houseRepository = houseRepository;
    }

    public List<House> findAll() {
        List<House> list = houseRepository.findAll();
        if (list.isEmpty()) throw new ResourceNotFoundException("Khong co tai khoan nao");
        return list;
    }
}

