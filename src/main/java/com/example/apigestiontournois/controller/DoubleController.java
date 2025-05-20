package com.example.apigestiontournois.controller;

import com.example.apigestiontournois.service.DoubleTournoisService;
import com.example.apigestiontournois.service.TournoisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("tournois/double")
class DoubleController {

    @Autowired
    private DoubleTournoisService doubleTournoisService;

    @GetMapping
    public String getAllTournois(Model model) {
        model.addAttribute("doubleTournois", doubleTournoisService.getAllDoubleTournois());

        return "Double/index";
    }

    @GetMapping("/{id}")
    public String getTournoisById(@PathVariable Long id, Model model) {
        System.out.println("\n\nHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\n\n");
        model.addAttribute("double", doubleTournoisService.getDoubleTournoisById(id));

        return "Double/show";
    }

    @GetMapping("/add")
    public String addDoubleTournois() {
        return "Double/index";
    }

    @PostMapping("/create")
    public String addTournois(DoubleTournoisService doubleTournoisService) {
        this.doubleTournoisService = doubleTournoisService;

        return "redirect:tournois/double";
    }

    @DeleteMapping("/{id}")
    public String deleteTournois(@PathVariable Long id) {
        doubleTournoisService.deleteDoubleTournoisById(id);
        return "redirect:tournois/double";
    }

}
