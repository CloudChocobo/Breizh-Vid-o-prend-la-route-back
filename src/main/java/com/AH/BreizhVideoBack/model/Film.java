package com.AH.BreizhVideoBack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity

public class Film {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    @Column(name="title")
    private String titre;
    @Column(name="releaseYear")
    private String anneeSortie;

    public long getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public String getAnneeSortie() {
        return anneeSortie;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAnneeSortie(String anneeSortie) {
        this.anneeSortie = anneeSortie;
    }

}