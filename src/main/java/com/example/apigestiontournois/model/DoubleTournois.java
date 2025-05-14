package com.example.apigestiontournois.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class DoubleTournois extends Tournois {

    @Id
    private Long id;
    private Boolean ConsolationFinal;

    public DoubleTournois(Long id, Boolean consolationFinal) {
        super();
        this.id = id;
        ConsolationFinal = consolationFinal;
    }

    public DoubleTournois() {

    }

    public Boolean getConsolationFinal() {
        return ConsolationFinal;
    }

    public void setConsolationFinal(Boolean consolationFinal) {
        ConsolationFinal = consolationFinal;
    }
}
