package com.matheus.EstoqueAPI.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.matheus.EstoqueAPI.entity.Produto;
import com.matheus.EstoqueAPI.repository.ProdutoRepository;
import com.matheus.EstoqueAPI.service.ProdutoService;


@Controller
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private ProdutoService produtoService;
	
	@RequestMapping(
			value = "/cadastrarproduto", consumes = "application/json", method = RequestMethod.POST)
	@ResponseBody
	public Produto cadastraProduto(@RequestBody Produto produto) {
		return produtoService.cadastrarProduto(produto);
	}
	
	@RequestMapping(
			value = "/listarprodutos",method = RequestMethod.GET)
	@ResponseBody
	public ArrayList<Produto> getProdutos(){
		ArrayList<Produto> produtos = (ArrayList<Produto>) produtoRepository.findAll(); 
		return produtos;
	}

}
