package com.example.demo.Servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Habilidades;
import com.example.demo.repository.RHabilidades;

import jakarta.transaction.Transactional;

@Transactional
@Service
public class SHabilidades {
	@Autowired
	RHabilidades rHabilidades;

	public List<Habilidades> list() {
		return rHabilidades.findAll();
	}

	public Optional<Habilidades> getOne(int id) {
		return rHabilidades.findById(id);
	}

	public Optional<Habilidades> getByNombre(String nombre) {
		return rHabilidades.findByNombre(nombre);
	}

	public void save(Habilidades skill) {
		rHabilidades.save(skill);

	}

	public void delete(int id) {
		rHabilidades.deleteById(id);
	}

	public boolean existsById(int id) {
		return rHabilidades.existsById(id);
	}

	public boolean existsByNombre(String nombre) {
		return rHabilidades.existsByNombre(nombre);
	}

}
