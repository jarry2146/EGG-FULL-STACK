package guia7_ejerci12;

import Servicio.PersonaServicio;
import entidad.Persona;
import java.util.Scanner;

public class GUIA7_ejerci12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PersonaServicio Pr = new PersonaServicio();
        Persona Per = Pr.crearPersona();
        boolean salir = false;
        do {
            System.out.println(" 1 calcular edad ");
            System.out.println(" 2 edad menor que ");
            System.out.println(" 3 mostrar persona ");
            System.out.println(" 4 salir ");
            int opc = leer.nextInt();
            switch (opc) {
                case 1:
                    Pr.calcularEdad(Per);
                    break;
                case 2:
                    Pr.menorQue(Per);
                    break;
                case 3:
                    Pr.mostrarPersona(Per);
                    break;
                case 4:
                    System.out.println("se a serrado operacion ");
                    salir = true;
                    break;
                default:
                    System.out.println("el numero es incorrecto ");
            }
            System.out.println("");
        } while (salir == false);

    }

}
