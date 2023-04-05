package Logica;

import java.util.Scanner;

public class cuadrado {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del lado del cuadrado: ");
        int size = scan.nextInt();
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
    
    

