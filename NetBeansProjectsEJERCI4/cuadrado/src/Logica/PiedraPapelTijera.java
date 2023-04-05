package Logica;

import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera {

    public static void main(String[] args) {
// Crear objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Crear objeto Random para generar la jugada de la computadora
        Random rand = new Random();

        // Pedir al usuario que ingrese su jugada
        System.out.println("Ingrese su jugada (piedra, papel o tijera):");
        String jugadaUsuario = sc.nextLine().toLowerCase();

        // Generar la jugada de la computadora de forma aleatoria
        int jugadaComputadoraInt = rand.nextInt(3); // 0 = piedra, 1 = papel, 2 = tijera
        String jugadaComputadora = "";
        if (jugadaComputadoraInt == 0) {
            jugadaComputadora = "piedra";
        } else if (jugadaComputadoraInt == 1) {
            jugadaComputadora = "papel";
        } else {
            jugadaComputadora = "tijera";
        }

        // Mostrar las jugadas del usuario y la computadora
        System.out.println("Usted jugó: " + jugadaUsuario);
        System.out.println("La computadora jugó: " + jugadaComputadora);

        // Determinar el resultado del juego
        if (jugadaUsuario.equals(jugadaComputadora)) {
            System.out.println("Empate!");
        } else if ((jugadaUsuario.equals("piedra") && jugadaComputadora.equals("tijera"))
                || (jugadaUsuario.equals("papel") && jugadaComputadora.equals("piedra"))
                || (jugadaUsuario.equals("tijera") && jugadaComputadora.equals("papel"))) {
            System.out.println("Ganaste!");
        } else {
            System.out.println("Perdiste!");
        }
    }

}
