package com.example.banque.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.banque.entities.Client;
import com.example.banque.metier.ClientMetier;

@RestController
public class ClientRestService {

	@Autowired
	ClientMetier clientMetier;
	
    @RequestMapping(value = "/clients",method = RequestMethod.POST)
	public Client saveClient(@RequestBody Client c) {
		return clientMetier.saveClient(c);
	}
    @RequestMapping(value = "/clients",method = RequestMethod.GET)
	public Iterable<Client> listClient() {
		return clientMetier.listClient();
	}
	
}
