package guia7_ejerci8;

import Servicio.CadenaServicio;
import entidad.Cadena;
import java.util.Scanner;

public class GUIA7_ejerci8 {

    public static void main(String[] args) {
        CadenaServicio Ls = new CadenaServicio();
        Cadena cad = Ls.mostrarBocales();
        System.out.println("");
        boolean condicionSwitch = false;
        do {

            System.out.println("Ingres Opcion A Realizar");
            System.out.println(" ");
            System.out.println("1 invertir Frase ");
            System.out.println("2 veces Repetido ");
            System.out.println("3 comparar Longitud ");
            System.out.println("4 unir Frases ");
            System.out.println("5 reemplazar ");
            System.out.println("6 contiene ");
            System.out.println("7 Salir ");
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
            int opc = leer.nextInt();
            switch (opc) {
                case 1:
                    Ls.invertirFrase(cad);
                    break;

                case 2:
                    Ls.vecesRepetido(cad);
                    break;

                case 3:
                    Ls.compararLongitud(cad);
                    break;

                case 4:
                    Ls.unirFrases(cad);
                    break;

                case 5:
                    Ls.reemplazar(cad);
                    break;
                case 6:
                    Ls.contiene(cad);
                    break;

                case 7:
                    System.out.println("usted a terminado la operacion ");
                    condicionSwitch = true;
                    break;
                default:
                    System.out.println("esa opcion no es valida ");
            }
        } while (condicionSwitch == false);
    }

}
