package com.example.Canchas.interfaces;

import com.example.Canchas.modelo.productos;
import org.springframework.data.repository.CrudRepository;

public interface IProductos extends CrudRepository<productos, Integer> {
}
