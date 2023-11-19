package com.example.Canchas.service;

import com.example.Canchas.interfaceService.IProductosService;
import com.example.Canchas.interfaces.IProductos;
import com.example.Canchas.modelo.productos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductosService implements IProductosService {

    @Autowired
    private IProductos data;
    @Override
    public List<productos> listar2() {
        return (List<productos>) data.findAll();
    }

    @Override
    public Optional<productos> listarId2(int ide) {

        return data.findById(ide);
    }

    @Override
    public int save2(productos p) {
        int res = 0;
        productos productos = data.save(p);
        if(!productos.equals(null)){
            res = 1;
        }
        return res;
    }

    @Override
    public void delete2(int ide) {
        data.deleteById(ide);
    }
}
