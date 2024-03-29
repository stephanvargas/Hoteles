package com.example.Canchas.interfaceService;

import com.example.Canchas.modelo.Evaluciones;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication(scanBasePackages = {"com.example.Canchas"})
public interface IEvaluacionService {

    public List<Evaluciones> listar1();
    public Optional<Evaluciones> listarId1(int ide);
    public int save1(Evaluciones a);
    public void delete1(int ide);

}
