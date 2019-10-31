package com.meuposto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meuposto.model.Abastecimento;

@Repository
public interface AbastecimentoRepository extends JpaRepository<Abastecimento, Integer> {

}
