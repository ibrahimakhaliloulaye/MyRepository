package com.example.banque.metier;

import java.util.List;

import com.example.banque.entities.Client;


public interface ClientMetier {

	public Client saveClient(Client c);
	public Iterable<Client> listClient();
}
