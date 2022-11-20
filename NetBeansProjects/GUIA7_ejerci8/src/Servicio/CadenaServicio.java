package Servicio;

import entidad.Cadena;
import java.util.Scanner;

public class CadenaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cadena mostrarBocales() {
        Cadena b1 = new Cadena();
        int contador1 = 0, contador2 = 0, consonante;
        System.out.println("Ingrese Una Frase ");
        String palabra = leer.nextLine();
        // b1.setFrase(leer.nextLine());

        for (int x = 0; x < palabra.length(); x++) {
            contador1++;
        }
        for (int x = 0; x < palabra.length(); x++) {

            if ((palabra.charAt(x) == 'a') || (palabra.charAt(x) == 'e')
                    || (palabra.charAt(x) == 'i') || (palabra.charAt(x) == 'o')
                    || (palabra.charAt(x) == 'u')) {
                contador2++;
                b1.setFrase(palabra);
                consonante = contador1 - contador2;
                System.out.println("la frase " + b1.getFrase() + " contiene " + contador2 + " vocales ");
                // System.out.println("la frase " + b1.getFrase() + " contiene " + consonante + " consonantes  ");

            }

        }
        return b1;
    }

    public void invertirFrase(Cadena b1) {
        System.out.println("Invertir Frase");
        for (int i = b1.getFrase().length() - 1; i >= 0; i--) {
            System.out.print(" " + b1.getFrase().charAt(i));
        }

        System.out.println("");
    }

    public void vecesRepetido(Cadena b1) {
        String cadena = "";
        char[] arraycadena;
        char caracter;
        int contador = 0;
        System.out.println("Escribe Una Frase Para saber cuantas veses esta repetida ");
        cadena = leer.nextLine();
        arraycadena = cadena.toCharArray();
        for (int i = 0; i < arraycadena.length; i++) {
            caracter = arraycadena[i];

            for (int j = 0; j < arraycadena.length; j++) {
                if (arraycadena[j] == caracter) {
                    contador++;
                }
            }
            System.out.println(arraycadena[i] + " " + contador);
            contador = 0;
        }
    }

    public void compararLongitud(Cadena b1) {

        String palabra2 = "";

        System.out.println("Ingrese una Frase para comparar longutud ");
        palabra2 = leer.nextLine();

        if (b1.getFrase().equals(palabra2)) {
            System.out.println("Las dos frases son iguales");
        } else {
            System.out.println("Las dos frases son distintas");
        }
    }

    public void unirFrases(Cadena b1) {

        System.out.println("Ingrese una Frase para unir ");
        String fra = leer.nextLine();
        b1.setFrase(fra + b1.getFrase());
        System.out.println("" + b1.getFrase());
    }

    public void reemplazar(Cadena b1) {
        System.out.println("ingrese Frase A Remplazar Que contengan -A- ");
        String c = leer.nextLine();

        System.out.println(c.replace('a', '*'));

    }

    public boolean contiene(Cadena b1) {
        System.out.println("ingrese Letra A Comprobar ");
        String cadena = leer.nextLine();
        for (int x = 0; x < cadena.length(); x++) {
            char c = cadena.charAt(x);
            b1.setFrase(cadena);
            // Si no está entre a y z, ni entre A y Z, ni es un espacio
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == ' ')) {
                System.out.println("" + b1.getFrase());
                return false;
            }
        }
        return true;

    }

}
