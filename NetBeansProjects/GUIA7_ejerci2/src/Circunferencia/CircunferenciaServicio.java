/*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia area=PI* radio*radio.
e) Método perimetro(): para calcular el perímetro perimetro=2*PI*radio
*/
package Circunferencia;

import entida.Circunferencia;
import static java.lang.Math.PI;
import java.util.Scanner;


public class CircunferenciaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Circunferencia crearCircunferencia(){
        
        Circunferencia p1=new Circunferencia();
        
        System.out.println("ingrese Circunferencia  ");
        p1.setRadio(leer.nextDouble());
        return p1;
    }

    
    public void mostrarArea(Circunferencia p1) {
      
        double area=PI *(p1.getRadio())*(p1.getRadio());
         System.out.println("el area es "+area); 
         
      
                }
    
    public void mostrarPerimetro(Circunferencia p1){
        
       double perimetro= 2* PI *p1.getRadio();
        System.out.println("el perimetro es "+perimetro);
        System.out.println(p1.toString());
        
       
    }

  

   
}
