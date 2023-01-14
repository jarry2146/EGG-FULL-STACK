package guia8_ejerci2;

import Servicio.AlumnoServicio;
import entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class GUIA8_ejerci3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        AlumnoServicio Alu=new AlumnoServicio();
        ArrayList<Alumno> listaAlumno = new ArrayList(); // Creamos una lista de tipo Estudiante 
      Alu.menu();
    }
}

