package com.victor.bibliotecavirtual.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victor.bibliotecavirtual.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
