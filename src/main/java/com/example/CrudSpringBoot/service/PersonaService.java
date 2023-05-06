package com.example.CrudSpringBoot.service;

import com.example.CrudSpringBoot.interfaceService.IPersonaService;
import com.example.CrudSpringBoot.interfaces.IPersona;
import com.example.CrudSpringBoot.modelo.Registro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    private IPersona datos;

    @Override
    public List<Registro> listar() {
        return (List<Registro>) datos.findAll();
    }

    @Override
    public Optional<Registro> listarId(int id) {

        return datos.findById(id);
    }

    @Override
    public int save(Registro a) {
        int res = 0;
        Registro registro = datos.save(a);
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
