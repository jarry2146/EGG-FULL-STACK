
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class ejerci5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in); 
        int edad;
        String nombre;
        System.out.println("Ingresa tu edad ");
         edad = leer.nextInt();

        System.out.println("Ingresa tu nombre ");
         nombre = leer.next();
        
        
        System.out.println("la edad es "+edad);
         System.out.println("el nombre es "+nombre);
    }
    
}
