package extras_2;

import Servicio.PuntoServicio;
import entidad.Punto;
import java.util.Scanner;

public class EXTRAS_2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PuntoServicio Pn = new PuntoServicio();
        Punto pun = Pn.crearPunto();
        Pn.calcularpunto(pun);
    }
    
}
