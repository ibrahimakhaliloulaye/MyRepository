package com.example.banque.metier;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.banque.dao.CompteRepository;
import com.example.banque.entities.Compte;

@Service
public class CompteMetierImpl implements CompteMetier{

	@Autowired
	CompteRepository compteRepository;
	@Override
	public Compte saveCompte(Compte cp) {
		// TODO Auto-generated method stub
		cp.setDateCreation(new Date());
		return compteRepository.save(cp);
	}

	@Override
	public Compte getCompte(String code) {
		// TODO Auto-generated method stub
		return compteRepository.getOne(code);
	}

}
