
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
public class ejerci6n {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros de seguido");
        int Num1 = leer.nextInt();
        int Num2 = leer.nextInt();
        
        if (Num1>25 && Num2>25){
            System.out.println("Ambos numeros son mayores a 25");
            
        } else if (Num1 > 25 && Num2<25){
        System.out.println("Solo en primer numero es mayor");
    } else if (Num2>25 && Num1<25){
            System.out.println("Solo el segundo numero es mayor a 25");
            
    }else System.out.println("Ninguno es mayor a 25");

    }
    
}
