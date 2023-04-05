package Logica;

import java.util.Scanner;

public class imprimir_imparess {
//Imprimir los números impares desde 1 hasta 100.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }

        }
    }
}
