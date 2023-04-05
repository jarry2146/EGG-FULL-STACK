package com.mycompany.guia9_ejerci1;

import Servicio.Perro;
import entida.Persona;

public class GUIA9_ejerci1 {

    public static void main(String[] args) {

        Perro perro1 = new Perro();
        perro1.setNombre("tony");
        perro1.setRaza("doberman");
        perro1.setEdad(6);
        perro1.setTamano("mediano");

        Perro perro2 = new Perro();
        perro2.setNombre("gancy");
        perro2.setRaza("pastor aleman");
        perro2.setEdad(4);
        perro2.setTamano("grande");

        Persona persona1 = new Persona();
        persona1.setNombre("jarry");
        persona1.setApellido("zapata");
        persona1.setEdad(40);
        persona1.setDocumento(2345677);
        persona1.setPerro(perro1);

        Persona persona2 = new Persona();
        persona2.setNombre("jhon");
        persona2.setApellido("muñoz");
        persona2.setEdad(30);
        persona2.setDocumento(23454566);
        persona2.setPerro(perro2);

        System.out.println(persona1.toString());

        System.out.println(persona2.toString());

    }
}
