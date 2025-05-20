package com.example.apigestiontournois.controller;


import com.example.apigestiontournois.service.ChampionnatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/championnat")
public class ChanpionnatController {

    @Autowired
    private ChampionnatService championnatService;


    @GetMapping
    public String getAllChampionnats(Model model) {

        model.addAttribute("championnats", championnatService.getAllChampionnat());
        return "Championnat/index";

    }
}
