package herencias_guia10_ejerci1;

import entidad.Animal;
import entidad.Caballo;
import entidad.Gato;
import entidad.Perro;


public class Herencias_guia10_ejerci1 {

    public static void main(String[] args) {


        Animal P1 = new Perro("tony ", " consentrado " , 3 , " doberman ");
        P1.Alimentarse();
        
        Animal G1 = new Gato("pacho ", " croquetas " , 5 , " angora ");
        G1.Alimentarse();
        
        Animal C1 = new Caballo("corsel ", " pasto " , 7 , " pony ");
        C1.Alimentarse();
        

        }
    }


