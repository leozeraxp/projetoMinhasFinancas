package com.minhasfinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minhasfinancas.model.entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{

}
