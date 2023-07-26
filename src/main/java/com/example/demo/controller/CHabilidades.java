package com.example.demo.controller;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dto.dtoHabilidades;
import com.example.demo.Security.Enums.Controller.Mensaje;
import com.example.demo.Servicio.SHabilidades;
import com.example.demo.entity.Habilidades;

@RestController
@CrossOrigin(origins = { "http:/localhost:4200" })
@RequestMapping("/skill")
public class CHabilidades {
	@Autowired
	SHabilidades sHabilidades;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@GetMapping("/lista")
	public ResponseEntity<List<Habilidades>> list() {
		List<Habilidades> list = Habilidades.list();
		return new ResponseEntity(list, HttpStatus.OK);

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@GetMapping("detail/{id}")
	public ResponseEntity<Habilidades> getById(@PathVariable("id") int id) {
		if (!sHabilidades.existsById(id)) {
			return new ResponseEntity(new Mensaje("No existe"), HttpStatus.NOT_FOUND);
		}
		Habilidades habilidades = sHabilidades.getOne(id).get();
		return new ResponseEntity(habilidades, HttpStatus.OK);

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@DeleteMapping("/detail/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") int id) {
		if (!sHabilidades.existsById(id)) {
			return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
		}
		sHabilidades.delete(id);
		return new ResponseEntity(new Mensaje("Skill eliminado"), HttpStatus.OK);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@PostMapping("/create")
	public ResponseEntity<?> create(@RequestBody dtoHabilidades dtohabilidades) {
		if (StringUtils.isBlank(dtohabilidades.getNombre())) {
			return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
		}
		if (sHabilidades.existsByNombre(dtohabilidades.getNombre())) {
			return new ResponseEntity(new Mensaje("Esa skill ya existe"), HttpStatus.BAD_REQUEST);
		}
		Habilidades habilidades = new Habilidades(dtohabilidades.getNombre(), dtohabilidades.getPorcentaje());
		sHabilidades.save(habilidades);
		return new ResponseEntity(new Mensaje("Skill agregada"), HttpStatus.OK);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@PutMapping("/update/{id}")
	public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoHabilidades dtohabilidades) {
		// validamos si existe el ID
		if (!sHabilidades.existsById(id)) {
			return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
		}
		// comparamos nombre de skill
		if (sHabilidades.existsByNombre(dtohabilidades.getNombre())
				&& sHabilidades.getByNombre(dtohabilidades.getNombre()).get().getId() != id) {
			return new ResponseEntity(new Mensaje("Esa skill ys existe"), HttpStatus.BAD_REQUEST);
		}
		// No puede estar vacio
		if (StringUtils.isBlank(dtohabilidades.getNombre())) {
			return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
		}
		Habilidades habilidades = sHabilidades.getOne(id).get();
		habilidades.setNombre(dtohabilidades.getNombre());
		habilidades.setPorcentaje(dtohabilidades.getPorcentaje());

		sHabilidades.save(habilidades);
		return new ResponseEntity(new Mensaje("Skill actualizado"), HttpStatus.OK);

	}

}
