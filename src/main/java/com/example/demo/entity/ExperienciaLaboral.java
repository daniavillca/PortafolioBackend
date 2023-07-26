package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ExperienciaLaboral {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	private String nombreE;

	private String descripcionE;

	public ExperienciaLaboral(String id, String nombreE, String descripcionE) {
		this.id = id;
		this.nombreE = nombreE;
		this.descripcionE = descripcionE;
	}

	public ExperienciaLaboral(String nombreE2, String descripcioneE) {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombreE() {
		return this.nombreE;
	}

	public void setNombreE(String nombreE) {
		this.nombreE = nombreE;
	}

	public String getDescripcionE() {
		return this.descripcionE;
	}

	public void setDescripcionE(String descripcionE) {
		this.descripcionE = descripcionE;
	}

}
