package com.example.demo.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Evenement;

import lombok.AllArgsConstructor;


public interface IEvenementService {
	// CRUD sur les Evenements
    public Evenement addEvenement(Evenement e);

    public void deleteEvenement(Long id);

    public Evenement updateEvenement(Evenement e);

    public Evenement findEvenement(Long id);

    public List<Evenement> findAll();

    List<Evenement> findByDate(Date date);
	List<Evenement> findByLieu(String lieu);
	Evenement findByTitre(String titre);
}
