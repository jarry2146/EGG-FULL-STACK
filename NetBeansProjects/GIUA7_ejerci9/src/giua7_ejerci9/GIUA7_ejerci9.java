package giua7_ejerci9;

import Servicios.MatematicaServicios;
import entidad.Matemática;

public class GIUA7_ejerci9 {

    public static void main(String[] args) {

        MatematicaServicios Ms = new MatematicaServicios();
       
        Matemática m1 = new Matemática();
     
            m1.setNum1((Math.random() * 10) + 1);
            m1.setNum2((Math.random() * 2) + 1);
            
            System.out.println("Numero1: " +m1.getNum1());
            System.out.println("Numero2: " +m1.getNum2());
            System.out.println(" ");
            Ms.devolverMayor(m1);
            System.out.println(" ");
            Ms.calcularPotencia(m1);
            Ms.calculaRaiz(m1);


        }
    }

