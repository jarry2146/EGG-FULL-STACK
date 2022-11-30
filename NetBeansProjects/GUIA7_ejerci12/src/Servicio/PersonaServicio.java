package Servicio;

import entidad.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaServicio {

    public Persona crearPersona() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Persona p1 = new Persona();

        System.out.println("Ingresar nombre ");
        p1.setNombre(leer.next());
        System.out.println("Ingres la  fecha: Año, Mes y dia: ");

        p1.setAnio(leer.nextInt());

        p1.setMes(leer.nextInt());

        p1.setDia(leer.nextInt());

        return p1;

    }

    public void calcularEdad(Persona p1) {
        int anio = 0;
        int mes = 0;
        int dia = 0;
        Date fecha = new Date(anio, mes, dia);
        Date fechaActual = new Date();

        System.out.println("Su edad es: ");
        System.out.println(" " + (fechaActual.getYear() + 1900 - p1.getAnio() + " Años "));
        System.out.println("Con " + (fechaActual.getMonth() + 1 - p1.getMes() + " meses "));
        System.out.println("Y  " + (fechaActual.getDay() - p1.getDia() + " Dias "));

    }

    public void menorQue(Persona p1) {

        int edad;

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese esdad ");
        edad = leer.nextInt();

        if (p1.getAnio() <= edad) {

            System.out.println("verdadero " + edad);

        } else {

            if (p1.getAnio() > edad) {
                p1.setAnio(edad);
                System.out.println("es falso " + edad);
            }

        }
    }

    public void mostrarPersona(Persona p1) {
        System.out.println("su nombre es : " + p1.getNombre());
        System.out.println("tiene: " + p1.getAnio() + " años");
        System.out.println("con: " + p1.getMes() + " meses");
        System.out.println("y: " + p1.getDia() + " dias");

    }
}
