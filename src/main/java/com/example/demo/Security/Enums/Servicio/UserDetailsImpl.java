package com.example.demo.Security.Enums.Servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Security.Enums.Entity.Usuario;
import com.example.demo.Security.Enums.Entity.UsuarioPrincipal;

@Service
@Transactional
public class UserDetailsImpl implements UserDetailsService {
	@Autowired
	UsuarioServicio usuarioServicio;

	@Override
	public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
		Usuario usuario = usuarioServicio.getByNombreUsuario(nombreUsuario).get();
		return UsuarioPrincipal.build(usuario);
	}
}
