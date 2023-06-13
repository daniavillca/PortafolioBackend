package com.example.demo.repository;

import com.example.demo.entity.Persona;
import org.springframework.data.jpa.repository.*;

public interface IPersonaRepository extends JpaRepository<Persona, String> {

}