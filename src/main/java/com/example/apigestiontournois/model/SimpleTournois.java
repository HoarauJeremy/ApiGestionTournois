package com.example.apigestiontournois.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class SimpleTournois extends Tournois {

    @Id
    private Long id;
    private Boolean thirdPlaceMatch;


    //constructeur

    public SimpleTournois(Long id, Boolean thirdPlaceMatch) {
        super();
        this.id = id;
        this.thirdPlaceMatch = thirdPlaceMatch;
    }

    public SimpleTournois() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getThirdPlaceMatch() {
        return thirdPlaceMatch;
    }

    public void setThirdPlaceMatch(Boolean thirdPlaceMatch) {
        this.thirdPlaceMatch = thirdPlaceMatch;
    }
}
