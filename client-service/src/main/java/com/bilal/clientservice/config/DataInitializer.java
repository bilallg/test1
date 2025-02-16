package com.bilal.clientservice.config;

import com.bilal.clientservice.entity.Client;
import com.bilal.clientservice.repository.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

    @Bean
    public CommandLineRunner initData(ClientRepository clientRepository) {
        return args -> {
            clientRepository.save(new Client("Alice Johnson", "alice@example.com", "123456789"));
            clientRepository.save(new Client("Bob Smith", "bob@example.com", "987654321"));
            System.out.println("Clients initialized.");
        };
    }
}
