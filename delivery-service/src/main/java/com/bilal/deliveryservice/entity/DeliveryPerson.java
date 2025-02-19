package com.bilal.deliveryservice.entity;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor

@Getter
@Setter
@Entity
public class DeliveryPerson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String phone;
    private String email;
    private String vehicleDetails;

    public DeliveryPerson(Long id, String name, String phone, String email, String vehicleDetails) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.vehicleDetails = vehicleDetails;
    }
}
