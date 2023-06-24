package com.sergio.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sergio.helpdesk.domain.Chamado;


public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
