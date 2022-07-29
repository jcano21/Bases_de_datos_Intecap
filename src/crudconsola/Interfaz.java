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

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Interfaz extends JFrame {
    JTextField txtmostrar,txtn,txtc,txtd,txtt;
    JButton n0;
    JPanel panel;
    JLabel n,codigo,direccion,telefono;
    
    
  
    
    
    
    
    
    
    
public Interfaz (String nombre ){
    
        this.setBounds(200, 100,350,400);
       
        this.setTitle(nombre);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY);
        panel.setLayout(null);
        this.add(panel);
       
    
        //Inicializar componentes
        n = new JLabel("Nombre: ");
        codigo = new JLabel("Codigo: ");
        direccion = new JLabel("Direccion: ");
        telefono = new JLabel("Telefono: ");
        txtmostrar = new JTextField("");
        txtc = new JTextField("");
        txtd = new JTextField("");
        txtt = new JTextField("");
        
      
        this.n0 = new JButton("Agregar");
        
        
        //Set Atributos
       n.setBounds(20, 20, 70, 30);
       codigo.setBounds(20, 70, 70, 30); 
       
       direccion.setBounds(20, 120, 70, 30); 
       telefono.setBounds(20, 170, 70, 30); 
       txtmostrar.setBounds(90, 20, 130, 30);
       txtc.setBounds(90, 70, 130, 30);
       txtd.setBounds(90, 120, 130, 30);
       txtt.setBounds(90, 170, 130, 30);
        
        n0.setBounds(80, 270, 80, 55);
        
        
       n.setForeground(Color.white); 
       codigo.setForeground(Color.white); 
       direccion.setForeground(Color.white); 
       telefono.setForeground(Color.white); 
        
        
        
        
        //Agregar Frame
   
    
    panel.add(n);
    panel.add(codigo);
    panel.add(direccion);
    panel.add(telefono);
    panel.add(txtmostrar);
    panel.add(txtc);
    panel.add(txtd);
    panel.add(txtt);
    panel.add(n0);
  
        
        this.repaint();
       
        // Agregando acciones 
        
        this.n0.addActionListener(new ActionListener() {

          @Override
          public void actionPerformed(ActionEvent ae) {
              metodos m = new metodos();
              m.Insertar(Integer.parseInt(txtc.getText()),txtmostrar.getText(),txtd.getText(), Integer.parseInt(txtt.getText()));
              System.out.println("Agregado Correctamente");
          }
      });
    
    
}
}
