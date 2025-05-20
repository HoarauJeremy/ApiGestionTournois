package com.example.apigestiontournois.service;

import com.example.apigestiontournois.model.Tournois;
import com.example.apigestiontournois.repository.TournoisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SimpleTournoisService {

    private final TournoisRepository tournoisRepository;

    @Autowired
    public SimpleTournoisService(TournoisRepository tournoisRepository) {
        this.tournoisRepository = tournoisRepository;
    }

    public List<Tournois> getAllSimpleTournois() {
        return (List<Tournois>) tournoisRepository.findAll();
    }

    public Optional<Tournois> getTournoisById(Long id) {
        return tournoisRepository.findById(id);
    }

    public Tournois createTournois(Tournois tournois) {
        return tournoisRepository.save(tournois);
    }

    /*public Tournois updateTournois(Tournois tournois) {
        return tournoisRepository.save(tournois);
    }*/

    public void deleteTournoisById(Long id) {
        tournoisRepository.deleteById(id);
    }

}
