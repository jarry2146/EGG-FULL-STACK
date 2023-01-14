package guia8_ejerci4;

import Servicio.PeliculaServicio;
import entidad.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

public class GUIA8_ejerci4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        PeliculaServicio Pel = new PeliculaServicio();
        ArrayList<Pelicula> listaPelicula = new ArrayList();
        Pel.menu();
    }

}
