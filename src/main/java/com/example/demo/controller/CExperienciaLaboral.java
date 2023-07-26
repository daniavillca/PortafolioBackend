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

import com.example.demo.Dto.dtoExperienciaLaboral;
import com.example.demo.Security.Enums.Controller.Mensaje;
import com.example.demo.Servicio.SeExperienciaLaboral;
import com.example.demo.entity.ExperienciaLaboral;

@RestController
@RequestMapping("explab")
@CrossOrigin(origins = "http://localhost:4200")
public class CExperienciaLaboral {
	@Autowired
	SeExperienciaLaboral seExperienciaLaboral;

	@SuppressWarnings({ "rawtypes" })
	@GetMapping("/lista")
	public ResponseEntity<List> list() {
		List<ExperienciaLaboral> list = seExperienciaLaboral.list();
		return new ResponseEntity<List>(list, HttpStatus.OK);

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@GetMapping("detail/{id}")
	public ResponseEntity<ExperienciaLaboral> getById(@PathVariable("id") String id) {
		if (!seExperienciaLaboral.existsById(id))
			return new ResponseEntity(new Mensaje("No existe"), HttpStatus.NOT_FOUND);
		ExperienciaLaboral experienciaLaboral = seExperienciaLaboral.getOne(id).get();
		return new ResponseEntity(experienciaLaboral, HttpStatus.OK);

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@DeleteMapping("/detail/{id}")
	public ResponseEntity<ExperienciaLaboral> getById1(@PathVariable("id") String id) {
		if (!seExperienciaLaboral.existsById(id)) {
			return new ResponseEntity(new Mensaje("No existe"), HttpStatus.NOT_FOUND);
		}
		seExperienciaLaboral.delete(id);
		return new ResponseEntity(new Mensaje("producto eliminado"), HttpStatus.OK);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@PostMapping("/create")
	public ResponseEntity<?> create(@RequestBody dtoExperienciaLaboral dtoexp) {
		if (StringUtils.isBlank(dtoexp.getNombreE()))
			return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);

		if (seExperienciaLaboral.existsByNombreE(dtoexp.getNombreE()))
			return new ResponseEntity(new Mensaje("Esa experiencia existe"), HttpStatus.BAD_REQUEST);

		ExperienciaLaboral experienciaLaboral = new ExperienciaLaboral(dtoexp.getNombreE(), dtoexp.getDescripcioneE());

		seExperienciaLaboral.save(experienciaLaboral);

		return new ResponseEntity(new Mensaje("Experiencia agregada"), HttpStatus.OK);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@PutMapping("/update/{id}")
	public ResponseEntity<?> update(@PathVariable("id") String id, @RequestBody dtoExperienciaLaboral dtoexp) {
		// validamos si existe el ID

		if (!seExperienciaLaboral.existsById(id))
			return new ResponseEntity(new Mensaje("El id no existe"), HttpStatus.BAD_REQUEST);
//compara nombre de una experiencia
		if (seExperienciaLaboral.existsByNombreE(dtoexp.getNombreE())
				&& seExperienciaLaboral.getByNombreE(dtoexp.getNombreE()).get().getId() != id)
			return new ResponseEntity(new Mensaje("Esa experiencia ya existe"), HttpStatus.BAD_REQUEST);
//No puede estar vacio
		if (StringUtils.isBlank(dtoexp.getNombreE()))
			return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);

		ExperienciaLaboral experienciaLaboral = seExperienciaLaboral.getOne(id).get();
		experienciaLaboral.setNombreE(dtoexp.getNombreE());
		experienciaLaboral.setDescripcionE(dtoexp.getDescripcioneE());

		seExperienciaLaboral.save(experienciaLaboral);
		return new ResponseEntity(new Mensaje("Experiencia actualizada"), HttpStatus.OK);

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ResponseEntity<?> delete(@PathVariable("id") String id) {
		// Validamos si existe el ID
		if (!seExperienciaLaboral.existsById(id))
			return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);

		seExperienciaLaboral.delete(id);

		return new ResponseEntity(new Mensaje("Experiencia eliminada"), HttpStatus.OK);

	}

}
