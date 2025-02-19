package com.bilal.clientservice.repository;

import com.bilal.clientservice.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client, Long> {
    Optional<Client> findByEmail(String email);

    @Query("SELECT c FROM Client c WHERE c.email = :email AND c.password = :password")
    Optional<Client> findByEmailAndPassword(@Param("email") String email, @Param("password") String password);
}
