package com.example.banque.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.banque.entities.Client;

public interface ClientRepository extends CrudRepository<Client, Long> {

}
