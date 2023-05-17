package com.example.Hotel.controler;



import com.example.Hotel.interfaceService.IEvaluacionService;
import com.example.Hotel.modelo.Evaluciones;
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
public class CEvaluaciones {

    @Autowired
    private IEvaluacionService service;


    @GetMapping("/listar1")
    public String listar1(Model model){
        List<Evaluciones>evaluciones= service.listar1();
        model.addAttribute("evaluacion",  evaluciones);
        return "index";
    }

    @GetMapping("/Calificacion")
    public String agregar10(Model modelo){
        modelo.addAttribute("evaluacion", new Evaluciones());
        return "Evaluación";
    }

    @PostMapping("/save1")
    public String save1(@Validated Evaluciones a){
        service.save1(a);
        return "Boton";
    }

    @GetMapping("/editar/{ide1}")
    public String editar1(@PathVariable int ide, Model modelo){
        Optional<Evaluciones> evaluciones = service.listarId1(ide);
        modelo.addAttribute("evaluacion", evaluciones);
        return "form";
    }

    @GetMapping("/eliminar/{ide1}")
    public String delete1(@PathVariable int ide){
        service.delete1(ide);
        return "redirect:/listar1";
    }



}
