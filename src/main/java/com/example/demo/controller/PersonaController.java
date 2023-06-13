package com.example.demo.controller;

import com.example.demo.entity.Persona;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Interface.IPersonaServicio;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {

	@Autowired
	IPersonaServicio ipersonaServicio;

	@GetMapping("persona/traer")
	public List<Persona> getPersona() {
		return ipersonaServicio.getPersona();
	}

	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping("/persona/crear")
	public String createPersona(@RequestBody Persona persona) {
		ipersonaServicio.savePersona(persona);
		return "la persona fue creada correctamente";
	}

	@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("/persona/borrar/{id}")
	public String deletePersona(@PathVariable String id) {
		ipersonaServicio.deletePersona(id);
		return "la persona fue eliminada correctamente";
	}

	@PreAuthorize("hasRole('ADMIN')")
	@PutMapping("/persona/editar/{id}")
	public Persona editPersona(@PathVariable String id, @RequestParam("nombre") String nuevoNombre,
			@RequestParam("apellido") String nuevoApellido, @RequestParam("Telefono") String nuevoTelefono) {

		Persona persona = ipersonaServicio.findPersona(id);

		persona.setNombre(nuevoNombre);
		persona.setApellido(nuevoApellido);
		persona.setTelefono(nuevoTelefono);
		ipersonaServicio.savePersona(persona);
		return persona;
	}

}
