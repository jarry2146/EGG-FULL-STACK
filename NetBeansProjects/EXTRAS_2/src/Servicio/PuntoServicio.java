package Servicio;

import entidad.Punto;
import java.util.Locale;
import java.util.Scanner;

public class PuntoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

//    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Punto pun1 = new Punto();
    
    public Punto crearPunto() {
        System.out.println("Ingrese Cordenadas x ");
        pun1.setX1(leer.nextInt());
        System.out.println("Ingrese Cordenadas y ");
        pun1.setY1(leer.nextInt());
//        System.out.println("Ingrese Cordenadas x2 ");
//        pun1.setX2(leer.nextInt());
//        System.out.println("Ingrese Cordenadas y2 ");
//        pun1.setY2(leer.nextInt());
        
        return pun1;
    }
    
    public void calcularpunto(Punto pun1) {
        
        if (pun1.getX1() < pun1.getY1() && pun1.getX2() > pun1.getY2()) {
            pun1.setX1(0);
            pun1.setY1(0);
            
            System.out.println("las cordenadas son " + pun1.getX1());
            System.out.println("las cordenadas son " + pun1.getY1());
            
        } else {
            if (pun1.getX1() < pun1.getY1() && pun1.getX2() > pun1.getY2()) {
                
                System.out.println("las cordenadas " + pun1.getX2());
                System.out.println("las cordenadas " + pun1.getY2());
            }
            
        }
    }
}
    

