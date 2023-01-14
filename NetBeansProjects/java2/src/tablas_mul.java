
import java.util.Scanner;

public class tablas_mul {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int n;
        boolean comparar = true;
        while (comparar == true) {
            System.out.println("ingrese un numero:");
            n = leer.nextInt();

            if (n > 0) {

                System.out.println("el numero es correcto.");
                for (int i = 1; i < 10+1; i++) {

                    System.out.println(n + "x" + i + "=:" + n * i);

                }
                comparar = false;

            } else {
                System.out.println("el numero es incorrecto. ingreselo nuevamente:");

            }
            
        }
    }

}
