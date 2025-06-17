package com.backend.bica.demo.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.bica.demo.Modelo.GenMoneda;
@Repository
public interface GenMonedaDAO extends JpaRepository<GenMoneda, Long>{
}
