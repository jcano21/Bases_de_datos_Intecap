/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudconsola;

/**
 *
 * @author 50241
 */

import java.sql.Connection;
import java.sql.DriverManager;

public class conexion {
    
    Connection conex;
    String url = "jdbc:mysql://localhost:3307/colegio";
    String user="root";
    String pass="";
    
    public Connection Conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conex=  DriverManager.getConnection(url,user,pass);
            
        } catch (Exception e) {
            System.out.println(e);
        }      
        return conex;
        
    }
    
}
