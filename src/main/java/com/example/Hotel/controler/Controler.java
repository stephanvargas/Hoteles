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

    @GetMapping("/inicio")
    public String agregar(Model model){
        model.addAttribute("persona", new Persona());
        return "boton";
    }
    @GetMapping("/listar")
    public String listar(Model model){
        List<Persona>personas= service.listar();
        model.addAttribute("personas", personas);
        return "index";
    }

    @GetMapping("/Jacuzzi")
    public String agregar1(Model model){
        model.addAttribute("persona", new Persona());
        return "Habitaciones con Jacuzzi";
    }
    @GetMapping("/Estelar")
    public String agregar2(Model model){
        model.addAttribute("persona", new Persona());
        return "Habitación estelar";
    }
    @GetMapping("/precios")
    public String agregar3(Model model){
        return "Precio de las habitaciones";
    }
    @PostMapping("/save")
    public String save(@Validated Persona p){
        service.save(p);
        return "Evaluación";
    }
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model model){
        Optional<Persona> persona = service.listarId(id);
        model.addAttribute("persona", persona);
        return "index";
    }

    @GetMapping("/eliminar/{id}")
    public String delete(@PathVariable int id){
        service.delete(id);
        return "redirect:/listar";
    }



}
