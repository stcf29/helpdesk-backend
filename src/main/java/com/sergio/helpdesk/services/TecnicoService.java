package com.sergio.helpdesk.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sergio.helpdesk.domain.Tecnico;
import com.sergio.helpdesk.repositories.TecnicoRepository;
import com.sergio.helpdesk.services.exceptions.ObjectnotFoundException;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class TecnicoService {
	@Autowired
	private TecnicoRepository repository;
	
	public Tecnico findById(Integer id) {
		Optional<Tecnico> obj = repository.findById(id);
		return obj.orElseThrow(() -> new s("Objeto "
				+ "não encontrado! Id: " + id));
	}
}
