package com.company;

import javax.swing.*;

public class Doctor {

    private String id;
    private String nombre;
    private String especialidad;
    private String horario;
    private String costo;


    public Doctor(String id, String nombre, String especialidad, String horario, String costo) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.horario = horario;
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getCosto() {
        return costo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
