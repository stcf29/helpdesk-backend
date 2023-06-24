package com.sergio.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sergio.helpdesk.domain.Tecnico;


public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
