package com.example.apigestiontournois.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class ChampionnatTournois extends Tournois {

    @Id
    private Long id;
    private Boolean matchRetour;

    public ChampionnatTournois(Long id, Boolean matchRetour) {
        super();
        this.id = id;
        this.matchRetour = matchRetour;
    }

    public ChampionnatTournois(Long id, String nom, LocalDateTime date_debut, LocalDateTime date_fin, Long id1, Boolean matchRetour) {
        super(id, nom, date_debut, date_fin);
        this.id = id1;
        this.matchRetour = matchRetour;
    }

    public ChampionnatTournois() {

    }

    public Boolean getMatchRetour() {
        return matchRetour;
    }

    public void setMatchRetour(Boolean matchRetour) {
        this.matchRetour = matchRetour;
    }
}
