package servicio;

import entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class PersonaServicio {

    public Persona crearPersona() {
        Scanner leer = new Scanner(System.in); 
        Persona nuevaPersona = new Persona();
        System.out.println("ingrese nombre.");
        nuevaPersona.setNombre(leer.next());
        
        System.out.println("ingrese edad.");
        nuevaPersona.setEdad(leer.nextInt());
        
        System.out.println("ingrese cedala.");
        nuevaPersona.setCedula(leer.nextInt());
        
        System.out.println("el nombre ingresado es " + nuevaPersona.getNombre());
        System.out.println("la edad ingresada es "+nuevaPersona.getEdad());
        System.out.println("la cedula ingresada es "+nuevaPersona.getCedula());
        return nuevaPersona;
    }

}
