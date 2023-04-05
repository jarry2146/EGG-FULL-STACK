package Logica;

import java.util.Scanner;

public class SueldoMinimo {

    public static void main(String[] args) {
        
        // Crear objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario que ingrese su sueldo actual
        System.out.println("Ingrese su sueldo actual:");
        double sueldoActual = sc.nextDouble();

        // Pedir al usuario que ingrese el sueldo mínimo
        System.out.println("Ingrese el sueldo mínimo:");
        double sueldoMinimo = sc.nextDouble();

        // Verificar si el sueldo actual es mayor al sueldo mínimo y mostrar un mensaje por pantalla
        if (sueldoActual > sueldoMinimo) {
            System.out.println("Su sueldo es mayor al sueldo mínimo.");
        } else {
            System.out.println("Su sueldo es igual o menor al sueldo mínimo.");
        }
    }
    
}
