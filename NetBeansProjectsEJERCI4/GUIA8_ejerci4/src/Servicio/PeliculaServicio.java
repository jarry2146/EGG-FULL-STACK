package Servicio;

import entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class PeliculaServicio {

    Scanner scan = new Scanner(System.in).useDelimiter("\n");

    ArrayList<Pelicula> listaPelicula = new ArrayList();

    public void menu() {

        int opc;
        do {
            System.out.println("Menu Peliculas:\n"
                    + "1. Crear Pelicula.\n"
                    + "2. Mostrar Todas las Pelicula.\n"
                    + "3. Mostrar Pelucula Mayor a una Hora.\n"
                    + "4. Ordenar de Mayor a Menor.\n"
                    + "5. Ordenar de Menor a Mayor.\n"
                    + "6. Oredenar Por Titulo Alfabeticamente.\n"
                    + "7. Oredenar Por Director Alfabeticamente.\n"
                    + "8. Salir. ");
            opc = scan.nextInt();
            switch (opc) {
                case 1:
                    this.crearPelicula();
                    break;
                case 2:
                    this.mostrarPelicula();
                    break;
                case 3:
                    this.mostrarPeliculaMayorHora();
                    break;
                case 4:
                    this.ordenarMayorMenor();
                    break;
                case 5:
                    this.ordenarMenorMayor();
                    break;
                case 6:
                    this.ordenarPorTitulo();
                    break;
                case 7:
                    this.ordenarPorDirector();
                    break;
                case 8:
                    System.out.println("Gracias adios: ");

                default:
                    System.out.println("La opcion no existe ");
            }

        } while (opc != 8);
    }

    public void crearPelicula() {
        String respuesta;
        do {

            Pelicula p1 = new Pelicula();

            System.out.println("Ingrese el nombre de la pelicula");
            String nombre = scan.next();
            System.out.println("Ingrese director");
            String director = scan.next();
            System.out.println("Ingrese duracion ");
            Double duracion = scan.nextDouble();

            p1.setNombre(nombre);
            p1.setDirector(director);
            p1.setDuracionPeliculaH(duracion);

            listaPelicula.add(p1);

            System.out.println("Quiere ingresar otra pelicula ?");
            respuesta = scan.next();

        } while (respuesta.equalsIgnoreCase("si"));
        Iterator<Pelicula> it = listaPelicula.iterator();
        while (it.hasNext()) {
            Pelicula auxal = it.next();
            System.out.println("nombre: " + auxal.getNombre());
            System.out.println("director: " + auxal.getDirector());
            System.out.println("duracion: " + auxal.getDuracionPeliculaH());

        }
    }

    public void mostrarPelicula() {
        for (Pelicula pelicula : listaPelicula) {
            System.out.println(pelicula.getNombre());

        }

    }

    public void mostrarPeliculaMayorHora() {

        for (Pelicula pelicula : listaPelicula) {

            if (pelicula.getDuracionPeliculaH() > 60) {
                System.out.println(pelicula.getNombre());
                System.out.println(pelicula.getDuracionPeliculaH());

            }

        }

    }

    public void ordenarMayorMenor() {

        for (Pelicula pelicula : listaPelicula) {

            Comparator<Integer> comparador = Collections.reverseOrder();

            System.out.println(pelicula.getNombre());
            System.out.println(pelicula.getDuracionPeliculaH());

        }

    }

    public void ordenarMenorMayor() {
        for (Pelicula pelicula : listaPelicula) {
            Collections.reverse(listaPelicula);
            System.out.println(pelicula.getNombre());
            System.out.println(pelicula.getDuracionPeliculaH());
        }

    }

    public void ordenarPorTitulo() {
        for (Pelicula Pelicula : listaPelicula) {
            listaPelicula.add(Pelicula);
            System.out.println("Titulo " + Pelicula.getNombre());

        }

    }

    public void ordenarPorDirector() {
        for (Pelicula pelicula : listaPelicula) {
//          Collections.sort(listaPelicula);
            System.out.println(pelicula.getDirector());
           
        }

    }
}
