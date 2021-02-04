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
    private Int anneeSortie;
    @Column(name="description")
    private String description;
    @Column (name="duree")
    private String duree;

    public long getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public String getDescription() {
        return description;
    }

    public Int getAnneeSortie() {
        return anneeSortie;
    }

    public Int getDuree() {
        return duree;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAnneeSortie(Int anneeSortie) {
        this.anneeSortie = anneeSortie;
    }

    public void setDuree(Int duree) {
        this.duree = duree;
    }

}