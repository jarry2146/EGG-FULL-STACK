package Servicios;

import entidad.Matemática;
import java.util.Scanner;

public class MatematicaServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    Matemática m1 = new Matemática();

    public void devolverMayor(Matemática m1) {
        double mayor = 0;
        mayor = Math.max(m1.getNum1(), m1.getNum2());
        m1.setNum1(mayor);
        m1.setNum2(mayor);

        System.out.println("El numero Mayor es " +m1.getNum1()+(m1.getNum2()));

    }

    public void calcularPotencia(Matemática m1) {
        Math.exp(m1.getNum1()*m1.getNum2());
       // Math.exp(m1.getNum2());
        m1.setNum1(m1.getNum1());
        m1.setNum2(m1.getNum2());
        System.out.println("La Potencia es " + Math.round(m1.getNum1() + Math.round(m1.getNum2())));
         System.out.println(" ");
    }

    public void calculaRaiz(Matemática m1) {
        double minimo = 0;
        minimo = Math.min(m1.getNum1(), m1.getNum2());
        m1.setNum1(minimo);
        m1.setNum2(minimo);

        Math.sqrt(m1.getNum1());
        Math.sqrt(m1.getNum2());
        m1.setNum1(m1.getNum1());
        m1.setNum2(m1.getNum2());

       
       
        System.out.println("La Raiz Cuadrada es :" + Math.abs(m1.getNum1() + Math.abs(m1.getNum2())));
        
//        round(double a) 
//        sqrt(double a) 
    }

}
