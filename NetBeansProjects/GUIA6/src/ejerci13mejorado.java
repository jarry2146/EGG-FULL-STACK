
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
public class ejerci13mejorado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
        int n;
        System.out.println("Ingrese que tan grande será el cuadrado:");
        n = leer.nextInt();
        
                
        //linea arriba
        for (int i = 0; i < n; i++) {
            System.out.print("*");
            
        }
        
        System.out.println("");
        
           //linea medio
        for (int i = 0; i < n-2; i++) {
            System.out.print("*");
            for (int j = 0; j < n-2; j++) {
              System.out.print(" ");   
            }
            System.out.println("*");
                   
        }
        
        
              // System.out.print("*");
            
        //System.out.println("");
        //linea abajo
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }    
    }
    
}

