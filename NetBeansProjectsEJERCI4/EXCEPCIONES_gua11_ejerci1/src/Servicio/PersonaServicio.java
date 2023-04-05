package Servicio;

import Entidad.Persona;
import java.util.Scanner;

public class PersonaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona CrearPersona() throws Exception {

        Persona p1 = new Persona();
        System.out.println("Ingrese Otro Nombre ");
        p1.setNombre(leer.next());
        System.out.println("Ingrese Edad ");
        p1.setEdad(leer.nextInt());

        System.out.println("Ingrese Sexo  H hombre M mujer O para otro ");
        String sexo = leer.next();
        if (sexo.equalsIgnoreCase("H") || sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("O")) {
            p1.setSexo(sexo);

            System.out.println("Ingrese Peso ");
            p1.setPeso(leer.nextInt());

            System.out.println("Ingrese Altura ");
            p1.setAltura(leer.nextFloat());
        }
        return p1;
    }
//
//    public void calcularIMC(Persona p1) {
//
//        float imc1 = (p1.getPeso() / (p1.getAltura() * p1.getAltura()));
//
//        if (imc1 > 20) {
//            p1.setImc(-1);
//
//        } else if ((imc1 >= 20) && (imc1 <= 25)) {
//            p1.setImc(0);
//        } else if (imc1 > 25) {
//            p1.setImc(1);
//        }
//
//    }

    public void esMayorDeEdad(Persona p1) throws Exception {
        try {
            if (p1.getEdad() >= 18) {
                p1.setMym(true);
                System.out.println("Es mayor de edad");

            } else {
                p1.setMym(false);

                System.out.println("Es menor de edad");
            }

        } catch (Exception a) {
            System.out.println("Error no se encuentra una obccion valida: ");
        }
    }
}
