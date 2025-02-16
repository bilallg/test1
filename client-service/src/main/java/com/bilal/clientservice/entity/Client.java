package com.bilal.clientservice.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String phone;
    // Constructeur sans ID pour éviter le problème
    public Client(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;}
}
