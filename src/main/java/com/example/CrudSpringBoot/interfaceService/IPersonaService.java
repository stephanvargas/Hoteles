package com.example.CrudSpringBoot.interfaceService;

import com.example.CrudSpringBoot.modelo.Registro;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication(scanBasePackages = {"com.example.CrudSpringBoot"})
public interface IPersonaService {

    public List<Registro>listar();
    public Optional<Registro>listarId(int id);
    public int save (Registro a);
    public void delete(int id);

}
