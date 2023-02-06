package com.digitalinnovation.gof.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.digitalinnovation.gof.model.Cliente;

@Service
public interface ClienteService {

	Iterable<Cliente> buscarTodos();
	
	Cliente buscarPorId(Long id);
	
	void inserir(Cliente cliente);
	
	void atualizar(Long id, Cliente cliente);
	
	void deletar(Long id);
}
