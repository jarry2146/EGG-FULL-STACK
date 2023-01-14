
import java.util.Scanner;

public class practica_bucles {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2;

        int suma = 0, resta = 0, mult = 0, div = 0;

        boolean comp = true;
        do {
            System.out.println("ingrese numero 1:");
            num1 = leer.nextInt();
            System.out.println("ingrese numero2 :");
            num2 = leer.nextInt();
            suma = num1 + num2;
            resta = num1 - num2;
            mult = num1 * num2;
            div = num1 / num2;

            System.out.println("la suma es " + suma);
            System.out.println("la resta es " + resta);
            System.out.println("la multiplicacion es " + mult);
            System.out.println("la divicion es " + div);

        } while (comp == true);

    }
}
