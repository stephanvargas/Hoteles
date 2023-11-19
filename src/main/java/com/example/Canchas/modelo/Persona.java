package com.example.Canchas.modelo;


import javax.persistence.*;

@Entity
@Table(name = "persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private long telefono;
    private long num_doc;
    private  String correo;
    private String num_cancha;
    private String reserva;

    private  String tipohabitacion;




    public Persona() {
    }

    public String getTipohabitacion() {
        return tipohabitacion;
    }

    public void setTipohabitacion(String tipohabitacion) {
        this.tipohabitacion = tipohabitacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public long getNum_doc() {
        return num_doc;
    }

    public void setNum_doc(long num_doc) {
        this.num_doc = num_doc;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNum_cancha() {
        return num_cancha;
    }

    public void setNum_cancha(String num_cancha) {
        this.num_cancha = num_cancha;
    }

    public String getReserva() {
        return reserva;
    }

    public void setReserva(String reserva) {
        this.reserva = reserva;
    }

    public Persona(int id, String name, long telefono, long num_doc, String correo, String num_cancha, String reserva, String tipohabitacion) {
        this.id = id;
        this.name = name;
        this.telefono = telefono;
        this.num_doc = num_doc;
        this.correo = correo;
        this.num_cancha = num_cancha;
        this.reserva = reserva;
        this.tipohabitacion = tipohabitacion;
    }
}
