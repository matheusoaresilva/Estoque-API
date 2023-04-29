package com.matheus.EstoqueAPI.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.matheus.EstoqueAPI.enums.TipoMovimento;

@Table(name = "movimentacoes")
@Entity(name = "movimentacoes")
public class Movimentacoes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Integer quantidade;

	private LocalDate data;

	private String motivo;

	private String documento;

	@ManyToOne
	@JoinColumn(name = "produto_id")
	private Produto produto;

	
	private TipoMovimento tipoMovimento;

	public Movimentacoes() {
	}


	public Movimentacoes(Long id, Integer quantidade, LocalDate data, String motivo, String documento, Produto produto,
			TipoMovimento tipoMovimento) {
		this.id = id;
		this.quantidade = quantidade;
		this.data = data;
		this.motivo = motivo;
		this.documento = documento;
		this.produto = produto;
		this.tipoMovimento = tipoMovimento;
	}


	public TipoMovimento getTipoMovimento() {
		return tipoMovimento;
	}


	public void setTipoMovimento(TipoMovimento tipoMovimento) {
		this.tipoMovimento = tipoMovimento;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

}
