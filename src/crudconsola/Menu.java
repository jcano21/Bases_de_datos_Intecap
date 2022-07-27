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
    import java.util.Scanner;

public class Menu {
    
     metodos met = new metodos();
     public void Menu() {
         
         Scanner scanner = new Scanner(System.in);
         int menu = 0;
        
        
        do {
            System.out.println("__________________________");
            System.out.println("1. Insertar");
            System.out.println("2. Modificar");
            System.out.println("3. Consultar");
            System.out.println("4. Eliminar");
            System.out.println("5. Salir");
            System.out.println("__________________________");
            menu = scanner.nextInt();
        
        } while (menu < 1 || menu > 5);

        switch (menu) {
            case 1:
                Menu_Insertar();
               
                break;

            case 2:
                  
                Menu_Modificar();
                break;
            case 3:
               
                met.Consultar();
                Menu();
                break;

            case 4:
               
                Menu_Eliminar();
                
                break;

            case 5:
                
                System.out.println("Ha salido de Crudconsola");
                
                break;

           

              
        }

    }
     
  
     public void Menu_Insertar(){
         Scanner scanner = new Scanner(System.in);
         int cod,tel;
         String nom,dir;
         System.out.print("Ingrese Codigo: ");
          cod = scanner.nextInt();
          scanner.nextLine();
         System.out.print("Ingrese Nombre: ");
          nom = scanner.nextLine();
         System.out.print("Ingrese Direccion: ");
          dir = scanner.nextLine();
        
         System.out.print("Ingrese Telefono: ");
          tel = scanner.nextInt();
          scanner.nextLine();
         
         met.Insertar(cod, nom, dir, tel);
         
         System.out.println("Insertar Correctamente");
         
         System.out.println("__________________________");
            System.out.println("¿Desea Volver?");  
            int confirmar = 0;
            do {
           
            System.out.println("1. SI");
            System.out.println("2. NO");
            System.out.println("__________________________");
            confirmar = scanner.nextInt();
        } while (confirmar < 1 || confirmar > 2);

        switch (confirmar) {
            case 1:
                Menu();

              
                break;

            case 2:
                Menu_Insertar();
                  
                break;
            
        
        
        
        }
     
     }
     

     public void Menu_Modificar(){
         Scanner scanner = new Scanner(System.in);
         
         System.out.print("Ingrese Codigo: ");
         int cod = scanner.nextInt();
         scanner.nextLine();
         System.out.print("Ingrese Nombre: ");
         String nom = scanner.nextLine();
         System.out.print("Ingrese Direccion: ");
         String dir = scanner.nextLine();
         System.out.print("Ingrese Telefono: ");
         int tel = scanner.nextInt();
         scanner.nextLine();
         
         met.Modificar(cod, nom, dir, tel);
         
         System.out.println("Modificado Correctamente");
         
         System.out.println("__________________________");
            System.out.println("¿Desea Volver?");  
            int confirmar = 0;
            do {
           
            System.out.println("1. SI");
            System.out.println("2. NO");
            System.out.println("__________________________");
            confirmar = scanner.nextInt();
        } while (confirmar < 1 || confirmar > 2);

        switch (confirmar) {
            case 1:
                Menu();

              
                break;

            case 2:
                Menu_Modificar();
                  
                break;
            
        
        
        
        }
     
     }
     
      public void Menu_Eliminar(){
         Scanner scanner = new Scanner(System.in);
         
         System.out.print("Ingrese Codigo: ");
         int cod = scanner.nextInt();
         scanner.nextLine();
         
         
         met.Eliminar(cod);
         
         System.out.println("****Eliminado Correctamente****");
         
         System.out.println("__________________________");
            System.out.println("¿Desea Volver?");  
            int confirmar = 0;
            do {
           
            System.out.println("1. SI");
            System.out.println("2. NO");
            System.out.println("__________________________");
            confirmar = scanner.nextInt();
        } while (confirmar < 1 || confirmar > 2);

        switch (confirmar) {
            case 1:
                Menu();

              
                break;

            case 2:
                Menu_Eliminar();
                  
                break;
            
        
        
        
        }
     
     }
}
