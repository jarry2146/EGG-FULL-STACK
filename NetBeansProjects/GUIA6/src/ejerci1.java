/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class ejerci1{


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num1, num2, resultado;
        System.out.println("Ingrese un número");
        num1 = leer.nextInt();
        System.out.println("Ingrese un nuevo número");
        num2 = leer.nextInt();
        resultado = num1 + num2;
        System.out.println("El resultado es: " + resultado);
    }
    
}

