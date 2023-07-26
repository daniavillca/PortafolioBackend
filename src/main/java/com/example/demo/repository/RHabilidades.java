package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Habilidades;

public interface RHabilidades extends JpaRepository<Habilidades, Integer> {
	Optional<Habilidades> findByNombre(String nombre);

	public boolean existsByNombre(String nombre);

}
