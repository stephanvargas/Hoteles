package com.example.Hotel.service;

import com.example.Hotel.interfaceService.IEvaluacionService;
import com.example.Hotel.interfaces.IEvaluaciones;
import com.example.Hotel.modelo.Evaluciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EvaluacionService implements IEvaluacionService {

    @Autowired
    private IEvaluaciones data;
    @Override
    public List<Evaluciones> listar1() {
        return (List<Evaluciones>) data.findAll();
    }

    @Override
    public Optional<Evaluciones> listarId1(int id) {

        return data.findById(id);
    }

    @Override
    public int save1(Evaluciones p) {
        int res = 0;
        Evaluciones evaluciones = data.save(p);
        if(!evaluciones.equals(null)){
            res = 1;
        }
        return res;
    }

    @Override
    public void delete1(int id) {
        data.deleteById(id);
    }
}
