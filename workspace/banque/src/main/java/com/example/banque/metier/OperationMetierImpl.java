package com.example.banque.metier;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.banque.dao.CompteRepository;
import com.example.banque.dao.EmployeRepository;
import com.example.banque.dao.OperationRepository;
import com.example.banque.entities.Compte;
import com.example.banque.entities.Employe;
import com.example.banque.entities.Operation;
import com.example.banque.entities.Retrait;
import com.example.banque.entities.Versement;

@Service
public class OperationMetierImpl implements OperationMetier{

	@Autowired
	private OperationRepository operationRepository;
	@Autowired
	private CompteRepository compteRepository;
	@Autowired
	private EmployeRepository employeRepository;
	
	@Override
	@Transactional
	public boolean verser(String code, double montant, Long codeEmp) {
		// TODO Auto-generated method stub
		Compte cp = compteRepository.getOne(code);
		Employe e = employeRepository.getOne(codeEmp);
		Operation o = new Versement();
		o.setDateOperation(new Date());
		o.setMontant(montant);
		o.setCompte(cp);
		o.setEmploye(e);
		operationRepository.save(o);
		cp.setSolde(cp.getSolde()+montant);
		
		return true;
	}

	@Override
	@Transactional
	public boolean retirer(String code, double montant, Long codeEmp) {
		// TODO Auto-generated method stub
		Compte cp = compteRepository.getOne(code);
		Employe e = employeRepository.getOne(codeEmp);
		Operation o = new Retrait();
		o.setDateOperation(new Date());
		o.setMontant(montant);
		o.setCompte(cp);
		o.setEmploye(e);
		operationRepository.save(o);
		cp.setSolde(cp.getSolde()-montant);
		
		return true;	}

	@Override
	public boolean virement(String cpte1, String cpte2, double montant, Long codeEmp) {
		// TODO Auto-generated method stub
		retirer(cpte1, montant, codeEmp);
		verser(cpte2, montant, codeEmp);
		return true;
	}

}
