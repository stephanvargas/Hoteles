package com.example.Canchas.interfaceService;

import com.example.Canchas.modelo.productos;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication(scanBasePackages = {"com.example.Canchas"})
public interface IProductosService {

    public List<productos> listar2();
    public Optional<productos> listarId2(int ide);
    public int save2(productos p);
    public void delete2(int ide);

}
