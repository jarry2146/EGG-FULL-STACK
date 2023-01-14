 package Servicio;

import static Servicio.MascotaServicio.leer;
import entidad.Mascota;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class MascotaServicio {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    ArrayList<Mascota> ListaMascota = new ArrayList();

    public void menu() {

        boolean con = false;

        do {

            System.out.println("Eliga una opcion:");
            System.out.println("");
            System.out.println("1 Crear Raza:");
            System.out.println("2 Eliminar  Raza:");
            System.out.println("3 Mostrar Raza:");
            System.out.println("4 Salir:");

            int opc = leer.nextInt();

            switch (opc) {
                case 1:
                    this.crearRaza();

                    break;
                case 2:
                    this.eliminarRaza();
                    break;
                case 3:
                    this.mostrarRaza();
                    break;
                case 4:

                    System.out.println("A salido ");
                    for (Mascota auxal : ListaMascota) {
                        System.out.println("Las raza son: " + auxal.getRaza());
                    }

                    con = true;
                    break;
                default:
                    System.out.println("La raza no esta en la lista ");

            }
        } while (con == false);

    }

    public void crearRaza() {
        String otra;

        do {
            Mascota p1 = new Mascota();
            System.out.println("ingresar raza:");
            String raza = leer.next();
            p1.setRaza(raza);
//        p1.setRaza(leer.next());
//        ListaMascota.add(crearRaza());
            System.out.println(p1.toString());
            ListaMascota.add(p1);

            System.out.println("Ingresar otro  raza (SI para agregar) o (NO para salir)  ?"); // Y preguntamos si quiere ingresar otro alumno 
            otra = leer.next();

        } while (otra.equalsIgnoreCase("si"));
        Iterator<Mascota> it = ListaMascota.iterator();
        while (it.hasNext()) {
            Mascota auxal = it.next();
            System.out.println("Raza: " + auxal.getRaza());

        }

    }

    public void eliminarRaza() {
        Iterator<Mascota> ite = ListaMascota.iterator();
        System.out.println("ingrese la raza a eliminar.");
        String nombre = leer.next();
        while (ite.hasNext()) {
            if (ite.next().getRaza().equalsIgnoreCase(nombre)) {
                ite.remove();

                System.out.println("Lista de razas: ");
                for (Mascota mascota : ListaMascota) {

                    System.out.println(mascota.getRaza());
                }

            }

        }
    }

    public void mostrarRaza() {
        System.out.println("Mostrar razas");
        for (Mascota aux : ListaMascota) {
            System.out.println(aux.getRaza());

        }
    }
}
