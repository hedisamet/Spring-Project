package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Publication;

public interface PublicationRepository extends JpaRepository<Publication, Long> { // Interface
    List<Publication> findByType(String type);
    Publication findByTitre(String titre);
    Publication findByLien(String lien);
}
