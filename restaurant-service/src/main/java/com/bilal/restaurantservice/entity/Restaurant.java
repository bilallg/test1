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
    private String password;  // Ajout du mot de passe

    public Restaurant(String name, String address, String phone, String password) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.password = password;
    }
}
