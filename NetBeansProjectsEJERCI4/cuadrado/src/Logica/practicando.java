
package Logica;

import java.util.Scanner;

public class practicando {
// Escribe un programa que pida al usuario una nota (de 0 a 10) y
//muestre por pantalla si la nota es aprobatoria (mayor o igual a 6) o no. 
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        System.out.println("Ingrese nata: ");
        double nota =leer.nextDouble();
        
        if(nota>=6){
            System.out.println("Lanota es aprobada: ");
            
        }else{
            System.out.println("La nota reaprobada: ");
            
        }
        
    }
    
}
 