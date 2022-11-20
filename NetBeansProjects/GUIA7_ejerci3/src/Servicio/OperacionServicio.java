package Servicio;

import Operacion.Operacion;
import java.util.Scanner;

public class OperacionServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Operacion crearOperacion() {

        Operacion p1 = new Operacion();
        System.out.println("ingrese numero 1 ");
        p1.setNum1(leer.nextInt());
        System.out.println("ingrese numero 2 ");
        p1.setNum2(leer.nextInt());

        return p1;
    }

    public void sumar(Operacion p1) {
        int suma = p1.getNum1() + p1.getNum2();
        System.out.println("la suma es " + suma);
    }

    public void resta(Operacion p1) {
        int resta = p1.getNum1() - p1.getNum2();
        System.out.println("la resta es " + resta);
    }

    public void multiplicacion(Operacion p1) {
        if (p1.getNum1() !=0 && p1.getNum2() != 0) {
            double  mult = p1.getNum1() * p1.getNum2();
            System.out.println("la multiplicacion es " + mult);
        } else {
            System.out.println("error no se puede multiplicar por cero ingrese otro numero ");
        }

    }

    public void divicion(Operacion p1) {
        if (p1.getNum1() != 0 && p1.getNum2() != 0) {
            double div = p1.getNum1() / p1.getNum2();
            System.out.println("la divicion es " + div);
            //System.out.printf("%n la divicion es  %f ",div);

        } else {
            System.out.println("error no se pude dividir por cero ingrese otro numero ");
        }
    }
}
