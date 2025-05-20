package com.example.apigestiontournois.service;

import com.example.apigestiontournois.model.ChampionnatTournois;
import com.example.apigestiontournois.repository.ChampionnatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
class ChampionnatService {

    private final ChampionnatRepository championnatRepository;

    @Autowired
    public ChampionnatService(ChampionnatRepository championnatRepository) {
        this.championnatRepository = championnatRepository;
    }

    public List<ChampionnatTournois> getAllChampionnat() {
        return (List<ChampionnatTournois>) championnatRepository.findAll();
    }

    public Optional<ChampionnatTournois> getChampionnatById(Long id) {
        return championnatRepository.findById(id);
    }

    public ChampionnatTournois createChampionnat(ChampionnatTournois championnat) {
        return championnatRepository.save(championnat);
    }

    public void deleteChampionnatById(Long id) {
        championnatRepository.deleteById(id);
    }

}
