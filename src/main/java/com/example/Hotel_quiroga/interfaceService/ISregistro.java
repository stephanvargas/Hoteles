package com.example.Hotel_quiroga.interfaceService;

import com.example.Hotel_quiroga.modelo.Registro;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication(scanBasePackages = {"com.example.Hotel_quiroga"})
public interface ISregistro {

    public List<Registro>listar();
    public Optional<Registro>listarId(int id);
    public int save (Registro p);
    public void delete(int id);

}
