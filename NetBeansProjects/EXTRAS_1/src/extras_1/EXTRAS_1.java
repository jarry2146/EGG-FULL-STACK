package extras_1;

import Servicio.CancionServicio;
import entidad.Cancion;
import java.util.Scanner;

public class EXTRAS_1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CancionServicio Cn = new CancionServicio();
        Cancion Can = Cn.crearCancion();
        
        Cn.mostrarCancion(Can);
    }
    
}
