/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class RectanguloServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Rectangulo crearRectangulo(){
      Rectangulo r1=new Rectangulo();
        System.out.println("ingresar base ");
        r1.setBase(leer.nextDouble());
        System.out.println("ingresar altura ");
        r1.setAltura(leer.nextDouble());
        return r1;
    }
    
     public void crearSuperficie(Rectangulo r1){
         double superficie=(r1.getBase())*(r1.getAltura());
         System.out.println("la supercicie es "+superficie);
     }
     public void crearPerimetro(Rectangulo r1){
         double perimetro=(r1.getBase())+(r1.getAltura());
         System.out.println("el perimetro es "+perimetro);
         
     }
     public void dibujarRectangulo(Rectangulo r1){
       
     
      for (int i = 0; i < r1.getBase(); i++) {
            
            for (int j = 0; j < r1.getAltura(); j++) {
                if (i == 0 || j == 0 || i==r1.getBase()-1||j==r1.getAltura()-1) {
          System.out.print("*");

                }else {
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.print("\n");
        }
     }
}



 
     

