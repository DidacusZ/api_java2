package com.diego.api10.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diego.api10.modelos.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {

}
