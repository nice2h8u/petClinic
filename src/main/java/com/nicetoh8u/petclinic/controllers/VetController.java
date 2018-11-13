package com.nicetoh8u.petclinic.controllers;

import com.nicetoh8u.petclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/vets")
@Controller
public class VetController {
    public final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping("")
    public String getOwners(Model model){
        model.addAttribute("vets",vetService.findAll());
        return "vets";
    }

}
