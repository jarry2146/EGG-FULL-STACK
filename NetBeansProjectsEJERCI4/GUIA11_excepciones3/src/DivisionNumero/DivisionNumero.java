package DivisionNumero;

import java.util.Scanner;

public class DivisionNumero {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        String num1Str = leer.nextLine();
        int num1 = Integer.parseInt(num1Str);

        System.out.print("Ingrese el segundo número: ");
        String num2Str = leer.nextLine();
        int num2 = Integer.parseInt(num2Str);

        try {

            int resultado = num1 / num2;
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException a) {
            System.out.println("No se puede dividir por cero");
        }
    }
}
