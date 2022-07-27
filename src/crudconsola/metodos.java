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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class metodos {
    
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    conexion conectar = new conexion();
    
    public void Insertar(int codigo, String nombre, String direccion, int telefono){
        
       String sql = "insert into alumno(codigo,nombre,direccion,telefono) values (?,?,?,?)";
    
        try {
            con = conectar.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.setString(2, nombre);
            ps.setString(3, direccion);
            ps.setInt(4, telefono);
            ps.executeUpdate();
            
            
        } catch (Exception e) {
        } 
    
    }
    
    public void Modificar(int codigo, String nombre, String direccion, int telefono){
    String sql = "update alumno set nombre='" + nombre + "', direccion='" + direccion + "', telefono='" + telefono + "' where codigo ='" + codigo + "'";
        try {
            con = conectar.Conectar();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    
    
    
        
    }
    
    public void Consultar(){
        String consultar = "select * from alumno";
        
        try {
            con = conectar.Conectar();
            ps = con.prepareStatement(consultar);
            rs = ps.executeQuery();
            
            while (rs.next()) {                
                System.out.println(rs.getInt(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                System.out.println(rs.getInt(4));
                System.out.println("---------------");
            }
            
        } catch (Exception e) {
        }
        
    
    }
    
    public void Eliminar(int codigo){
        String sql = "delete from alumno where codigo = ?";
        try {
            
            con = conectar.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
}
