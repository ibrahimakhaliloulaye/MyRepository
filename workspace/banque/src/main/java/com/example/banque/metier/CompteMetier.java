package com.example.banque.metier;

import com.example.banque.entities.Compte;

public interface CompteMetier {

	public Compte saveCompte(Compte cp);
	public Compte getCompte(String code);
}
