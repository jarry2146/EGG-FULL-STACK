package Logica;

import java.util.Scanner;

public class vocal_consonante {

    //Escribe un programa que pida al usuario una letra y
    //muestre por pantalla si es una vocal o una consonante.
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce una letra: ");
        char letra = leer.next().charAt(0);
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("es una vocal: ");
        } else {
            System.out.println("es una consonante: ");

        }
    }

}
