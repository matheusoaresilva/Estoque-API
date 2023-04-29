package com.matheus.EstoqueAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matheus.EstoqueAPI.entity.Movimentacoes;
import com.matheus.EstoqueAPI.repository.MovimentacoesRepository;


@Service
public class MovimentacoesService {

	@Autowired
	private MovimentacoesRepository repository;
	
	public Movimentacoes cadastrarProduto(Movimentacoes movimentacoes) {
		return repository.save(movimentacoes);
	}
}
