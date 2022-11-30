package quia7_ejerci11;

import java.util.Date;
import java.util.Scanner;

public class QUIA7_ejerci11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int anio = 0;
        int mes = 0;
        int dia = 0;

        Date fecha = new Date(anio, mes, dia);
        Date fechaActual = new Date();

        System.out.println("Ingrese Año ");
        anio = leer.nextInt();
        System.out.println("Ingrese Mes ");
        mes = leer.nextInt();
        System.out.println("Ingrese Dia ");
        dia = leer.nextInt();
      
         
          
       
        
       
        System.out.println("Hay: " + (fechaActual.getYear() + 1900-anio+ " Anos "));
        System.out.println("Hay: " + (fechaActual.getMonth()+1-mes+ " Meses"));
        System.out.println("Hay: " + (fechaActual.getDate()-dia+ " Dias"));

    }

}
