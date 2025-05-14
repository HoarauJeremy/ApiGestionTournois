package com.example.apigestiontournois.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class DoubleTournois {

    @Id
    private Boolean ConsolationFinal;

    public DoubleTournois(Boolean consolationFinal) {
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
