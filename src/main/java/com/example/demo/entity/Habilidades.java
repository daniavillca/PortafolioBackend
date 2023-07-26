package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Habilidades {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;;
	private int porcentaje;
	private Persona persona;

	public Habilidades(String string, int i) {

	}

	public Habilidades(int id, String nombre, int porcentaje, Persona persona) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.porcentaje = porcentaje;
		this.persona = persona;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPorcentaje() {
		return this.porcentaje;
	}

	public void setPorcentaje(int porcentaje) {
		this.porcentaje = porcentaje;
	}

	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public static List<Habilidades> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
