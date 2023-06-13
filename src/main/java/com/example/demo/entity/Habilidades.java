package com.example.demo.entity;

public class Habilidades {
	private String id;
	private String tipoHabilidad;
	private String porcentaje;
	private Persona persona;

	public Habilidades(String id, String tipoHabilidad, String porcentaje) {
		this.id = id;
		this.tipoHabilidad = tipoHabilidad;
		this.porcentaje = porcentaje;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTipoHabilidad() {
		return tipoHabilidad;
	}

	public void setTipoHabilidad(String tipoHabilidad) {
		this.tipoHabilidad = tipoHabilidad;
	}

	public String getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(String porcentaje) {
		this.porcentaje = porcentaje;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

}
