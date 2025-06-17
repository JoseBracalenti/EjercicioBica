package com.backend.bica.demo.DTOs;

import java.sql.Timestamp;

public class GenMonedaDTO {
    private Long moneda;
    private String nommon;
    private String sigmonswift;
    private int nromonswift;
    private int nromonbcra;
    private String sigmonbcra;
    private int codtipovalor;
    private Timestamp fecbaja;
    private Timestamp fecalta;
    private Timestamp fecaudi;
    private String usuaudi;
    private String prgaudi;

    
    
    public GenMonedaDTO() {
    }
    public GenMonedaDTO(Long moneda, String nommon, String sigmonswift, int nromonswift, int nromonbcra,
            String sigmonbcra, int codtipovalor, Timestamp fecbaja, Timestamp fecalta, Timestamp fecaudi,
            String usuaudi, String prgaudi) {
        this.moneda = moneda;
        this.nommon = nommon;
        this.sigmonswift = sigmonswift;
        this.nromonswift = nromonswift;
        this.nromonbcra = nromonbcra;
        this.sigmonbcra = sigmonbcra;
        this.codtipovalor = codtipovalor;
        this.fecbaja = fecbaja;
        this.fecalta = fecalta;
        this.fecaudi = fecaudi;
        this.usuaudi = usuaudi;
        this.prgaudi = prgaudi;
    }
    public Long getMoneda() {
        return moneda;
    }
    public void setMoneda(Long moneda) {
        this.moneda = moneda;
    }
    public String getNommon() {
        return nommon;
    }
    public void setNommon(String nommon) {
        this.nommon = nommon;
    }
    public String getSigmonswift() {
        return sigmonswift;
    }
    public void setSigmonswift(String sigmonswift) {
        this.sigmonswift = sigmonswift;
    }
    public int getNromonswift() {
        return nromonswift;
    }
    public void setNromonswift(int nromonswift) {
        this.nromonswift = nromonswift;
    }
    public int getNromonbcra() {
        return nromonbcra;
    }
    public void setNromonbcra(int nromonbcra) {
        this.nromonbcra = nromonbcra;
    }
    public String getSigmonbcra() {
        return sigmonbcra;
    }
    public void setSigmonbcra(String sigmonbcra) {
        this.sigmonbcra = sigmonbcra;
    }
    public int getCodtipovalor() {
        return codtipovalor;
    }
    public void setCodtipovalor(int codtipovalor) {
        this.codtipovalor = codtipovalor;
    }
    public Timestamp getFecbaja() {
        return fecbaja;
    }
    public void setFecbaja(Timestamp fecbaja) {
        this.fecbaja = fecbaja;
    }
    public Timestamp getFecalta() {
        return fecalta;
    }
    public void setFecalta(Timestamp fecalta) {
        this.fecalta = fecalta;
    }
    public Timestamp getFecaudi() {
        return fecaudi;
    }
    public void setFecaudi(Timestamp fecaudi) {
        this.fecaudi = fecaudi;
    }
    public String getUsuaudi() {
        return usuaudi;
    }
    public void setUsuaudi(String usuaudi) {
        this.usuaudi = usuaudi;
    }
    public String getPrgaudi() {
        return prgaudi;
    }
    public void setPrgaudi(String prgaudi) {
        this.prgaudi = prgaudi;
    }

    
}
