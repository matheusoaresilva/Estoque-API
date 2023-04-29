package com.matheus.EstoqueAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matheus.EstoqueAPI.entity.Produto;
import com.matheus.EstoqueAPI.repository.ProdutoRepository;


@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repository;
	
	public Produto cadastrarProduto(Produto produto) {
		return repository.save(produto);
	}
}
