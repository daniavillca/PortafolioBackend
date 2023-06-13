package com.example.demo.Dto;

import javax.validation.constraints.NotBlank;

public class dtoExperienciaLaboral {
	@NotBlank
	private String nombreE;
	@NotBlank
	private String descripcioneE;

	public dtoExperienciaLaboral() {
	}

	public dtoExperienciaLaboral(String nombreE, String descripcionE) {
		this.nombreE = nombreE;
		this.descripcioneE = descripcionE;
	}

	public String getNombreE() {
		return nombreE;
	}

	public void setNombreE(String nombreE) {
		this.nombreE = nombreE;
	}

	public String getDescripcioneE() {
		return descripcioneE;
	}

	public void setDescripcioneE(String descripcioneE) {
		this.descripcioneE = descripcioneE;
	}

}
