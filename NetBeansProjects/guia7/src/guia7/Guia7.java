package guia7;

import java.util.Scanner;
import servicio.PersonaServicio;

public class Guia7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PersonaServicio p1=new PersonaServicio();
        
        System.out.println(p1.crearPersona());

       // Persona p1 = new Persona("juan", 29, 5676999);
        // System.out.println(p1.nombre +" "+p1.edad+" "+p1.cedula+" ");
        //p1.setNombre("camilo andres");
       //p1.setEdad(40);

        
          //System.out.println(p1.getNombre());
    }
}
