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
    private String password; // 🔹 Ajout du mot de passe

    // Constructeur sans ID
    public Client(String name, String email, String phone, String password) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }


// Assure-toi que les getters et setters sont bien générés
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
