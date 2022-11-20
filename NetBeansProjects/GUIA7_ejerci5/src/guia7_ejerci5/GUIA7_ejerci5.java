package guia7_ejerci5;

import Servicio.CuentaBancariaServicio;
import entidad.CuentaBancaria;
import java.util.Scanner;

public class GUIA7_ejerci5 {

    public static void main(String[] args) {
        CuentaBancariaServicio Cb = new CuentaBancariaServicio();
        CuentaBancaria ban = Cb.crearCuenta();
        boolean condicionSwitch = false;
        do {

            System.out.println("Ingres Opcion A Realizar");
            System.out.println("1 Ingresar Saldo ");
            System.out.println("2 Retirar Saldo ");
            System.out.println("3 Extraccion Rapida ");
            System.out.println("4 Consultar Saldo ");
            System.out.println("5 Consultar Datos ");
            System.out.println("6 Salir ");
            Scanner leer = new Scanner(System.in);
            int opc = leer.nextInt();
            switch (opc) {
                case 1:
                    Cb.ingresar(ban);
                    break;
                case 2:
                    Cb.retirar(ban);
                    break;
                case 3:
                    Cb.extraccionRapida(ban);

                    break;
                case 4:
                    Cb.consultarSaldo(ban);
                    break;
                case 5:
                    Cb.consultarDatos(ban);
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
