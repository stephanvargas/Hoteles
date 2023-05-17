package com.example.Hotel.modelo;


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
    private String num_abi;
    private String llegada;
    private String Salida;
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

    public String getNum_abi() {
        return num_abi;
    }

    public void setNum_abi(String num_abi) {
        this.num_abi = num_abi;
    }

    public String getLlegada() {
        return llegada;
    }

    public void setLlegada(String llegada) {
        this.llegada = llegada;
    }

    public String getSalida() {
        return Salida;
    }

    public void setSalida(String salida) {
        Salida = salida;
    }


    public Persona(int id, String name, long telefono, long num_doc, String correo, String num_abi, String llegada, String salida, String tipohabitacion) {
        this.id = id;
        this.name = name;
        this.telefono = telefono;
        this.num_doc = num_doc;
        this.correo = correo;
        this.num_abi = num_abi;
        this.llegada = llegada;
        Salida = salida;
        this.tipohabitacion = tipohabitacion;

    }
}
