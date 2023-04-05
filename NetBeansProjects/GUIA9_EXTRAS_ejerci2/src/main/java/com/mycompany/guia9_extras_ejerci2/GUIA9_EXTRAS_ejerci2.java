package com.mycompany.guia9_extras_ejerci2;

import Entidad.Cine;
import Entidad.Espectador;
import Servicio.CineServicio;
import java.util.ArrayList;

public class GUIA9_EXTRAS_ejerci2 {

    public static void main(String[] args) {

        CineServicio cs = new CineServicio();
        Cine c = cs.abrirCine();
        ArrayList<Espectador> e = cs.crearPosiblesEspectadores();
        cs.recibirPosiblesEspectadores(c, e);
        cs.verSala(c);
        cs.revisarEspectadores(c);

    }
}
