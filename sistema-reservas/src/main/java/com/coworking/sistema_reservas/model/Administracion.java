package com.coworking.sistema_reservas.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Administracion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_admin")
    private int id;

    @Column(name="nombre_admin")
    private String nombre;

    @Column(name="correo_admin")
    private String correo;

    @OneToMany(mappedBy = "administracion",cascade = CascadeType.ALL)
    private List<Sala> salas = new ArrayList<>();

    public Administracion(){}

    public Administracion(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
