package com.sergio.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sergio.helpdesk.domain.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
