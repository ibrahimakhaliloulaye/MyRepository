package com.example.banque.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.banque.dao.EmployeRepository;
import com.example.banque.entities.Employe;

@Service
public class EmployeMetierImpl implements EmployeMetier{

	@Autowired
	EmployeRepository employeRepository;
	@Override
	public Employe save(Employe e) {
		// TODO Auto-generated method stub
		return employeRepository.save(e);
	}

	@Override
	public List<Employe> listEmployes() {
		// TODO Auto-generated method stub
		return employeRepository.findAll();
	}

}
