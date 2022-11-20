
package guia7_ejerci6;

import Servicio.CafeteraServicio;
import entidad.Cafetera;
import java.util.Scanner;


public class GUIA7_ejerci6 {

    
    public static void main(String[] args) {
      CafeteraServicio Cf = new CafeteraServicio();
        Cafetera caf = Cf.IniciarCafetera();
        boolean condicionSwitch = false;
        do {

            System.out.println("Ingres Opcion A Realizar");
            System.out.println("1 llenar Cafetera ");
            System.out.println("2 servir Taza ");
            System.out.println("3 vaciar Cafetera ");
            System.out.println("4 agregar Cafe ");
            System.out.println("5 Mostrar Cafetera ");
            System.out.println("6 Salir ");
            Scanner leer = new Scanner(System.in);
            int opc = leer.nextInt();
            switch (opc) {
                case 1:
                     Cf.llenarCafetera(caf);
                    break;
                case 2:
                    Cf.servirTaza(caf);
                    break;
                case 3:
                     Cf.vaciarCafetera(caf);

                    break;
                case 4:
                   Cf.agregarCafe(caf);
                    break;
                case 5:
                   Cf.MostrarCafetera(caf);
                    break;
                case 6:
                    System.out.println("usted a terminado la operacion ");
                    condicionSwitch = true;
                    break;
                default:
                    System.out.println("esa opcion no es valida ");
            }
        } while (condicionSwitch == false);
    }

}
