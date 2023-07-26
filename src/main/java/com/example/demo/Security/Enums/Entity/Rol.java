package com.example.demo.Security.Enums.Entity;

import com.example.demo.Security.Enums.Enums.RolNombre;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
public class Rol {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;

	@NotNull
	@Enumerated(EnumType.STRING)
	private RolNombre rolNombre;

	// constructor

	public Rol() {
	}

	public Rol(RolNombre rolNombre,String id) {
		this.id = id;
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
