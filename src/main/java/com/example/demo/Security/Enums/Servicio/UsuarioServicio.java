package com.example.demo.Security.Enums.Servicio;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Security.Enums.Entity.Usuario;
import com.example.demo.Security.Enums.Repository.iUsuarioRepository;

@Service
@Transactional

public class UsuarioServicio {
	@Autowired
	iUsuarioRepository iusuiarioRepository;

	public Optional<Usuario> getByNombOptional(String nombreUsuario) {
		return iusuiarioRepository.findByNombreUsuario(nombreUsuario);
	}

	public boolean existsByNombreUsuario(String nombreUsuario) {
		return iusuiarioRepository.existsByNombreUsuario(nombreUsuario);
	}

	public boolean existsByEmail(String email) {
		return iusuiarioRepository.existsByEmail(email);
	}

	public void save(Usuario usuario) {
		iusuiarioRepository.save(usuario);
	}

	public Object getByNombreUsuario(String nombreUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

}
