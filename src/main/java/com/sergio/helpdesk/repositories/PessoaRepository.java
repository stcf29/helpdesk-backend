package com.sergio.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sergio.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
