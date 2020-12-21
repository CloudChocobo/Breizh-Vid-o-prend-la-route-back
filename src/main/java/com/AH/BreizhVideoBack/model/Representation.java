package com.AH.BreizhVideoBack.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.time.LocalDate;

@Entity

public class Representation {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private LocalDate release_date;

    public long getId() {
        return id;
    }

    public LocalDate getRelease_date() {
        return release_date;
    }

    public void setId(long id) {
        this.id = id;
    }
    public void setRelease_date(LocalDate release_date) {
        this.release_date = release_date;
    }
}
}
