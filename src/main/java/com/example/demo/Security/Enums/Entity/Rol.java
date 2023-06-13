package com.example.demo.Security.Enums.Entity;

import com.example.demo.Security.Enums.Enums.RolNombre;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity

public class Rol {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;

	@Nonnull
	@Enumerated(EnumType.STRING)
	private RolNombre rolNombre;

	// constructor

	public Rol() {
	}

	public Rol(RolNombre rolNombre) {
		this.rolNombre = rolNombre;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public RolNombre getRolNombre() {
		return rolNombre;
	}

	public void setRolNombre(RolNombre rolNombre) {
		this.rolNombre = rolNombre;
	}

}
