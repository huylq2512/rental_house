package com.project.rental_house.repository;

import com.project.rental_house.model.Account;
import com.project.rental_house.model.House;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface HouseRepository extends JpaRepository<House, Long > {

}
