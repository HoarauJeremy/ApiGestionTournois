package com.example.apigestiontournois.controller;


import com.example.apigestiontournois.service.SimpleTournoisService;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/simple")
public class SimpleTournoisController {


    @Autowired
    private SimpleTournoisService simpleTournoisService;

    @GetMapping
    public String getAllSimpleTournois(Model model  ) {
        model.addAttribute("simpleTournois", simpleTournoisService.getAllSimpleTournois());
        return "Simple/index";
    }
}
