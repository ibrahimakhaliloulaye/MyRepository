package com.example.banque.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.banque.dao.ClientRepository;
import com.example.banque.entities.Client;

//composant spring @service or @componant 
@Service
public class ClientMetierImpl implements ClientMetier {

	//injection of the bean
	@Autowired
	ClientRepository clientRepository;
	@Override
	public Client saveClient(Client c) {
		// TODO Auto-generated method stub
		return clientRepository.save(c);
	}

	@Override
	public Iterable<Client> listClient() {
		// TODO Auto-generated method stub
		return clientRepository.findAll();
	}

}
