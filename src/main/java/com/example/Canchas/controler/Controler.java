package com.example.Canchas.controler;



import com.example.Canchas.interfaceService.IPersonaService;
import com.example.Canchas.modelo.Persona;
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
        return "Tabla De Registros";
    }
    @GetMapping("/inicio")
    public String agregar(Model model){
        return "boton";
    }

    @GetMapping("/Sintetica")
    public String agregar1(Model model){
        model.addAttribute("persona", new Persona());
        return "sintetica";
    }
    @GetMapping("/Voleibol")
    public String agregar2(Model model){
        model.addAttribute("persona", new Persona());
        return "voleibol";
    }
    @GetMapping("/contactos")
    public String agregar3(Model model){
        return "Contactos";
    }
    @GetMapping("/agradecimiento")
    public String agregar4(Model model){
        model.addAttribute("persona", new Persona());
        return "Fin";
    }
    @GetMapping("/precios")
    public String agregar5(Model model){
        return "Precio de las habitaciones";
    }
    @GetMapping("/editar")
    public String agregar6(Model model){
        model.addAttribute("persona", new Persona());
        return "editari";
    }
    @PostMapping("/save")
    public String save(@Validated Persona p){
        service.save(p);
        return "redirect:/agradecimiento";
    }
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model model){
        Optional<Persona> persona = service.listarId(id);
        model.addAttribute("persona", persona);
        return "editari";
    }

    @GetMapping("/eliminar/{id}")
    public String delete(@PathVariable int id){
        service.delete(id);
        return "redirect:/listar";
    }
}
