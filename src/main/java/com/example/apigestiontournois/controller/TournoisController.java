package com.example.apigestiontournois.controller;

import com.example.apigestiontournois.model.SimpleTournois;
import com.example.apigestiontournois.model.Tournois;
import com.example.apigestiontournois.repository.SimpleRepository;
import com.example.apigestiontournois.repository.TournoisRepository;
import com.example.apigestiontournois.service.TournoisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/tournois")
public class TournoisController {

    @Autowired
    private TournoisService tournoisService;

    /*@Autowired
    private TournoisRepository tournoisRepository;
    @Autowired
    private SimpleRepository simpleRepository;*/

    @GetMapping
    public String getAllTournois(Model model) {

        model.addAttribute("tournois", tournoisService.getAllTournois());

        return "Tournois/index";
    }

    /*@GetMapping("/simple")
    public ResponseEntity<List<SimpleTournois>> getTournoisSimple(){
        return new ResponseEntity<>((List<SimpleTournois>) simpleRepository.findAll(), HttpStatus.OK);
    }

    *//**
     * @param id Identifiant du tournois
     * @return Les informations sur un tournois
     *//*
    @GetMapping("/{id}")
    public ResponseEntity<Tournois> getTournoisById(@PathVariable Long id){
        if(tournoisRepository.findById(id).isPresent()){
            return new ResponseEntity<>(tournoisRepository.findById(id).get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    *//*@PostMapping
    @Transactional
    public ResponseEntity<Tournois> createTournois(@RequestBody Tournois tournois){
        if (tournoisRepository.findById(tournois.getId()).isPresent()){
            tournoisRepository.save(tournois);
            return new ResponseEntity<>(tournois, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }*//*

    @PostMapping("/simple")
    @Transactional
    public ResponseEntity<Tournois> createSimpleTournois(@RequestBody Tournois tournois){
        if (tournoisRepository.findById(tournois.getId()).isPresent()){
            tournoisRepository.save(tournois);
            return new ResponseEntity<>(tournois, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/double")
    @Transactional
    public ResponseEntity<Tournois> createDoubleTournois(@RequestBody Tournois tournois){
        if (tournoisRepository.findById(tournois.getId()).isPresent()){
            tournoisRepository.save(tournois);
            return new ResponseEntity<>(tournois, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/championnat")
    @Transactional
    public ResponseEntity<Tournois> createChampionnat(@RequestBody Tournois tournois){
        if (tournoisRepository.findById(tournois.getId()).isPresent()){
            tournoisRepository.save(tournois);
            return new ResponseEntity<>(tournois, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<Tournois> updateTournois(@PathVariable Long id, @RequestBody Tournois tournois) {
        if(tournoisRepository.findById(id).isPresent()){

            Tournois tournoisUpdate = tournoisRepository.findById(id).get();

            tournoisUpdate.setNom(tournois.getNom());
            tournoisUpdate.setDate_debut(tournois.getDate_debut());
            tournoisUpdate.setDate_fin(tournois.getDate_fin());

            tournoisRepository.save(tournoisUpdate);

            return new ResponseEntity<>(tournois, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<Tournois> deleteTournois(@PathVariable Long id){
        if(tournoisRepository.findById(id).isPresent()){
            tournoisRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }*/

}
