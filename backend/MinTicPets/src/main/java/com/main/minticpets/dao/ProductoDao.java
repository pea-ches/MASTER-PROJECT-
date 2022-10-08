package com.main.minticpets.dao;

import com.main.minticpets.ConnectionDB;
import com.main.minticpets.models.Product;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.*;
import java.util.*;

public class ProductoDao {
    private int numRecords;

    public List<Product> listProducts() throws Exception {
        Connection con = new ConnectionDB().getConnction();
        List<Product> productos = new ArrayList<>();

        try {
            String sql = "SELECT * from producto";
            PreparedStatement Pstatement = con.prepareStatement(sql);
            ResultSet rs = Pstatement.executeQuery();
            this.numRecords = 0;

            while (rs.next()) {
                Product pr = new Product();
                pr.setIdProducto(rs.getInt("idproducto"));
                pr.setImg(rs.getString("img_producto"));
                pr.setNombreProducto(rs.getString("nombre_producto"));
                pr.setValoracionProducto(rs.getFloat("valoracion_producto"));
                pr.setDescripcionProducto(rs.getString("desc_producto"));
                pr.setPrecio(rs.getFloat("precio_producto"));

                productos.add(pr);
                this.numRecords ++;
            }

        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return productos;
    }

    public List<Product> search(String charactes) throws Exception {
        Connection con = new ConnectionDB().getConnction();
        List<Product> productos = new ArrayList<>();

        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM producto WHERE nombre_producto LIKE '%" + charactes + "%'");
            this.numRecords = 0;

            while (rs.next()) {
                Product pr = new Product();
                pr.setIdProducto(rs.getInt("idproducto"));
                pr.setImg(rs.getString("img_producto"));
                pr.setNombreProducto(rs.getString("nombre_producto"));
                pr.setValoracionProducto(rs.getInt("valoracion_producto"));
                pr.setPrecio(rs.getFloat("precio_producto"));

                productos.add(pr);
                this.numRecords ++;
            }

        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return productos;

    }

    public List<Product> filterCategory(int category) throws Exception {
        Connection con = new ConnectionDB().getConnction();
        List<Product> productos = new ArrayList<>();

        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM productos_categorias WHERE 'idCategoria'='%" + category + "%'");
            this.numRecords = 0;

            while (rs.next()) {
                Product pr = new Product();
                pr.setIdProducto(rs.getInt("idproducto"));
                pr.setImg(rs.getString("img_producto"));
                pr.setNombreProducto(rs.getString("nombre_producto"));
                pr.setValoracionProducto(rs.getInt("valoracion_producto"));
                pr.setPrecio(rs.getFloat("precio_producto"));

                productos.add(pr);
                this.numRecords ++;
            }

        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return productos;

    }
}
