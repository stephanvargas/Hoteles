package com.example.Hotel.modelo;

import javax.persistence.*;

@Entity
@Table(name = "evaluacion")
public class Evaluciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ide;
    private String calificacion;
    private String comentarios;

    public Evaluciones(int ide, String calificacion, String comentarios) {
        this.ide = ide;
        this.calificacion = calificacion;
        this.comentarios = comentarios;
    }

    public int getIde() {
        return ide;
    }

    public void setIde(int ide) {
        this.ide = ide;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public Evaluciones() {
    }
}
