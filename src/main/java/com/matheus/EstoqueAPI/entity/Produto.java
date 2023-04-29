package com.matheus.EstoqueAPI.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "produto")
@Entity(name = "produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Integer codigoBarras;
	
	private String nome;
	
	private Integer quantidadeMinima;
	
	private Integer saldoInicial;
	

	public Produto() {
	}

	public Produto(Long id, Integer codigoBarras, String nome, Integer quantidadeMinima, Integer saldoInicial) {
		this.id = id;
		this.codigoBarras = codigoBarras;
		this.nome = nome;
		this.quantidadeMinima = quantidadeMinima;
		this.saldoInicial = saldoInicial;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(Integer codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidadeMinima() {
		return quantidadeMinima;
	}

	public void setQuantidadeMinima(Integer quantidadeMinima) {
		this.quantidadeMinima = quantidadeMinima;
	}

	public Integer getSaldoInicial() {
		return saldoInicial;
	}

	public void setSaldoInicial(Integer saldoInicial) {
		this.saldoInicial = saldoInicial;
	}
	
	

}
