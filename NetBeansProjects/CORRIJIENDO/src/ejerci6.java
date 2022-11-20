
import java.util.Scanner;

public class ejerci6 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new  Scanner(System.in);
        int num1;
        int num2;
        System.out.println("ingrese numero 1");
        num1= leer.nextInt();
        System.out.println("ingrese numero 2");
        num2=leer.nextInt();
        
        if (num1 >25 && num2 >25){
            System.out.println("el numero mayor es "+num1);  
        }else{
            System.out.println("el numero mayor es "+num2);
        }
        
    }
    
}
