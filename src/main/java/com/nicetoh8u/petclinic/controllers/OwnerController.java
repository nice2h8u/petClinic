package com.nicetoh8u.petclinic.controllers;

import com.nicetoh8u.petclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    public final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

@RequestMapping("")
    public String getOwners(Model model){
        model.addAttribute("owners",ownerService.findAll());
        return "owners";
    }

}
