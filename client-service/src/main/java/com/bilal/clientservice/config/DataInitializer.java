package com.bilal.clientservice.config;

import com.bilal.clientservice.entity.Client;
import com.bilal.clientservice.repository.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class DataInitializer {

    @Bean
    public CommandLineRunner initData(ClientRepository clientRepository, BCryptPasswordEncoder passwordEncoder) {
        return args -> {
            clientRepository.save(new Client("Alice Johnson", "alice@example.com", "123456789", passwordEncoder.encode("password123")));
            clientRepository.save(new Client("Bob Smith", "bob@example.com", "987654321", passwordEncoder.encode("securepass")));

            System.out.println("Clients initialized.");
        };
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
