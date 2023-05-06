package com.example.Hotel.interfaces;

import com.example.Hotel.modelo.Persona;
import org.springframework.data.repository.CrudRepository;

public interface IPersona  extends CrudRepository<Persona, Integer> {
}
