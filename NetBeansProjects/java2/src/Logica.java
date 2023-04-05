
import java.util.Scanner;

public class Logica {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        while (true) {
            System.out.println("Ingrese numero1.");
            int num1 = leer.nextInt();
            System.out.println("Ingrese numero2.");
            int num2 = leer.nextInt();

            if (num1 % 2 != 1) {
                System.out.println("el numero es par.");
            } else {
                System.out.println("el numero no es par.");

            }
            int suma = 0;
            suma = num1 + num2;
            System.out.println("la suma es." + suma);

            int mul = 0;
            mul = num1 * num2;
            System.out.println("la multiplicacion es ." + mul);

            double P = 1.1416;
            P = num1 * num2 * 2;
            System.out.println("el area es." + P);

            System.out.println(" ");

            double[][] matriz = new double[4][6];

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 6; j++) {
//                    matriz[i][j] = Math.random() * 10;
                    if (i == 4 || j == 4 || i == 6 || j == 6) {

                        matriz[i][j] = i; 
                        matriz[i][j] = j;

                        System.out.println(matriz[i][j]);
                        System.out.println(matriz[i][j]);
                        
                    }
                   
                }
            }

        }
    }
}
