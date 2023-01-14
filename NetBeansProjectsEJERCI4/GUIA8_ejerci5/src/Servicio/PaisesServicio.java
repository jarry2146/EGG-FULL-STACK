package Servicio;

import entidad.Paises;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class PaisesServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashSet<String> listaPaises = new HashSet();
    ArrayList<String> arraylist = new ArrayList(listaPaises);

    public void menu() {

        int opc;
        do {
            System.out.println("Menu Paises:\n"
                    + "1. Crear Paises.\n"
                    + "2. Ordenar paises.\n"
                    + "3. Eliminar  paises.\n "
                    + "4. Salir. ");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    this.crearPaises();
                    break;
                case 2:
                    this.ordenarPaises();
                    break;
                case 3:
                    this.eliminal();
                    break;
                case 4:
                    System.out.println("Usted a salido : ");
                    break;
                default:
                    System.out.println("La opcion no existe ");
            }

        } while (opc != 4);
    }

    public void crearPaises() {
        String respuesta;
        do {

            Paises p1 = new Paises();

            System.out.println("Ingrese el paises");
            String nombre = leer.next();

            p1.setPaises(nombre);

            listaPaises.add(nombre);

            System.out.println("Quiere ingresar otro pais ?");
            respuesta = leer.next();

        } while (respuesta.equalsIgnoreCase("si"));
        Iterator<String> it = listaPaises.iterator();
        while (it.hasNext()) {
            String auxal = it.next();
            System.out.println("nombre: " + auxal.toString());

        }

    }

    public void ordenarPaises() {

        for (String lis : listaPaises) {
            Collections.sort(arraylist);
            System.out.println(lis.toString());

        }
    }

    public void eliminal() {
        Iterator<String> it2 = listaPaises.iterator();

        boolean eliminado = false;

        System.out.println("Que pais quiere eliminar ? ");
        String pais = leer.next();

        while (it2.hasNext()) {

            if (it2.next().equalsIgnoreCase(pais)) {
                it2.remove();
                eliminado = true;

            }
        }

    }

}
