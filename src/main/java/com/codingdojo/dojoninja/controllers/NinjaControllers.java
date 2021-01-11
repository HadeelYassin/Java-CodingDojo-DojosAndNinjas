package com.codingdojo.dojoninja.controllers;


import com.codingdojo.dojoninja.models.Dojo;
import com.codingdojo.dojoninja.models.Ninja;
import com.codingdojo.dojoninja.services.DojoService;
import com.codingdojo.dojoninja.services.NinjaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

@Controller
public class NinjaControllers {
    private final NinjaService ninjaService;
    private final DojoService dojoService;

    public NinjaControllers(NinjaService ninjaService, DojoService dojoService) {
        this.ninjaService = ninjaService;
        this.dojoService = dojoService;
    }

    @RequestMapping("/ninjas/new")
    public String showAddNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
        List<Dojo> allDojo = dojoService.allDojo();
        model.addAttribute("dojos", allDojo);
        return "NewNinja.jsp";
    }

    @RequestMapping(value = "/ninjas/new", method = RequestMethod.POST)
    public String addNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
        if (result.hasErrors()) {
            List<Dojo> allDojo = dojoService.allDojo();
            model.addAttribute("dojos", allDojo);
            return "NewNinja.jsp";
        } else {
            ninjaService.createNinja(ninja);
            return "redirect:/dojos/"+ninja.getDojo().getId() ;
        }
    }
    @RequestMapping("/dojos/{id}")
    public String showNinja(@PathVariable("id") Long id, Model model){
        Dojo dojo=dojoService.findDojo(id);
        List<Ninja> allNinja=dojo.getNinjas();
        model.addAttribute("ninjas", allNinja);
        model.addAttribute("dojo",dojo);
        return "DojoNinjas.jsp";
    }
}
