package com.example.banque.metier;

import java.util.List;

import com.example.banque.entities.Employe;

public interface EmployeMetier {

	public Employe save(Employe e);
	public List<Employe> listEmployes();
}
