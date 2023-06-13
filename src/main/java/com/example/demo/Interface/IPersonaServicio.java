package com.example.demo.Interface;

import java.util.List;

import com.example.demo.entity.*;

public interface IPersonaServicio {
	// traer una lista de personas

	public List<Persona> getPersona();

	// Guardar un objeto de tipo persona

	public void savePersona(Persona persona);

	// eliminar un objeto pero lo buscamos x id

	public void deletePersona(String id);

	// Buscar un persona por id

	public Persona findPersona(String id);
}
