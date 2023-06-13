package com.example.demo.entity;

import java.util.Date;

import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

public class Proyectos {
	private String id;
	private String nombre;
	private String descripcion;
	private String urlProyecto;

	@Temporal(TemporalType.DATE)
	private Date fechaIn;

	@Temporal(TemporalType.DATE)
	private Date fechaFin;

	private Persona persona;

	public Proyectos() {
	}

	public Proyectos(String id, String nombre, String descripcion, String urlProyecto) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.urlProyecto = urlProyecto;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getUrlProyecto() {
		return urlProyecto;
	}

	public void setUrlProyecto(String urlProyecto) {
		this.urlProyecto = urlProyecto;
	}

	public Date getFechaIn() {
		return fechaIn;
	}

	public void setFechaIn(Date fechaIn) {
		this.fechaIn = fechaIn;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

}
