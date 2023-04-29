package com.matheus.EstoqueAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matheus.EstoqueAPI.entity.Produto;
import com.matheus.EstoqueAPI.exception.CodigoDeBarrasExistenteException;
import com.matheus.EstoqueAPI.repository.ProdutoRepository;


@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repository;
	
	public Produto cadastrarProduto(Produto produto) {
		Produto produtoExistente = repository.findByCodigoBarras(produto.getCodigoBarras());
		if (produtoExistente != null) {
			throw new CodigoDeBarrasExistenteException("Codigo de barras existente!");
		}
		return repository.save(produto);
	}
}
