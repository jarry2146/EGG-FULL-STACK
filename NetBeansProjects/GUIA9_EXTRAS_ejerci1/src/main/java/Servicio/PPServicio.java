package Servicio;

import Entidad.Perro;
import Entidad.Persona;
import java.util.Scanner;

public class PPServicio {
    


    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        Persona a = new Persona();
        System.out.println("Ingrese el nombre de la persona");
        a.setNombre(leer.next());
        System.out.println("Ingrese apellido");
        a.setApellido(leer.next());
        System.out.println("Ingrese edad");
        a.setEdad(leer.nextInt());
        System.out.println("Ingrese dni");
        a.setDni(leer.nextInt());
       
        // de la misma forma se ingresan los demas datos
        return a;

    }

    public Perro crearPerro() {
        Perro b = new Perro();
        System.out.println("Ingrese el nombre del perro");
        b.setNombre(leer.next());
        System.out.println("Ingrese raza");
        b.setRaza(leer.next());
        System.out.println("Ingrese edad");
        b.setEdad(leer.nextInt());
        System.out.println("Ingrese tamaño");
        b.setTamaño(leer.next());
        // de la misma forma se ingresan los demas datos
        return b;

    }
}
    

