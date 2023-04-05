package Logica;

import java.util.Arrays;
import java.util.Scanner;

public class OrdenarNombres {

    public static void main(String[] args) {
        
        // Crear objeto Scanner para leer la entrada del usuario
      Scanner sc = new Scanner(System.in);

      // Pedir al usuario que ingrese los nombres separados por comas
      System.out.println("Ingrese los nombres separados por comas:");
      String nombres = sc.nextLine();

      // Convertir la cadena de nombres en un arreglo de cadenas
      String[] arregloNombres = nombres.split(",");

      // Ordenar el arreglo alfabéticamente
      Arrays.sort(arregloNombres);

      // Mostrar los nombres ordenados en la consola
      System.out.println("Los nombres ordenados alfabéticamente son:");
      for (String nombre : arregloNombres) {
         System.out.println(nombre.trim()); // trim() elimina espacios en blanco
      }
    }
    
}
