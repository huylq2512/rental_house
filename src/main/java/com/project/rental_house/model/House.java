package com.project.rental_house.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

@Data

@NoArgsConstructor
@AllArgsConstructor
@Entity
public class House {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String address;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "house")
    @JsonIgnore
    private Set<Room> listRoom = new HashSet<>();
}