/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.obtbs.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fhfai
 */
public class DBConnection {

    private static Connection connection;

    public static Connection getConnection() throws SQLException {
        if(connection == null){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/obtbs";
                String username = "root";
                String password = "admin";
                connection = DriverManager.getConnection(url, username, password);
            }catch(ClassNotFoundException | SQLException ex){
                System.out.println(ex);
                Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return connection;
    }
}
