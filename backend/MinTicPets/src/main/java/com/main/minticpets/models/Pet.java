package com.main.minticpets.models;

import java.util.Date;

public class Pet {

    private int idMascota;
    private String nombreMascota;
    private String especieMascota;
    private Date fechaNacimiento;
    private User user;

    public Pet(int idMascota, String nombreMascota, String especieMascota, Date fechaNacimiento, User user) {
        this.idMascota = idMascota;
        this.nombreMascota = nombreMascota;
        this.especieMascota = especieMascota;
        this.fechaNacimiento = fechaNacimiento;
        this.user = user;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getEspecieMascota() {
        return especieMascota;
    }

    public void setEspecieMascota(String especieMascota) {
        this.especieMascota = especieMascota;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
