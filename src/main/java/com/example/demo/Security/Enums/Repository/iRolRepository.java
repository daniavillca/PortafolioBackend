package com.example.demo.Security.Enums.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Security.Enums.Entity.Rol;
import com.example.demo.Security.Enums.Enums.RolNombre;

public interface iRolRepository extends JpaRepository<Rol, Integer> {
	Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
