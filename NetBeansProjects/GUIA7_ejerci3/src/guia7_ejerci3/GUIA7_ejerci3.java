
package guia7_ejerci3;

import Operacion.Operacion;
import Servicio.OperacionServicio;


public class GUIA7_ejerci3 {

    
    public static void main(String[] args) {
        
        OperacionServicio Ln= new OperacionServicio();
        Operacion mat= Ln.crearOperacion();
        Ln.sumar(mat);
        Ln.resta(mat);
        Ln.multiplicacion(mat);
        Ln.divicion(mat);
    }
    
}
