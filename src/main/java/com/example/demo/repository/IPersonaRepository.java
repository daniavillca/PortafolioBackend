package com.example.demo.repository;

import com.example.demo.entity.Persona;

import java.util.Optional;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, String> {

	public Optional<Persona> findByNombre(String nombre);

	public boolean existsByNombre(String nombre);

}