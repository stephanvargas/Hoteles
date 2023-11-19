package com.example.Canchas.modelo;

import javax.persistence.*;

@Entity
@Table(name = "tienda")
public class productos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ida;
    private int cantidad;
    private String nombre_producto;

    public productos(int ida, int cantidad, String nombre_producto) {
        this.ida = ida;
        this.cantidad = cantidad;
        this.nombre_producto = nombre_producto;
    }

    public int getIda() {
        return ida;
    }

    public void setIda(int ida) {
        this.ida = ida;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public productos() {
    }
}
