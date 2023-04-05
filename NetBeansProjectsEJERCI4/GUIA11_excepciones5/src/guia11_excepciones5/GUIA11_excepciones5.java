package guia11_excepciones5;

import Entidad.Juego;
import Servicio.JuegoServicio;

public class GUIA11_excepciones5 {

    public static void main(String[] args) {
        JuegoServicio Gs = new JuegoServicio();
        Juego juego = Gs.crearJuego();
        Gs.adivinarNumero(juego);
    }
    
}
