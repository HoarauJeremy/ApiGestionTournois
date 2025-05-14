package com.example.apigestiontournois.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ChampionnatTournois {

    @Id
    private Boolean matchRetour;

    public ChampionnatTournois(Boolean matchRetour) {
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
