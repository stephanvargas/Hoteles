package com.example.Canchas.controler;

import com.example.Canchas.interfaceService.IProductosService;
import com.example.Canchas.modelo.Persona;
import com.example.Canchas.modelo.productos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class CProducto {

    @Autowired
    private IProductosService servi;


    @GetMapping("/listar2")
    public String listar2(Model model){
        List<productos>productos= servi.listar2();
        model.addAttribute("productos",productos);
        return "Tabla productos";
    }

    @GetMapping("/Producto")
    public String agregar9(Model model){
        model.addAttribute("Productos", new productos());
        return "Producto";
    }

    @PostMapping("/save2")
    public String save(@Validated productos p){
        servi.save2(p);
        return "redirect:/agradecimiento";
    }
}
