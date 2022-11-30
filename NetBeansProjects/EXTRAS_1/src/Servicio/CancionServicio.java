package Servicio;

import entidad.Cancion;
import java.util.Scanner;

public class CancionServicio {

    public Cancion crearCancion() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Cancion c1 = new Cancion();
        System.out.println("Ingrese Titulo ");
        c1.setTitulo(leer.next());
        System.out.println("Ingrese Autor ");
        c1.setAutor(leer.next());
        System.out.println("Ingrese Genero ");
        c1.setGenero(leer.next());
        System.out.println("Ingrese Duracion ");
        c1.setDuracion(leer.nextInt());

        return c1;
    }

    public void mostrarCancion(Cancion c1) {


        
        System.out.println("titulo "+c1.getTitulo());
        System.out.println("autor "+c1.getAutor());
        System.out.println("genero "+c1.getGenero());
        System.out.println("duracion "+c1.getDuracion());
    }

}
