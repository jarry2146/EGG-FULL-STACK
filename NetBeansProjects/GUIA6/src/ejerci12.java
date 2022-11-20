
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class ejerci12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
         String FDE = "&&&&&";
    String palabra;
    int contcorrecto = 0, contincorrecto = -1;
    int longitud;
    do{
        
    System.out.println("Ingrese una secuencia de no más de 5 digitos:");
    palabra = leer.nextLine();
    longitud = palabra.length();
   // char ult = palabra.charAt(palabra.length()-1);
    
    if (longitud<=5 && palabra.substring(0,1).equals("X") && (palabra.endsWith("O"))){
    contcorrecto++;
    }else{
        contincorrecto++;
    }
    } while (!palabra.equals(FDE));
    
            System.out.println("Cantidad de lecturas correctas: " + contcorrecto);
            System.out.println("Cantidad de lecturas incorrectas: " + contincorrecto);        
    }
    }
