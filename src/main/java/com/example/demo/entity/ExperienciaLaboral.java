package com.example.demo.entity;

public class ExperienciaLaboral {
	private String id;
	private String nombreE;

	private String descripcion;

	public ExperienciaLaboral(String id, String nombreE, String descripcion) {
		this.id = id;
		this.nombreE = nombreE;

		this.descripcion = descripcion;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombreE() {
		return nombreE;
	}

	public void setNombreE(String nombreE) {
		this.nombreE = nombreE;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
