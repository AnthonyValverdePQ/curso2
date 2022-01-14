package com.edteam.curso2.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user")
public class User {
    //private long id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false,updatable = false)
    private long id;

    @Column(name="nombre")
    private String nombre;

    @Column(name="apellido")
    private String apellido;

    @Column(name="telefono")
    private String telefono;

    @Column(name="email")
    private String email;

    @Column(name="fechaNac")
    private Date fechaNac;

  

    public User(){}

    public User(long id, String nombre, String apellido, String telefono, String email, Date fechaNac) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.fechaNac = fechaNac;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }
}
