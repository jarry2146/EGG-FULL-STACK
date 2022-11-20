
import java.util.Scanner;


public class ejerci13intro {

   
    public static void main(String[] args) {
       
       
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el número de elementos");
        int elementos = leer.nextInt();

        for (int i = 0; i < elementos; i++) {
           
            for (int j = 0; j < elementos; j++) {
                if (i == 0 || j == 0 || i==elementos-1||j==elementos-1) {
                    System.out.print("x");

                } else {
                    System.out.print(" "); 
                }
                System.out.print(" ");
            }
            System.out.print("\n");
        }

    }

    }
    

