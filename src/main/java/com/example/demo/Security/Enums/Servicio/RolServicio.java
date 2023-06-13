package com.example.demo.Security.Enums.Servicio;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Security.Enums.Entity.Rol;
import com.example.demo.Security.Enums.Enums.RolNombre;
import com.example.demo.Security.Enums.Repository.iRolRepository;

@Service
@Transactional
public class RolServicio {
	@Autowired
	iRolRepository irolRepository;

	public Optional<Rol> getByNombre(RolNombre rolNombre) {
		return irolRepository.findByRolNombre(rolNombre);
	}

	public void save(Rol rol) {
		irolRepository.save(rol);
	}

}
