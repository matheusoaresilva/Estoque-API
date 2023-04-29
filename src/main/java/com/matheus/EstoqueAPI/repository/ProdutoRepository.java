package com.matheus.EstoqueAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matheus.EstoqueAPI.entity.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	Produto findByCodigoBarras(Integer codigoBarras);
	Produto deleteByCodigoBarras(Integer codigoBarras);
}
