
package guia7_ejerci2;

import Circunferencia.CircunferenciaServicio;
import entida.Circunferencia;


public class GUIA7_ejerci2 {

   
    public static void main(String[] args) {
       
       CircunferenciaServicio Ls=new CircunferenciaServicio();
        Circunferencia area =Ls.crearCircunferencia();
         Ls.mostrarArea(area);
         Ls.mostrarPerimetro(area);
    }
    
   
}
