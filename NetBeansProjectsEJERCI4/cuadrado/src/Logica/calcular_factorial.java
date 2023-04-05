package Logica;

import java.util.Scanner;

public class calcular_factorial {

    public static void main(String[] args) {
Scanner leer =new Scanner(System.in);
        System.out.println("ingrese numero: ");
        int num=leer.nextInt();
        int factorial=1;
        for (int i = 1; i <= num; i++) {
            factorial *=i;
            
            
        }
        System.out.println(num+"!= " + factorial);
        
        
//        Scanner input = new Scanner(System.in);
//        System.out.print("Ingresa un número: ");
//        int num = input.nextInt();
//
//        int factorial = 1;
//        for (int i = 1; i <= num; i++) {
//            factorial *= i;
//        }
//        System.out.println(num + "! = " + factorial);

    }

}
