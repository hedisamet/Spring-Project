package com.example.demo;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.Publication;
import com.example.demo.repository.PublicationRepository;

import lombok.AllArgsConstructor;

@SpringBootApplication
@AllArgsConstructor
public class PublicationServiceApplication implements CommandLineRunner {

    private final PublicationRepository publicationRepository;

    public static void main(String[] args) {
        SpringApplication.run(PublicationServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Ajout de deux publications
        publicationRepository.save(new Publication(
                "Research",
                "AI in Healthcare",
                "https://example.com/ai-healthcare",
                new Date(),
                "ai_healthcare.pdf"
        ));

        publicationRepository.save(new Publication(
                "Survey",
                "Blockchain Security",
                "https://example.com/blockchain-security",
                new Date(),
                "blockchain_security.pdf"
        ));

        System.out.println("Publications ajoutées avec succès !");
    }
}
