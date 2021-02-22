package com.example.banque.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.banque.entities.Groupe;

public interface GroupeRepository extends JpaRepository<Groupe, Long>{

}
