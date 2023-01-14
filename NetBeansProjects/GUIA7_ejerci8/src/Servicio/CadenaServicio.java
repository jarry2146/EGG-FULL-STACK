package Servicio;

import entidad.Cadena;
import java.util.Scanner;

public class CadenaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cadena mostrarBocales() {
        Cadena b1 = new Cadena();
        int contador1 = 0, contador2 = 0, consonante;
        System.out.println("Ingrese Una Frase ");
        String palabra = leer.next();
        // b1.setFrase(leer.nextLine());

        for (int x = 0; x < palabra.length(); x++) {

            if ((palabra.charAt(x) == 'a') || (palabra.charAt(x) == 'e')
                    || (palabra.charAt(x) == 'i') || (palabra.charAt(x) == 'o')
                    || (palabra.charAt(x) == 'u')) {
                contador2++;
                b1.setFrase(palabra);
               // consonante = contador1 - contador2;
               
                // System.out.println("la frase " + b1.getFrase() + " contiene " + consonante + " consonantes  ");

            }
 
        }
        System.out.println("la frase " + b1.getFrase() + " contiene " + contador2 + " vocales ");
        b1.setLongitud(palabra.length());
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
        String cadena;

        int contador = 0;
        System.out.println("Escribe Un catacter ");
        cadena = leer.next();

        for (int j = 0; j < b1.getLongitud(); j++) {
            if (cadena.equalsIgnoreCase(b1.getFrase().substring(j, j + 1))) {
                contador++;
            }
        }

        System.out.println("tu caracter se encuentra  " + contador + " veces ");
    }

    public void compararLongitud(Cadena b1) {

        String palabra2 = "";

        System.out.println("Ingrese una Frase para comparar longutud ");
        palabra2 = leer.next();

        if (b1.getLongitud()==(palabra2.length())) {
            System.out.println("Las dos frases son iguales");
        } else if(b1.getLongitud()>palabra2.length()) {
            System.out.println("La palabra ingresada es mas corta que la iniciada ");
        }
        else{
            System.out.println("la palabra ingresada es mas larga que la incial ");
        }
        
    }

    public void unirFrases(Cadena b1) {

        System.out.println("Ingrese una Frase para unir ");
        String fra = leer.next();
        b1.setFrase(fra + b1.getFrase());
        System.out.println("" + b1.getFrase());
    }

    public void reemplazar(Cadena b1) {
        System.out.println("ingrese Frase A Remplazar Que contengan -A- ");
        String c = leer.next();

        System.out.println(c.replace('a', '*'));

    }

    public void contiene(Cadena b1) {
        String cadena;

        int contador = 0;
        System.out.println("Escribe Un catacter ");
        cadena = leer.next();

        for (int j = 0; j < b1.getLongitud(); j++) {
            if (cadena.equalsIgnoreCase(b1.getFrase().substring(j, j + 1))) {
                contador++;
            }
        }
        if(contador ==0){
            System.out.println("el caracter no se encuentra ");
            
            
        }
        else{
            System.out.println("el caracter  se encuentra ");
        }
    }
}

    


