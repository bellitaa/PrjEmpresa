package com.ex.bellita.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ex.bellita.entities.Dependente;

import com.ex.bellita.repositories.DependenteRepository;

@Service
public class DependenteService {

		private DependenteRepository  dependenteRepository;
		@Autowired
		private DependenteService(DependenteRepository dependenteRepository)  {
			this.dependenteRepository = dependenteRepository;
		}
		
		public Dependente getDependenteById(Long Id) {
			return dependenteRepository.findById(Id).orElse(null);
		}
		
		public List<Dependente> getAllDependentes(){
			return dependenteRepository.findAll();
		}
		
		public Dependente saveDepartamento(Dependente dependente) {
			return dependenteRepository.save(dependente);
		}

	}

