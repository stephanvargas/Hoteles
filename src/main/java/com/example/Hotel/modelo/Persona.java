package com.example.Hotel.modelo;


import javax.persistence.*;

@Entity
@Table(name = "persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int telefono;
    private String num_doc;
    private  String correo;
    private int num_abi;
    private String llegada;
    private String Salida;


    public Persona() {
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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNum_doc() {
        return num_doc;
    }

    public void setNum_doc(String num_doc) {
        this.num_doc = num_doc;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getNum_abi() {
        return num_abi;
    }

    public void setNum_abi(int num_abi) {
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

    public Persona(int id, String name, int telefono, String num_doc, String correo, int num_abi, String llegada, String salida) {
        this.id = id;
        this.name = name;
        this.telefono = telefono;
        this.num_doc = num_doc;
        this.correo = correo;
        this.num_abi = num_abi;
        this.llegada = llegada;
        Salida = salida;
    }
}
