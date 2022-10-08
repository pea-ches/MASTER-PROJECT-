package com.main.minticpets.models;

public class User {

    private int idPersona;
    private String tipoIdentificacion;
    private String nombres;
    private String apellidos;
    private String ciudad;
    private String Pais;
    private String barrio;
    private String direccion;
    private String correoElectronico;
    private int celular;

    public User() {
    }

    public User(int idPersona, String tipoIdentificacion, String nombres, String apellidos, String ciudad, String pais, String barrio, String direccion, String correoElectronico, int celular) {
        this.idPersona = idPersona;
        this.tipoIdentificacion = tipoIdentificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.ciudad = ciudad;
        Pais = pais;
        this.barrio = barrio;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
        this.celular = celular;
    }



    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }
}
