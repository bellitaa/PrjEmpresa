package com.ex.bellita.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ex.bellita.entities.Funcionario;

import com.ex.bellita.repositories.FuncionarioRepository;
@Service
public class FuncionarioService {
	
			private FuncionarioRepository  funcionarioRepository;
			@Autowired
			private FuncionarioService(FuncionarioRepository funcionarioRepository)  {
				this.funcionarioRepository = funcionarioRepository;
			}
			
			public Funcionario getDependenteById(Long Id) {
				return funcionarioRepository.findById(Id).orElse(null);
			}
			
			public List<Funcionario> getAllFuncionarios(){
				return funcionarioRepository.findAll();
			}
			
			public Funcionario saveDepartamento(Funcionario funcionario) {
				return funcionarioRepository.save(funcionario);
			}

		}

