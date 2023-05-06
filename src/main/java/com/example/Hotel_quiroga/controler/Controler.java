package com.example.Hotel_quiroga.controler;

import com.example.Hotel_quiroga.modelo.Registro;
import com.example.Hotel_quiroga.interfaceService.ISregistro;
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
    private ISregistro service;


    @GetMapping("/listar")
    public String listar(Model model){
        List<Registro>registros= service.listar();
        model.addAttribute("registro",registros);
        return "index";
    }

    @GetMapping("/new")
    public String agregar(Model model){
        model.addAttribute("registro", new Registro());
        return "prueba";
    }

    @PostMapping("/save")
    public String save(@Validated Registro p){
        service.save(p);
        return "redirect:/listar";
    }

    @GetMapping("/editaryacusi/{id}")
    public String editar(@PathVariable int id, Model model){
        Optional<Registro> registro = service.listarId(id);
        model.addAttribute("registro", registro);
        return "Habitaciones con Jacuzzi ";
    }

    @GetMapping("/eliminar/{id}")
    public String delete(@PathVariable int id){
        service.delete(id);
        return "redirect:/listar";
    }



}
