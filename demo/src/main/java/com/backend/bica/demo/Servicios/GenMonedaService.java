package com.backend.bica.demo.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.bica.demo.Modelo.GenMoneda;
import com.backend.bica.demo.Repositorios.GenMonedaDAO;

@Service
public class GenMonedaService {
    @Autowired
    private GenMonedaDAO genMonedaDAO;


    public List<GenMoneda> getmonedas(){
        return genMonedaDAO.findAll();
    }
    public GenMoneda getMoneda(Long id){
        return genMonedaDAO.getReferenceById(id);
    }
    public GenMoneda newMoneda(GenMoneda moneda){
        return genMonedaDAO.save(moneda);
    }
    public void borrarMoneda(Long Id){
        genMonedaDAO.deleteById(Id);
    }
}
