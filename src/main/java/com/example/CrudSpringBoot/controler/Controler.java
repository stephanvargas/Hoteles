package com.example.CrudSpringBoot.controler;



import com.example.CrudSpringBoot.interfaceService.IPersonaService;
import com.example.CrudSpringBoot.modelo.Registro;
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
        List<Registro>registros= service.listar();
        model.addAttribute("registro",registros);
        return "Boton";
    }

    @GetMapping("/new")
    public String agregar(Model model){
        model.addAttribute("persona", new Registro());
        return "Numero de habitaciones";
    }

    @PostMapping("/save")
    public String save(@Validated Registro a){
        service.save(a);
        return "redirect:/listar";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model model){
        Optional<Registro> registro = service.listarId(id);
        model.addAttribute("registro", registro);
        return "form";
    }

    @GetMapping("/eliminar/{id}")
    public String delete(@PathVariable int id){
        service.delete(id);
        return "redirect:/listar";
    }



}
