package com.example.banque.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.banque.entities.Compte;

public interface CompteRepository extends JpaRepository<Compte, String>{

}
