//Realiza una aplicación que nos pida un número de ventas a introducir,
//después nos pedirá tantas ventas por teclado como número de ventas se
//hayan indicado. Al final mostrara la suma de todas las ventas. Piensa 
//que es lo que se repite y lo que no.
package Logica;

import java.util.Scanner;

public class Ventas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedimos el número de ventas a introducir
        System.out.print("Introduce el número de ventas a introducir: ");
        int numVentas = sc.nextInt();

        int suma = 0;

        // Pedimos las ventas por teclado y las sumamos
        for (int i = 1; i <= numVentas; i++) {
            System.out.print("Introduce la venta " + i + ": ");
            int venta = sc.nextInt();
            suma += venta;
        }

        // Mostramos la suma de todas las ventas
        System.out.println("La suma de todas las ventas es: " + suma);

        sc.close();
    }
}
