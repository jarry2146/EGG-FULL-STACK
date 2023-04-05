package Logica;

import java.util.Scanner;

public class dias_semana {

    //Escribe un programa que pida al usuario un número
    //del 1 al 7 y muestre por pantalla el día de la semana correspondiente.
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce un numero del 1 al 7: ");
        int num = leer.nextInt();
        String dia;
        switch (num) {
            case 1:
                dia = "lunes";
                break;
            case 2:
                dia = "martes";
                break;
            case 3:
                dia = "miercoles";
                break;
            case 4:
                dia = "jueves";
                break;
            case 5:
                dia = "viernes";
                break;
            case 6:
                dia = "sabado";
                break;
            case 7:
                dia = "domingo";
                break;
            default:
                dia = "dia invalido";
                break;

        }
        System.out.println(dia);

    }

}
