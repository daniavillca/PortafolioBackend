package com.example.demo.entity;

import java.util.Date;

import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

public class Estudio {
	private String id;
	private String institucion;
	private String titulo;
	private String descripcion;
	private String urlEstudio;

	@Temporal(TemporalType.DATE)
	private Date fechaInc;

	@Temporal(TemporalType.DATE)
	private Date fechaFinal;

	private Persona persona;

	public Estudio(String id, String institucion, String titulo, String descripcion, String urlEstudio) {

		this.id = id;
		this.institucion = institucion;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.urlEstudio = urlEstudio;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getInstitucion() {
		return institucion;
	}

	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getUrlEstudio() {
		return urlEstudio;
	}

	public void setUrlEstudio(String urlEstudio) {
		this.urlEstudio = urlEstudio;
	}

	public Date getFechaInc() {
		return fechaInc;
	}

	public void setFechaInc(Date fechaInc) {
		this.fechaInc = fechaInc;
	}

	public Date getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(Date fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

}
