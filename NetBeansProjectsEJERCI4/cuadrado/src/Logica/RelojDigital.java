package Logica;
import java.text.SimpleDateFormat;
import java.util.Date;
public class RelojDigital {

    public static void main(String[] args) {
        while (true) { // Bucle infinito para actualizar el reloj cada segundo
            Date fechaActual = new Date(); // Obtenemos la fecha y hora actual
            SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss"); // Creamos un formato para la hora
            
            // Mostramos la hora actual en consola
            System.out.print("\r" + formatoHora.format(fechaActual));
            
            try {
                Thread.sleep(1000); // Esperamos 1 segundo antes de actualizar el reloj
            } catch (InterruptedException ex) {
                // Manejamos la excepción en caso de que ocurra
            }
        }
    }
}
    