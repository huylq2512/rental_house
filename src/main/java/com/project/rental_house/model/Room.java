package com.project.rental_house.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Data

@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Room {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String nameRoom;

    @Column(nullable = false)
    private String contract;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idHouse")
    @JsonIgnore
    private House house;

}