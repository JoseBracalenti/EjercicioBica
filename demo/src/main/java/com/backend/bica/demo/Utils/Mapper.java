package com.backend.bica.demo.Utils;

import com.backend.bica.demo.DTOs.GenMonedaDTO;
import com.backend.bica.demo.Modelo.GenMoneda;

public class Mapper {
    public GenMonedaDTO MonedaToDTO(GenMoneda moneda){
        GenMonedaDTO rta = new GenMonedaDTO();
        rta.setCodtipovalor(moneda.getCodtipovalor());
        rta.setFecalta(moneda.getFecalta());
        rta.setFecaudi(moneda.getFecaudi());
        rta.setFecbaja(moneda.getFecbaja());
        rta.setMoneda(moneda.getMoneda());
        rta.setNommon(moneda.getNommon());
        rta.setNromonbcra(moneda.getNromonbcra());
        rta.setSigmonbcra(moneda.getSigmonbcra());
        rta.setSigmonswift(moneda.getSigmonswift());
        rta.setUsuaudi(moneda.getUsuaudi());
        return rta;
    }

    public GenMoneda DTOtoMoneda(GenMonedaDTO dto){
        GenMoneda moneda = new GenMoneda();
         moneda.setCodtipovalor(dto.getCodtipovalor());
        moneda.setFecalta(dto.getFecalta());
        moneda.setFecaudi(dto.getFecaudi());
        moneda.setFecbaja(dto.getFecbaja());
        moneda.setMoneda(dto.getMoneda());
        moneda.setNommon(dto.getNommon());
        moneda.setNromonbcra(dto.getNromonbcra());
        moneda.setSigmonbcra(dto.getSigmonbcra());
        moneda.setSigmonswift(dto.getSigmonswift());
        moneda.setUsuaudi(dto.getUsuaudi());
        return moneda;
    }
}
