
import java.util.Scanner;

public class par_impar {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        
        System.out.println("ingrese numero ");
        num=leer.nextInt();
        if (num % 2 == 0) {
            System.out.println("el numero es par "); 
        }
        else{
            System.out.println("el numero es impar ");
        }
    }
    
}
 