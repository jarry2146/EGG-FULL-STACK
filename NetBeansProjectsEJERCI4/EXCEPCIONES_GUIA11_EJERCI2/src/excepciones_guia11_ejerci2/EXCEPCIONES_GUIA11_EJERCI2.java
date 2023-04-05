package excepciones_guia11_ejerci2;

import Entidad.MiClase;

public class EXCEPCIONES_GUIA11_EJERCI2 {

    public static void main(String[] args) {
        MiClase miClase = new MiClase(5);

        try {
            miClase.setValor(3, 10);
            miClase.setValor(7, 20);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Se ha producido un error: " + e.getMessage());
        }

        try {
            int valor = miClase.getValor(7);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Se ha producido un error: " + e.getMessage());
        }
    }
}
    
    

