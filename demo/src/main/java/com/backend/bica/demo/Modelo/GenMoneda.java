package com.backend.bica.demo.Modelo;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="gen_moneda")
public class GenMoneda {
    @Id
    private Long moneda;
    @Column
    private String nommon;
    @Column
    private String sigmonswift;
    @Column(nullable=false)
    private int nromonswift;
    @Column(nullable=false, name="nromonbcra")
    private int nromonbcra;
    @Column
    private String sigmonbcra;
    @Column(nullable=false)
    private int codtipovalor;
    @Column
    private Timestamp fecbaja;
    @Column
    private Timestamp fecalta;
    @Column
    private Timestamp fecaudi;
    @Column
    private String usuaudi;
    @Column
    private String prgaudi;



    public GenMoneda() {
    }



    public GenMoneda(Long moneda, String nommon, String sigmonswift, int nromonswift, int nromonbcra, String sigmonbcra,
            int codtipovalor, int estado, Timestamp fecbaja, Timestamp fecalta, Timestamp fecaudi, String usuaudi,
            String prgaudi) {
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


/*
 
CREATE TABLE B_General.dbo.gen_moneda (
    Moneda INTEGER PRIMARY KEY,
    NomMon VARCHAR(50),
    SigMonSwift VARCHAR(5),
    NroMonSwift INTEGER NOT NULL,
    NroMonBCRA INTEGER NOT NULL,
    sigmonbcra VARCHAR(5),
    Codtipovalor INTEGER NOT NULL,
    Estado SMALLINT,
    FecBaja TIMESTAMP,
    FecAlta TIMESTAMP,
    FecAudi TIMESTAMP,
    UsuAudi VARCHAR(10),
    PrgAudi VARCHAR(8)
);

 */