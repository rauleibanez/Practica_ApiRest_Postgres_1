package com.apiRest.ApiRest.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usuarios")
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique=true, nullable = false)
    private String idusr;
    private String nomusr;
    private String apepatusr;
    private String apematusr;
    private String emailusr;
    private String telusr;
    
    public String getIdusr() {
        return idusr;
    }
    public void setIdusr(String idusr) {
        this.idusr = idusr;
    }
    public String getNomusr() {
        return nomusr;
    }
    public void setNomusr(String nomusr) {
        this.nomusr = nomusr;
    }
    public String getApepatusr() {
        return apepatusr;
    }
    public void setApepatusr(String apepatusr) {
        this.apepatusr = apepatusr;
    }
    public String getApematusr() {
        return apematusr;
    }
    public void setApematusr(String apematusr) {
        this.apematusr = apematusr;
    }
    public String getEmailusr() {
        return emailusr;
    }
    public void setEmailusr(String emailusr) {
        this.emailusr = emailusr;
    }
    public String getTelusr() {
        return telusr;
    }
    public void setTelusr(String telusr) {
        this.telusr = telusr;
    }    
}    
