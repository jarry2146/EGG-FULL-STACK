package herencias_guia10_ejerci2;

import Entidad.Lavadora;
import Entidad.Televisor;

public class Herencias_guia10_ejerci2 {

    public static void main(String[] args) {
//        Eletrodomestico e1=new Eletrodomestico();

        Lavadora lavadora = new Lavadora();
        lavadora.crearElectrodomestico();

        System.out.println("Precio final: $" + lavadora.precioFinal());

        Televisor television = new Televisor();
        television.crearElectrodomestico();

        System.out.println("Precio final: $" + television.precioFinal());
    }
}
