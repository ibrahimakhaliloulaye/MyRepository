package com.example.banque.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.banque.entities.Operation;

public interface OperationRepository extends JpaRepository<Operation, Long> {

}
