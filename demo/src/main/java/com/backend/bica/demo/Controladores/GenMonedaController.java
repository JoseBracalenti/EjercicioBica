package com.backend.bica.demo.Controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.bica.demo.DTOs.GenMonedaDTO;
import com.backend.bica.demo.Modelo.GenMoneda;
import com.backend.bica.demo.Servicios.GenMonedaService;
import com.backend.bica.demo.Utils.Mapper;
@RestController
@RequestMapping("/api/genmoneda")
public class GenMonedaController {
    @Autowired
    private GenMonedaService servicio;
    private Mapper mapper = new Mapper();
    @GetMapping
    public ResponseEntity<List<GenMonedaDTO>> getMonedas(){
        List<GenMonedaDTO> monedas = new ArrayList<>();
        monedas = servicio.getmonedas().stream().map(x -> mapper.MonedaToDTO(x)).collect(Collectors.toList());
        return ResponseEntity.ok().body(monedas);
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getMoneda(@PathVariable(value = "id") Long id){
        try {
            return ResponseEntity.ok().body(mapper.MonedaToDTO(servicio.getMoneda(id)));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("No Existe la moneda");
        }
    }
    @PostMapping
    public ResponseEntity<GenMonedaDTO> createMoneda(@RequestBody GenMonedaDTO nuevaMoneda){
        GenMoneda moneda = mapper.DTOtoMoneda(nuevaMoneda);
        return ResponseEntity.ok().body(mapper.MonedaToDTO(servicio.newMoneda(moneda)));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteMoneda(@PathVariable(value="id")Long id){
        try {
            servicio.borrarMoneda(id);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error al Borrar");
        }
        return ResponseEntity.ok().build();
    }
}
