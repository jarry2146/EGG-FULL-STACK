package guia11_excepcions4;


import java.util.InputMismatchException;
import java.util.Scanner;

public class GUIA11_excepcions4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        try {

            System.out.print("Ingrese el primer número: ");
            String num1Str = leer.nextLine();
            int num1 = Integer.parseInt(num1Str);
            System.out.print("Ingrese el segundo número: ");
            String num2Str = leer.nextLine();
            int num2 = Integer.parseInt(num2Str);
            System.out.println("Ingrese un numero decimal: ");
            double num =leer.nextDouble();
            int resultado = num1 / num2;
            System.out.println("El resultado de la división es: " + resultado);
        } catch (NumberFormatException a) {
            System.out.println("Error al ingresar un estrig digite un numero: " );

        } catch (ArithmeticException a) {

            System.out.println("no se puede dividir por cero: ");
            
        }catch(InputMismatchException e){
            
            System.out.println("no se puede dividir numeros con decimales: ");    
        }

    }
}
