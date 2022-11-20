
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
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer   = new Scanner(System.in);
        double sentigrados, f;
        System.out.println("ingresar temperatura");
        sentigrados = leer.nextDouble();
        f=32+(9*sentigrados/5);
        System.out.println("el resultado es "+ f );
       
    }
    
}
