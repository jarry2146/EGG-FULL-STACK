package herencias_guia10_ejerci4;

import Entidad.Circulo;
import Entidad.Rectangulo;

public class Herencias_guia10_ejerci4 {

    public static void main(String[] args) {
        Circulo cir=new Circulo(5);
        Rectangulo rec =new Rectangulo(4,6);
        
        System.out.println("El area del circulo es: "+cir.calcularArea());
        System.out.println("El perimetro del circulo es: "+cir.calcularPerimetro());
        System.out.println("El area del rectangulo es: "+rec.calcularArea());
        System.out.println("El perimetro del rectangulo es: "+rec.calcularPerimetro());
    }
    
}
