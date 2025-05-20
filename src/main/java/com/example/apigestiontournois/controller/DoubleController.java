package com.example.apigestiontournois.controller;

import com.example.apigestiontournois.model.DoubleTournois;
import com.example.apigestiontournois.service.DoubleTournoisService;
import com.example.apigestiontournois.service.TournoisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/double")
class DoubleController {

    @Autowired
    private DoubleTournoisService doubleTournoisService;

    @GetMapping
    public String getAllDoubleTournois(Model model) {
        model.addAttribute("doubleTournois", doubleTournoisService.getAllDoubleTournois());

        return "Double/index";
    }

    @GetMapping("/{id}")
    public String getTournoisById(@PathVariable Long id, Model model) {
        DoubleTournois tournoi = doubleTournoisService.getDoubleTournoisById(id)
                .orElseThrow(() -> new RuntimeException("Tournoi non trouvé"));
        System.out.println("Tournoi trouvé: " + tournoi.getNom());
        model.addAttribute("tournoi", tournoi);
        System.out.println("Contenu du modèle: " + model.asMap());
        System.out.println("Contenu du modèle: " + model.asMap().get("tournoi"));
        return "Double/show";
    }

    @GetMapping("/add")
    public String addDoubleTournois() {
        return "Double/create";
    }

    @PostMapping("/create")
    public String addTournois(@ModelAttribute DoubleTournois doubleTournois) {
        doubleTournoisService.createDoubleTournois(doubleTournois);
        return "redirect:/double";
    }

    @DeleteMapping("/{id}")
    public String deleteTournois(@PathVariable Long id) {
        doubleTournoisService.deleteDoubleTournoisById(id);
        return "redirect:/double";
    }

}
