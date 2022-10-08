package com.main.minticpets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {

    private final String serverName = "localhost";
    private final String nameDB = "minticpets";
    private final String portNumber = "3306";
    private final String user = "root";
    private final String password = "root";
    private Connection con = null;
    private final String driverName = "com.mysql.cj.jdbc.Driver";

    public Connection getConnction() throws Exception {

        try {
            Class.forName(driverName);
            String url = "jdbc:mysql://" + this.serverName + ":" + this.portNumber + "/" + this.nameDB;
            con = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

        return con;
    }
}
