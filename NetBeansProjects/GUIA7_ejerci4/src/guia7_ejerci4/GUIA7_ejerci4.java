
package guia7_ejerci4;

import Servicio.RectanguloServicio;
import entidad.Rectangulo;


public class GUIA7_ejerci4 {

    
    public static void main(String[] args) {
      RectanguloServicio Ls=new RectanguloServicio();
        Rectangulo rec =Ls.crearRectangulo();
         Ls.crearSuperficie(rec);
         Ls.crearPerimetro(rec);
         Ls.dibujarRectangulo(rec);
    }
    
}
