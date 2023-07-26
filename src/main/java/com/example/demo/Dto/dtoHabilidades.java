package com.example.demo.Dto;

import javax.validation.constraints.NotBlank;

public class dtoHabilidades {
	@NotBlank
	private String nombre;
	@NotBlank
	private int porcentaje;

	public dtoHabilidades() {

	}

	public dtoHabilidades(@NotBlank String nombre, @NotBlank int porcentaje) {
		super();
		this.nombre = nombre;
		this.porcentaje = porcentaje;
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

}
