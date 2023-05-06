package com.example.Hotel_quiroga.service;

import com.example.Hotel_quiroga.interfaceService.ISregistro;
import com.example.Hotel_quiroga.interfaces.IRegistro;
import com.example.Hotel_quiroga.modelo.Registro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService implements ISregistro {

    @Autowired
    private IRegistro datos;

    @Override
    public List<Registro> listar() {
        return (List<Registro>) datos.findAll();
    }

    @Override
    public Optional<Registro> listarId(int id) {
        return datos.findById(id);
    }

    @Override
    public int save(Registro p) {
        int res = 0;
        Registro registro = datos.save(p);
        if(!registro.equals(null)){
            res = 1;
        }
        return res;
    }

    @Override
    public void delete(int id) {
        datos.deleteById(id);
    }
}
