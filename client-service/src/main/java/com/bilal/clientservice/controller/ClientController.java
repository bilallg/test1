package com.bilal.clientservice.controller;

import com.bilal.clientservice.entity.Client;
import com.bilal.clientservice.repository.ClientRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/client")
@CrossOrigin(origins = "http://localhost:63342") // Autoriser les requêtes du front-end


public class ClientController {

    private final ClientRepository clientRepository;

    public ClientController(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody Client client) {
        if (clientRepository.findByEmail(client.getEmail()).isPresent()) {
            return ResponseEntity.badRequest().body("Email déjà utilisé.");
        }
        clientRepository.save(client);
        return ResponseEntity.ok(client);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Client client) {
        Optional<Client> existingClient = clientRepository.findByEmailAndPassword(client.getEmail(), client.getPassword());

        // Vérification si un client est trouvé
        if (existingClient.isPresent()) {
            return ResponseEntity.ok(existingClient.get()); // Retourne le client
        } else {
            return ResponseEntity.status(401).body("Email ou mot de passe incorrect"); // Retourne un message d'erreur
        }
    }
}
