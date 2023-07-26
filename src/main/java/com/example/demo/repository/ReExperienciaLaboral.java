package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ExperienciaLaboral;

@Repository
public interface ReExperienciaLaboral extends JpaRepository<ExperienciaLaboral, Integer> {
	public Optional<ExperienciaLaboral> findByNombreE(String nombreE);

	public boolean existsByNombreE(String nombreE);

	public Optional<ExperienciaLaboral> findById(String id);

	public void deleteById(String id);

	public boolean existsById(String id);

}
