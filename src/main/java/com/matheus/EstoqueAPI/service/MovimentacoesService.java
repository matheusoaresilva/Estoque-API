package com.matheus.EstoqueAPI.service;

import java.util.Optional;

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
	
	public Optional<Movimentacoes> findMovimentacaoById(Long id) {
		return repository.findById(id);
	}
	
	public void deleteMovimentacaoById(Long id) {
		repository.deleteById(id);
	}
	
	
}
