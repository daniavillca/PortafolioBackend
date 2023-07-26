package com.example.demo.controller;

import com.example.demo.entity.Persona;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dto.dtoPersona;
import com.example.demo.Security.Enums.Controller.Mensaje;
import com.example.demo.Servicio.ImpPersonaServicio;

@RestController
@RequestMapping("/persona")
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {

	@Autowired
	ImpPersonaServicio personaServicio;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@GetMapping("/lista")
	public ResponseEntity<List<Persona>> list() {
		List<Persona> list = personaServicio.list();
		return new ResponseEntity(list, HttpStatus.OK);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ResponseEntity<Persona> getById(@PathVariable("id") String id) {
		if (!personaServicio.existsById(id)) {
			return new ResponseEntity(new Mensaje("No existe el Id"), HttpStatus.BAD_REQUEST);
		}
		Persona persona = personaServicio.getOne(id).get();
		return new ResponseEntity(persona, HttpStatus.OK);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@PutMapping("/update/{id}")
	public ResponseEntity<?> update(@PathVariable("id") String id, @RequestBody dtoPersona dtopersona) {
		if (!personaServicio.existsById(id)) {
			return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
		}
		if (personaServicio.existsByNombre(dtopersona.getNombre())
				&& personaServicio.getByNombre(dtopersona.getNombre()).get().getId() != id) {
			return new ResponseEntity(new Mensaje("Ese nombre ya existe"), HttpStatus.BAD_REQUEST);
		}
		if (StringUtils.isBlank(dtopersona.getNombre())) {
			return new ResponseEntity(new Mensaje("El campo no puede estar vacio"), HttpStatus.BAD_REQUEST);
		}

		Persona persona = personaServicio.getOne(id).get();

		persona.setNombre(dtopersona.getNombre());
		persona.setApellido(dtopersona.getApellido());
		persona.setDescripcion(dtopersona.getDescripcion());

		personaServicio.save(persona);

		return new ResponseEntity(new Mensaje("Persona actualizada"), HttpStatus.OK);
	}

}
