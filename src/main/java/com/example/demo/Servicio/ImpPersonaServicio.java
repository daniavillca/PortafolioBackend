package com.example.demo.Servicio;

import com.example.demo.entity.Persona;
import com.example.demo.repository.IPersonaRepository;

import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ImpPersonaServicio {
	@Autowired
	IPersonaRepository ipersonaRepository;

	public List<Persona> list() {
		return ipersonaRepository.findAll();

	}

	public Optional<Persona> getByNombre(String nombre) {
		return ipersonaRepository.findByNombre(nombre);
	}

	public void save(Persona persona) {
		ipersonaRepository.save(persona);
	}

	public void delete(String id) {
		ipersonaRepository.deleteById(id);
	}

	public boolean existsById(String id) {
		return ipersonaRepository.existsById(id);
	}

	public boolean existsByNombre(String nombre) {
		return ipersonaRepository.existsByNombre(nombre);
	}

	public Optional<Persona> getOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}