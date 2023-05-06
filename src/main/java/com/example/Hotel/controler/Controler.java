package com.example.Hotel.controler;



import com.example.Hotel.interfaceService.IPersonaService;
import com.example.Hotel.modelo.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class Controler {


    @Autowired
    private IPersonaService service;


    @GetMapping("/listar")
    public String listar(Model model){
        List<Persona>personas= service.listar();
        model.addAttribute("personas", personas);
        return "Boton";
    }


    @GetMapping("/jacuzzi")
    public String agregar1(Model model){
        model.addAttribute("persona", new Persona());
        return "Habitaciones con Jacuzzi";
    }
    @GetMapping("/estelar")
    public String agregar2(Model model){
        model.addAttribute("persona", new Persona());
        return "Habitación estelar";
    }

    @PostMapping("/save1")
    public String save1(@Validated Persona p){
        service.save(p);
        return "redirect:";
    } @PostMapping("/save2")
    public String save2(@Validated Persona p){
        service.save(p);
        return "redirect:";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model model){
        Optional<Persona> persona = service.listarId(id);
        model.addAttribute("persona", persona);
        return "form";
    }

    @GetMapping("/eliminar/{id}")
    public String delete(@PathVariable int id){
        service.delete(id);
        return "redirect:/listar";
    }



}
