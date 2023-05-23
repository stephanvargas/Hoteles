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
    private IEvaluacionService servi;


    @GetMapping("/listar1")
    public String listar1(Model model){
        List<Evaluciones>evaluciones= servi.listar1();
        model.addAttribute("evaluacion",  evaluciones);
        return "Tabla De Comentarios";
    }

    @GetMapping("/Calificar")
    public String agregar7(Model model){
        model.addAttribute("evaluation", new Evaluciones());
        return "Evaluación";
    }

    @PostMapping("/save/comentarios")
    public String save1(@Validated Evaluciones a){
        servi.save1(a);
        return "redirect:/inicio";
    }


    @GetMapping("/eliminar1/{ide}")
    public String delete1(@PathVariable int ide){
        servi.delete1(ide);
        return "redirect:/listar1";
    }



}
