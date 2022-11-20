package guia7_ejerci7;

import Servicio.PersonaServicio;
import entidad.Persona;
import java.util.Scanner;

public class GUIA7_ejerci7 {

    public static void main(String[] args) {
        PersonaServicio Ps = new PersonaServicio();
        
        //Ps.CrearPersona();
     Scanner leer = new Scanner(System.in);
     int pordebpeso=0, pesoideal=0, sobrepeso=0, menor= 0, mayor=0;
       int cantidadP=0;
       
        System.out.println("ingrese la cantida de personas a registrar:");
        cantidadP=leer.nextInt();
        int [] MASAC = new int[cantidadP];
        boolean [] mym = new boolean[cantidadP];
        
        
        
        Persona per1[]=new Persona[cantidadP];
        
        for (int i = 0; i < per1.length; i++) {
            
            per1[i]=Ps.CrearPersona();
            Ps.calcularIMC(per1[i]);
            Ps.esMayorDeEdad(per1[i]);
            MASAC[i]=(int )per1[i].getImc();
            mym[i]=per1[i].isMym();
            //System.out.println(per1[i].toString());
            System.out.println("");
         switch (MASAC[i]){
                case -1:
                    pordebpeso++;
                    break;
                case 0:
                    pesoideal++;
                    break;
                case 1:
                    sobrepeso++;
                    break;
            }
            if (mym[i] == true){
                mayor++;
            }else {
                menor++;
            }
        }
   
         System.out.println("______________________________________________________________");
        System.out.println("\n Porcentaje de personas debajo de su peso: " + ((pordebpeso*100)/per1.length)+
                "\n Porcentaje de personas en su peso ideal: " + ((pesoideal*100)/per1.length)
                + "\n Porcentaje de personas con sobrepeso: " +((sobrepeso*100)/per1.length));
        System.out.println("_______________________________________________________________");


        System.out.println("______________________________________________________________");
        System.out.println("\n De las " + cantidadP + " personas son mayores: " + mayor + "\n De las " + cantidadP + " personas son menores: " + menor);
        System.out.println("______________________________________________________________");
        }

             
    }

    


