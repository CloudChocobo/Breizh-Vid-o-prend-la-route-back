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
    private Integer codePostalCode;



    public long getId() {
        return id;
    }


    public String getNom() {
        return nom;
    }


    public Integer getCodePostalCode() {
        return codePostalCode;
    }


    public void setId(long id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCodePostalCode(Integer codePostalCode) {
        this.codePostalCode = codePostalCode;
    }

}