package com.codingdojo.dojoninja.controllers;

import com.codingdojo.dojoninja.models.Dojo;
import com.codingdojo.dojoninja.services.DojoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DojoController {
    private final DojoService dojoService;
    public DojoController(final DojoService dojoService) {
        this.dojoService = dojoService;
    }
@RequestMapping("/dojos/new")
    public String showAddDojo(@ModelAttribute("dojo") Dojo dojo){
        return "NewDojo.jsp";

}
    @RequestMapping(value="/dojos/new" ,method= RequestMethod.POST)
    public String addDojo(@ModelAttribute("dojo") Dojo dojo){
        dojoService.createDojo(dojo);
        return "redirect:/dojos/new";
    }


}
