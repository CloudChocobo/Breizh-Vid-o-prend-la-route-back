package com.AH.BreizhVideoBack.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity

public class Village {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO) 
    private long id;
    private String nom;
    private Integer codePostal;

    public long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public Integer getCodePostal() {
        return codePostal;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCodePostal(Integer codePostal) {
        this.codePostal = codePostal;
    }

}