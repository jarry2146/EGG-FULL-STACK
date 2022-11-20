package Servicio;

import entidad.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Cafetera IniciarCafetera() {
        int capacidad;
        Cafetera cf = new Cafetera();
        System.out.println("Ingrese capacidad ");

        capacidad = leer.nextInt();

        cf.setCapacidadMaxima(capacidad);
        
        return cf;
    }

    public Cafetera llenarCafetera(Cafetera cf) {
   
        cf.setCantidadActual(cf.getCapacidadMaxima());
        return cf;
    }

    public void servirTaza(Cafetera cf) {
        int servirTaza;
        System.out.println("Tamaño de la a servir ");
        servirTaza = leer.nextInt();
       
        if (servirTaza > cf.getCantidadActual()) {
            System.out.println("la taza se llena con  " +  cf.getCantidadActual());
            cf.setCantidadActual(0);
        } else {
            cf.setCantidadActual(cf.getCantidadActual() - servirTaza);
            System.out.println("la taza esta llena ");
        }

      
    }

    public void vaciarCafetera(Cafetera cf) {
        
        System.out.println("Vaciando cafetera ");
        
        cf.setCantidadActual(0);
        
    }

    public void agregarCafe(Cafetera cf) {
      int denuevo=0;
        int agregarcafe;
        do{
        System.out.println("Agregar cafe");
        agregarcafe=leer.nextInt();
        if(agregarcafe<=(cf.getCapacidadMaxima()-cf.getCantidadActual()) ){
          cf.setCantidadActual(agregarcafe+cf.getCantidadActual());
          denuevo=0;
        }
        else{
                System.out.println("la cantidad a ingresar supera la canpacidad maxima intente de vuevo");
                denuevo++;
                }
        
        }
         while(denuevo>0);
            
       
    }
    public void MostrarCafetera(Cafetera cf) {
        System.out.println("la cafetera tiene "+cf.getCantidadActual());
        System.out.println("capacidad maxima "+cf.getCapacidadMaxima());
    }
}

