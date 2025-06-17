package com.backend.bica.demo.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.Modelo.Usuario;


@Repository
public interface UsuarioDAO extends JpaRepository<Usuario, Long>{
    public Usuario findByUsername(String Username);
}
