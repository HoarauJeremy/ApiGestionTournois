package com.example.apigestiontournois.controller;

import com.example.apigestiontournois.service.DoubleTournoisService;
import com.example.apigestiontournois.service.TournoisService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("tournois/Double")
class DoubleController {

    private DoubleTournoisService doubleTournoisService;

    @GetMapping
    public String getAllTournois(Model model) {
        model.addAttribute("doubleTournois", doubleTournoisService.getAllDoubleTournois());

        return "Double/index";
    }

    @GetMapping("/{id}")
    public String getTournoisById(@PathVariable Long id, Model model) {
        model.addAttribute("doubleTournois", doubleTournoisService.getDoubleTournoisById(id));

        return "Double/index";
    }

    @PostMapping("/add")
    public String addDoubleTournois() {
        return "Double/index";
    }



}
