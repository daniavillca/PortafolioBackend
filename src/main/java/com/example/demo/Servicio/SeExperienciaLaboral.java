package com.example.demo.Servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.ExperienciaLaboral;
import com.example.demo.repository.ReExperienciaLaboral;

@Service
@Transactional
public class SeExperienciaLaboral {
	@Autowired
	

	ReExperienciaLaboral reExperienciaLaboral;

	public List<ExperienciaLaboral> list() {
		return reExperienciaLaboral.findAll();

	}

	public Optional<ExperienciaLaboral> getOne(String id) {
		return reExperienciaLaboral.findById(id);
	}

	public Optional<ExperienciaLaboral> getByNombreE(String nombreE) {
		return reExperienciaLaboral.findByNombreE(nombreE);
	}

	public void save(ExperienciaLaboral expe) {
		reExperienciaLaboral.save(expe);
	}

	public void delete(String id) {
		reExperienciaLaboral.deleteById(id);
	}

	public  boolean existsById(String id) {
		return reExperienciaLaboral.existsById(id);

	}

	public boolean existsByNombreE(String nombreE) {
		return reExperienciaLaboral.existsByNombreE(nombreE);
	}

}
