package com.main.minticpets.dao;

import com.main.minticpets.ConnectionDB;
import com.main.minticpets.models.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserDao {

    public User validation(int id, String password) throws Exception{

        Connection con = new ConnectionDB().getConnction();
        User user = new User();
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM persona WHERE 'id'=? AND 'password'=?");

        }catch (Exception e){
            System.out.println(e);
        }
        return  user;
    }

}
