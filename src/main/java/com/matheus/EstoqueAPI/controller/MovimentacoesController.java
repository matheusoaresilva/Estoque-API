package com.matheus.EstoqueAPI.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.matheus.EstoqueAPI.entity.Movimentacoes;
import com.matheus.EstoqueAPI.repository.MovimentacoesRepository;
import com.matheus.EstoqueAPI.service.MovimentacoesService;

@Controller
public class MovimentacoesController {
	
	@Autowired
	private MovimentacoesRepository movimentacoesRepository;
	
	@Autowired
	private MovimentacoesService movimentacoesService;
	
	@RequestMapping(
			value = "/cadastrarmovimentacao", consumes = "application/json", method = RequestMethod.POST)
	@ResponseBody
	public Movimentacoes cadastrarMovimentacoes(@RequestBody Movimentacoes movimentacoes) {
		return movimentacoesService.cadastrarProduto(movimentacoes);
	}
	
	@RequestMapping(
			value = "listarmovimentacoes", method = RequestMethod.GET)
	@ResponseBody
	public ArrayList<Movimentacoes> getMovimentacoes() {
		ArrayList<Movimentacoes> movimentacoes = (ArrayList<Movimentacoes>) movimentacoesRepository.findAll();
		return movimentacoes;
	}

}
