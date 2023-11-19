package com.example.Canchas.interfaces;

import com.example.Canchas.modelo.Persona;
import org.springframework.data.repository.CrudRepository;

public interface IPersona  extends CrudRepository<Persona, Integer> {
}
