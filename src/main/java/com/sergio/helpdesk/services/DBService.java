package com.sergio.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sergio.helpdesk.domain.Chamado;
import com.sergio.helpdesk.domain.Cliente;
import com.sergio.helpdesk.domain.Tecnico;
import com.sergio.helpdesk.domain.enums.Perfil;
import com.sergio.helpdesk.domain.enums.Prioridade;
import com.sergio.helpdesk.domain.enums.Status;
import com.sergio.helpdesk.repositories.ChamadoRepository;
import com.sergio.helpdesk.repositories.ClienteRepository;
import com.sergio.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	public void instanciaDB() {
		Tecnico tec1 = new Tecnico(null, "Sergio correa", "58483141019", "stcf29@mail.com",
				"123");
		tec1.addPerfis(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Linus Torvalds", "58878714070", "torvalds@mail.com","123");
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01",
				"primeiro chamado", tec1, cli1);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}
}
