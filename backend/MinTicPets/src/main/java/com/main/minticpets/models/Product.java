package com.main.minticpets.models;

public class Product {

    private int idProducto;
    private String img;
    private String nombreProducto;
    private float precio;
    private float valoracionProducto; //Cambiar en la base de datos de char a float
    private String descripcionProducto;

    public Product() {
    }

    public Product(int idProducto, String img, String nombreProducto, float precio, String descripcionProducto) {
        this.idProducto = idProducto;
        this.img = img;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.descripcionProducto = descripcionProducto;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public float getValoracionProducto() {
        return valoracionProducto;
    }

    public void setValoracionProducto(float valoracionProducto) {
        this.valoracionProducto = valoracionProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
