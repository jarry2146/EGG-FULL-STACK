package Servicio;

import entidad.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AlumnoServicio {

    Scanner scan = new Scanner(System.in).useDelimiter("\n");

    ArrayList<Alumno> listaAlumno = new ArrayList(); // Creamos una lista de tipo Estudiante 

    public void menu() {

        int opc;
        do {
            System.out.println("Menu Escuela:\n"
                    + "1. Agregar alumno.\n"
                    + "2. Calcular nota final.\n"
                    + "3. Borrar alumno.\n"
                    + "4. Mostrar alumno.\n"
                    + "5. Salir. ");
            opc = scan.nextInt();
            switch (opc) {
                case 1:
                    this.agregarAlumno();
                    break;
                case 2:
                    this.cacularNotaFinal();
                    break;
                case 3:
                    this.eliminal();
                    break;
                case 4:
                    this.mostrarAlumno();
                    break;
                case 5:
                    System.out.println("Gracias adios: ");

                default:
                    System.out.println("La opcion no existe ");
            }

        } while (opc != 4);
    }

    public void agregarAlumno() {
        String respuesta;
        do {

            Alumno e1 = new Alumno(); // Creamos un objeto en cada vuelta para meterlo a nuestra lista

            System.out.println("Ingrese el nombre del estudiante");
            String nombre = scan.next();

            System.out.println("Ingrese la nota 1");
            int nota1 = scan.nextInt();
            System.out.println("Ingrese la nota 2");
            int nota2 = scan.nextInt();
            System.out.println("Ingrese la nota 3");
            int nota3 = scan.nextInt();

            e1.setNombre(nombre); // Seteamos el nombre
            e1.setNota1(nota1);
            e1.setNota2(nota2);
            e1.setNota3(nota2);

            listaAlumno.add(e1); // Agregamos el objeto llenado a la lista

            System.out.println("Quiere ingresar otro alumno ?"); // Y preguntamos si quiere ingresar otro alumno 
            respuesta = scan.next();

        } while (respuesta.equalsIgnoreCase("si"));
        Iterator<Alumno> it = listaAlumno.iterator();
        while (it.hasNext()) {
            Alumno auxal = it.next();
            System.out.println("nombre: " + auxal.getNombre());
            System.out.println("notas: " + auxal.getNota1() + "," + auxal.getNota2() + "," + auxal.getNota3());

        }
    }

    public void cacularNotaFinal() {
        System.out.println("Que estudiante quiere calcular su nota final? ");
        String nombreAlumno = scan.next();

        for (Alumno estudiante : listaAlumno) { // Recorremos la lista

            // Validamos si está el alumno que queremos calcular la nota final
            if (estudiante.getNombre().equalsIgnoreCase(nombreAlumno)) {

                // Usamos el objeto estudiante creado en el for each para llamar el metodo para calcular la nota final
                System.out.println("La nota final de "
                        + nombreAlumno + " es " + estudiante.notaFinal());
            }

        }

    }

    public void eliminal() {
        Iterator<Alumno> it2 = listaAlumno.iterator();

        boolean eliminado = false; // Usamos el booleano para mostrar si el alumno se elimino o no

        System.out.println("Que estudiante quiere eliminar ? ");
        String nombre = scan.next();

        while (it2.hasNext()) {

            if (it2.next().getNombre().equalsIgnoreCase(nombre)) {
                it2.remove();
                eliminado = true; // Cuando se elimina pasamos el booleano a true
            }

        }

    }

    public void mostrarAlumno() {
        for (Alumno alumno : listaAlumno) {
            System.out.println("nombre " + alumno.getNombre() + ": Las notas son " + alumno.getNota1() + "," + alumno.getNota2() + ","
                    + "" + alumno.getNota3());
        }

    }

}
