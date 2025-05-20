package com.example.apigestiontournois.service;

import com.example.apigestiontournois.model.DoubleTournois;
import com.example.apigestiontournois.repository.DoubleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoubleTournoisService {

    private final DoubleRepository doubleRepository;

    @Autowired
    public DoubleTournoisService(DoubleRepository doubleRepository) {
        this.doubleRepository = doubleRepository;
    }

    public List<DoubleTournois> getAllDoubleTournois() {
        return (List<DoubleTournois>) doubleRepository.findAll();
    }

    public Optional<DoubleTournois> getDoubleTournoisById(Long id) {
        return doubleRepository.findById(id);
    }

    public DoubleTournois createDoubleTournois(DoubleTournois doubleTournois) {
        return doubleRepository.save(doubleTournois);
    }

    public void deleteDoubleTournoisById(Long id) {
        doubleRepository.deleteById(id);
    }

}
