package com.example.demo.entity;

import java.util.Date;

import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

public class Persona {
	private String id;
	private String nombre;
	private String apellido;
	private String dni;
	private String direccion;
	private String telefono;
	private String correo;
	private String sobre_mi;
	private String urlFoto;

	@Temporal(TemporalType.DATE)
	private Date fechaNac;

	public Persona() {
	}

	public Persona(String id, String nombre, String apellido, String fechaNac, String direccion, String telefono,
			String correo, String sobre_mi, String urlFoto, String dni) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correo = correo;
		this.sobre_mi = sobre_mi;
		this.urlFoto = urlFoto;
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getSobre_mi() {
		return sobre_mi;
	}

	public void setSobre_mi(String sobre_mi) {
		this.sobre_mi = sobre_mi;
	}

	public String getUrlFoto() {
		return urlFoto;
	}

	public void setUrlFoto(String urlFoto) {
		this.urlFoto = urlFoto;
	}

	public Date getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}

}
