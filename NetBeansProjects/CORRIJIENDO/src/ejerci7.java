
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
public class ejerci7 {

    private static Object leer;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new  Scanner(System.in);
        int opcion;
        System.out.println("ingrese una opcion");
        System.out.println(" opcion 1");
        System.out.println(" opcion 2");
        System.out.println(" opcion 3");
        System.out.println(" opcion 4");
        opcion = leer. nextInt();
        switch (opcion){
            case 1: 
                System.out.println(" es una bomba de agua ");
                break;
            case 2:    
                System.out.println("es una bomba de gasolina");

                break;
            case 3:    
                System.out.println(" es una bomba de hormigon ");
                break;
            case 4:    
                System.out.println(" es una bomba de pastas de alimentos");
                break;
            default:
                System.out.println("no existe un valor valido para el tipo de bomba ");
                
                
        }
    }
    
}
