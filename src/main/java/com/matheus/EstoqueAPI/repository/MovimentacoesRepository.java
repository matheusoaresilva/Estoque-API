package com.matheus.EstoqueAPI.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matheus.EstoqueAPI.entity.Movimentacoes;

@Repository
public interface MovimentacoesRepository extends JpaRepository<Movimentacoes, Long>{
	void deleteById(Long id);
	Optional<Movimentacoes> findById(Long id);
}
