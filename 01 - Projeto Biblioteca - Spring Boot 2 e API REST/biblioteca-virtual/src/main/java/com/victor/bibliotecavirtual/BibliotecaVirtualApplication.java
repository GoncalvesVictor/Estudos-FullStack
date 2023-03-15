package com.victor.bibliotecavirtual;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.victor.bibliotecavirtual.domain.Usuario;
import com.victor.bibliotecavirtual.repositories.UsuarioRepository;

@SpringBootApplication
public class BibliotecaVirtualApplication implements CommandLineRunner{
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(BibliotecaVirtualApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Usuario u1 = new Usuario(null, "Victor Gonçalves", "victor", "123");
		Usuario u2 = new Usuario(null, "Dayra Francielle", "dayra", "123");
		
		usuarioRepository.saveAll(Arrays.asList(u1,u2));
		
	}

}
