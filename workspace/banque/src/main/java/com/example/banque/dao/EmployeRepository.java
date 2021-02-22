package com.example.banque.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.banque.entities.Employe;

public interface EmployeRepository extends JpaRepository<Employe, Long> {

}
