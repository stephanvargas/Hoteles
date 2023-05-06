package com.example.CrudSpringBoot.interfaces;

import com.example.CrudSpringBoot.modelo.Registro;
import org.springframework.data.repository.CrudRepository;

public interface IPersona  extends CrudRepository<Registro, Integer> {
}
