
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
public class ejerci9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        int num, cont, suma;
        cont = 0;
        suma = 0;
        do {
            System.out.println("Ingrese un número:");
            num = leer.nextInt();
             

            if (num > 0) {
                suma = suma + num;
            } else {
                suma = suma + (num * 0);
            }
        cont = cont+1;
           if (num==0){
            System.out.println("se capturó el número 0 ");
        
        break;
        }
        } while ( cont <20);       
            
        
        System.out.println("la suma es " + suma);

    }

    }
    

