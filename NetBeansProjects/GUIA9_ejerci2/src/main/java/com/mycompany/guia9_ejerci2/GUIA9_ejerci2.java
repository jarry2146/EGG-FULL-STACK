package com.mycompany.guia9_ejerci2;

import entidad.Juego;

public class GUIA9_ejerci2 {

 public static void main(String[] args) {

 Juego juego = new Juego(6);
         
        while( !juego.finJuego() ){
            juego.ronda();            
//            juego.rondaV2();
        }
         
        System.out.println("El juego ha terminado");
         
}
     
}
