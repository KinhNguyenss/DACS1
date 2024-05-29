/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vku.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static final String URL = "jdbc:sqlserver://localhost\\SQLEXPRESS;database=QLCafe;integratedSecurity=true;";
    public static Connection getConnection(){
        try{
            return DriverManager.getConnection(URL);
        }catch(SQLException e){
            System.out.println("e.getMessage");
            return null;
        }
    }
}
