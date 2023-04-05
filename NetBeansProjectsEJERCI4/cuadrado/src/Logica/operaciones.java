package Logica;

import java.util.Random;

public class operaciones {

    public static void main(String[] args) {

        Random rnd = new Random();

        // Generamos dos números aleatorios entre 1 y 10
        int num1 = rnd.nextInt(10) + 1;
        int num2 = rnd.nextInt(10) + 1;

        // Generamos un número aleatorio entre 1 y 4 para seleccionar una operación al azar
        int operacion = rnd.nextInt(4) + 1;

        // Realizamos la operación seleccionada al azar y mostramos el resultado
        switch (operacion) {
            case 1: // Suma
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case 2: // Resta
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case 3: // Multiplicación
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case 4: // División
                System.out.println(num1 + " / " + num2 + " = " + ((double) num1 / num2));
                break;
            default:
                System.out.println("Operación no válida.");
                break;
        }
    }
}
