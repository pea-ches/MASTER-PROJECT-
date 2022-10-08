package com.main.minticpets.models;

import java.util.Date;
import java.util.List;

public class Order {

    private int idOrden;
    private User user;
    private Date fechaOrden;
    private String Direccion;
    private String Ciudad;
    private String barrio;
    private List<Product> productos;

    public Order(int idOrden, User user, Date fechaOrden, String direccion, String ciudad, String barrio, List<Product> productos) {
        this.idOrden = idOrden;
        this.user = user;
        this.fechaOrden = fechaOrden;
        Direccion = direccion;
        Ciudad = ciudad;
        this.barrio = barrio;
        this.productos = productos;
    }

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getFechaOrden() {
        return fechaOrden;
    }

    public void setFechaOrden(Date fechaOrden) {
        this.fechaOrden = fechaOrden;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public List<Product> getProductos() {
        return productos;
    }

    public void setProductos(List<Product> productos) {
        this.productos = productos;
    }
}
