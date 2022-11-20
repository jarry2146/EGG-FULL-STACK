
package paquete;

import Servicio.LibroServicio;
import entida.Libro;


public class MainLibro {

   
    public static void main(String[] args) {
        LibroServicio Ls=new LibroServicio();
        Libro obra=Ls.CargarLibro();
        Ls.MostrarLibro(obra);
      
             
    }
    
}
