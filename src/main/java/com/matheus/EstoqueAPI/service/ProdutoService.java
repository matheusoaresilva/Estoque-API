package com.matheus.EstoqueAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matheus.EstoqueAPI.entity.Produto;
import com.matheus.EstoqueAPI.exception.CodigoDeBarrasExistenteException;
import com.matheus.EstoqueAPI.repository.ProdutoRepository;


@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	
	public Produto cadastrarProduto(Produto produto) {
		Produto produtoExistente = produtoRepository.findByCodigoBarras(produto.getCodigoBarras());
		if (produtoExistente != null) {
			throw new CodigoDeBarrasExistenteException("Codigo de barras existente!");
		}
		
		return produtoRepository.save(produto);
	}
	
	public Produto findByCodigoBarras(Integer codigoBarras) {
		return produtoRepository.findByCodigoBarras(codigoBarras);
	}
	
	public void deleteByCodigoBarras(Integer codigoBarras) {
		Produto produto = produtoRepository.findByCodigoBarras(codigoBarras);
		produtoRepository.delete(produto);
	}
}
