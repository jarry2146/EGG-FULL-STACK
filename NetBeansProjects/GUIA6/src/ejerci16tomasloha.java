
import java.util.Scanner;


public class ejerci16tomasloha {

   


    public static void main(String[] args) {
        /*
        16. Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
        */
        Scanner leer = new Scanner(System.in);
        boolean repetido ;
        int c = 0;
        
        System.out.println("Ingresa el tamano de la variable");
        int n = leer.nextInt();
        int [] vector = new int [n];
        
        for (int i = 0; i < n;i++){
            vector[i] = (int)(Math.random()*10)+1;
        }
        
        System.out.println("La variable es:");
        for (int i = 0; i < n;i++){
            System.out.print(vector[i]);    
                    
        }
        System.out.println("");
        System.out.println("Ingrese un numero que desee buscar");
        int numero = leer.nextInt();
        
        for (int i = 0; i < n ;i++){
            if (vector[i] == numero){
                 c = c + 1;
                 System.out.println("Hay una coincidencia en la posicion: vector "+ "["+i+"]");
            } 
        }
    }
}