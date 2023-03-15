package com.victor.bibliotecavirtual.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.victor.bibliotecavirtual.domain.Usuario;
import com.victor.bibliotecavirtual.repositories.UsuarioRepository;
import com.victor.bibliotecavirtual.services.exceptions.ObjectNotFoundException;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;

	public Usuario findByid(Integer id) {
		Optional<Usuario> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Usuario.class.getName()));
	}

	public List<Usuario> findAll() {
		return repository.findAll();
	}

	public Usuario update(Integer id, Usuario obj) {
		Usuario newObj = findByid(id);
		newObj.setNome(obj.getNome());
		newObj.setLogin(obj.getLogin());
		newObj.setSenha(obj.getSenha());
		return repository.save(newObj);
	}

	public Usuario create(Usuario obj) {
		obj.setId(null);
		return repository.save(obj);
	}

	public void delete(Integer id) {
		findByid(id);
		repository.deleteById(id);
	}
}
