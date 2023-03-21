package com.victor.crmvirtual.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.victor.crmvirtual.domain.Tecnico;
import com.victor.crmvirtual.repositories.TecnicoRepository;
import com.victor.crmvirtual.services.exceptions.ObjectNotFoundException;

@Service
public class TecnicoService {

	@Autowired
	private TecnicoRepository repository;

	public Tecnico findById(Integer id) {
		Optional<Tecnico> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! ID: " + id + ", TIPO: " + Tecnico.class.getName()));
	}

}
