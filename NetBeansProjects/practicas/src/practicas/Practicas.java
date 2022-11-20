package practicas;

import concesionario.Carro;
import java.util.Scanner;

public class Practicas {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //System.out.println("ingrese nombre");
        //leer.next();
        Carro n1 = new Carro("renault", "logan", "gris", "baja", "automovil");
        System.out.println(n1.nombre + " "+ n1.marca + " " + n1.color + " " + n1.gama + " " + n1.tipo + " ");
    }

}
