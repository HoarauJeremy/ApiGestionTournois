package com.example.apigestiontournois.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
public class Tournois implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String nom;

    private LocalDateTime date_debut;

    private LocalDateTime date_fin;

    public Tournois() {}

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDateTime getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(LocalDateTime date_debut) {
        this.date_debut = date_debut;
    }

    public LocalDateTime getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(LocalDateTime date_fin) {
        this.date_fin = date_fin;
    }
}
