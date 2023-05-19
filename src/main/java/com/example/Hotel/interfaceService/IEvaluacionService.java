package com.example.Hotel.interfaceService;

import com.example.Hotel.modelo.Evaluciones;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication(scanBasePackages = {"com.example.Hotel"})
public interface IEvaluacionService {

    public List<Evaluciones> listar1();
    public Optional<Evaluciones> listarId1(int ide);
    public int save1(Evaluciones a);
    public void delete1(int ide);

}
