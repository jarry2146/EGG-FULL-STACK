package Logica;

import java.util.Scanner;

public class CalificacionesAlumnos {

    public static void main(String[] args) {

        // Crear objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Inicializar variable para almacenar el promedio
        double promedio;

        // Pedir al usuario que ingrese el nombre del alumno
        System.out.println("Ingrese el nombre del alumno:");
        String nombre = sc.nextLine();

        // Mientras el nombre no sea una cadena vacía
        while (!nombre.isEmpty()) {

            // Pedir al usuario que ingrese las notas del alumno
            System.out.println("Ingrese la nota práctica (10%):");
            double notaPractica = sc.nextDouble();
            System.out.println("Ingrese la nota de problemas (50%):");
            double notaProblemas = sc.nextDouble();
            System.out.println("Ingrese la nota teórica (40%):");
            double notaTeorica = sc.nextDouble();

            // Verificar que las notas estén dentro del rango de 0 a 10
            if (notaPractica >= 0 && notaPractica <= 10
                    && notaProblemas >= 0 && notaProblemas <= 10
                    && notaTeorica >= 0 && notaTeorica <= 10) {

                // Calcular el promedio de las notas
                promedio = (notaPractica * 0.1) + (notaProblemas * 0.5) + (notaTeorica * 0.4);

                // Mostrar el resultado por pantalla
                System.out.println("La nota final de " + nombre + " es: " + promedio);

            } else {
                // Mostrar un mensaje de error si alguna nota está fuera del rango permitido
                System.out.println("Las notas deben estar entre 0 y 10. No se pudo calcular el promedio.");
            }

            // Pedir al usuario que ingrese el nombre del siguiente alumno
            sc.nextLine();
            System.out.println("Ingrese el nombre del siguiente alumno (o presione enter para salir):");
            nombre = sc.nextLine();
        }

        // Cerrar el objeto Scanner
        sc.close();
    }
}
