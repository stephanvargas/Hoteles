package com.example.Canchas.service;

import com.example.Canchas.interfaceService.IEvaluacionService;
import com.example.Canchas.interfaces.IEvaluaciones;
import com.example.Canchas.modelo.Evaluciones;
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
    public Optional<Evaluciones> listarId1(int ide) {

        return data.findById(ide);
    }

    @Override
    public int save1(Evaluciones a) {
        int res = 0;
        Evaluciones evaluciones = data.save(a);
        if(!evaluciones.equals(null)){
            res = 1;
        }
        return res;
    }

    @Override
    public void delete1(int ide) {
        data.deleteById(ide);
    }
}
