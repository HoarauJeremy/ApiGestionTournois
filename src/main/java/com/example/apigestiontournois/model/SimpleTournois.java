package com.example.apigestiontournois.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class SimpleTournois {

    @Id
    private Long id;
    private Boolean ThirdPlaceMatch;


    //constructeur

    public SimpleTournois(Long id, Boolean thirdPlaceMatch) {
        this.id = id;
        ThirdPlaceMatch = thirdPlaceMatch;
    }

    public SimpleTournois() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getThirdPlaceMatch() {
        return ThirdPlaceMatch;
    }

    public void setThirdPlaceMatch(Boolean thirdPlaceMatch) {
        ThirdPlaceMatch = thirdPlaceMatch;
    }
}
