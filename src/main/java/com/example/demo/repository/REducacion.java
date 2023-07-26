package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Educacion;

@Repository
public interface REducacion extends JpaRepository<Educacion, Integer> {
	public Optional<Educacion> findByNombreE(String nombreE);

	public boolean existsByNombreE(String nombreE);

}
