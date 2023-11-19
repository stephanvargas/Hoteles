package com.example.Canchas.controler;

import com.example.Canchas.interfaceService.IEvaluacionService;
import com.example.Canchas.modelo.Evaluciones;
import com.example.Canchas.modelo.productos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class CEvaluaciones {

    @Autowired
    private IEvaluacionService servi;


    @GetMapping("/listar2")
    public String listar1(Model model){
        List<Evaluciones>evaluciones= servi.listar1();
        model.addAttribute("evaluacion",  evaluciones);
        return "Tabla De Comentarios";
    }

    @GetMapping("/evaliacion")
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
