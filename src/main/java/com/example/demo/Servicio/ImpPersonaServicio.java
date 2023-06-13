package com.example.demo.Servicio;

import com.example.demo.Interface.IPersonaServicio;
import com.example.demo.entity.Persona;
import com.example.demo.repository.IPersonaRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaServicio implements IPersonaServicio {
	@Autowired
	IPersonaRepository ipersonaRepository;

	// Lista
	@Override
	public List<Persona> getPersona() {
		List<Persona> persona = ipersonaRepository.findAll();
		return persona;
	}

	// guardar
	@Override
	public void savePersona(Persona persona) {
		ipersonaRepository.save(persona);

	}

	// eliminar
	public void delete(String id) {
		ipersonaRepository.deleteById(id);

	}

	// buscar
	public Persona findPersona(String id) {
		Persona persona = ipersonaRepository.findById(id).orElse(null);
		return persona;

	}

	@Override
	public void deletePersona(String id) {
		// TODO Auto-generated method stub

	}

}