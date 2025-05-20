package com.example.apigestiontournois.model;

import jakarta.persistence.Entity;

@Entity
public class DoubleTournois extends Tournois {

    private Boolean hasConsolationFinal;

    public DoubleTournois(Long id, Boolean hasConsolationFinal) {
        super();
        this.hasConsolationFinal = hasConsolationFinal;
    }

    public DoubleTournois() { }

    public Boolean getHasConsolationFinal() {
        return hasConsolationFinal;
    }

    public void setHasConsolationFinal(Boolean hasConsolationFinal) {
        this.hasConsolationFinal = hasConsolationFinal;
    }
}
