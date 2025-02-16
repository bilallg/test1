package com.bilal.restaurantservice.entity;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String address;
    private String phone;

    // Constructeur sans ID pour éviter le problème
    public Restaurant(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
}
