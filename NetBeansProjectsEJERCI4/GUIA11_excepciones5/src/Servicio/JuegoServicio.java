package Servicio;

import Entidad.Juego;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class JuegoServicio {

    public Juego crearJuego() {
        Scanner leer = new Scanner(System.in);
        Juego j1 = new Juego();
        try {
            System.out.println("Ingrese un numero:");
            j1.setNumero(leer.nextInt());
        } catch (InputMismatchException a) {
            System.out.println("Error el dato ingresado no es un numero: ");
        }
        return j1;
    }

    public void adivinarNumero(Juego j1) {

        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(500);
        System.out.println("el numero es: " + numeroAleatorio);

        if (numeroAleatorio > j1.getNumero()) {
            System.out.println("El numero es mayor: ");
        } else {
            System.out.println("El numero es menor: ");

        }

    }

}
