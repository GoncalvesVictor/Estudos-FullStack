package com.victor.crmvirtual.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victor.crmvirtual.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
