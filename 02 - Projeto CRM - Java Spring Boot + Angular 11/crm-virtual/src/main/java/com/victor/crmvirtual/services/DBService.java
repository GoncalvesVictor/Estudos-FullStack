package com.victor.crmvirtual.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.victor.crmvirtual.domain.Cliente;
import com.victor.crmvirtual.domain.OS;
import com.victor.crmvirtual.domain.Tecnico;
import com.victor.crmvirtual.domain.enums.Prioridade;
import com.victor.crmvirtual.domain.enums.Status;
import com.victor.crmvirtual.repositories.ClienteRepository;
import com.victor.crmvirtual.repositories.OSRepository;
import com.victor.crmvirtual.repositories.TecnicoRepository;

@Service
public class DBService {

	@Autowired
	private TecnicoRepository tecnicoRepository;

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private OSRepository osRepository;

	public void instanciaDB() {
		Tecnico t1 = new Tecnico(null, "Victor Gonçalves", "080.713.200-48", "(99) 98888-8888");
		Tecnico t2 = new Tecnico(null, "Victor Gonçalves 2", "891.518.810-12", "(99) 98888-8888");
		Cliente c1 = new Cliente(null, "Dayra Nascimento", "512.749.200-86", "(88) 97777-7777");
		OS os1 = new OS(null, Prioridade.ALTA, "Teste Create OS", Status.ANDAMENTO, t1, c1);

		t1.getList().add(os1);
		c1.getList().add(os1);

		tecnicoRepository.saveAll(Arrays.asList(t1, t2));
		clienteRepository.saveAll(Arrays.asList(c1));

		osRepository.saveAll(Arrays.asList(os1));
	}

}
