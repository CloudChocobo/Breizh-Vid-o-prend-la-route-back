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


    /**
     * @return long return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @return String return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @return Integer return the codePostalCode
     */
    public Integer getCodePostalCode() {
        return codePostalCode;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

        /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
    /**
     * @param codePostalCode the codePostalCode to set
     */
    public void setCodePostalCode(Integer codePostalCode) {
        this.codePostalCode = codePostalCode;
    }

}