package com.matheus.EstoqueAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matheus.EstoqueAPI.entity.Produto;

@Repository
public interface MovimentacoesRepository extends JpaRepository<Produto, Long>{

}
