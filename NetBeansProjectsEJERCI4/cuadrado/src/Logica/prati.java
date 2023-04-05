package Logica;

import java.util.Scanner;

public class prati {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
//        int num1,num2,suma=0;
//        System.out.println("ingrese primer numero: ");
//        num1=leer.nextInt();
//        System.out.println("ingrese segundo numero: ");
//        num2=leer.nextInt();
//        
//        suma=num1+num2;
//        
//        System.out.println("la suma de los numeros: "+num1+" y " +num2+ " es: " +suma);
        System.out.println(" ");
        //suma de las notas y el promedio
        double not1, not2, not3, notas, promedio = 0;
        System.out.println("ingrese notas: ");
        not1 = leer.nextDouble();
        not2 = leer.nextDouble();
        not3 = leer.nextDouble();

        notas = not1 + not2 + not3;
        promedio = promedio + notas / 3;
        System.out.println("el promedio es: " + promedio);

        //nota mayor
        if (not1 > not2) {
            System.out.println("not1 es mayor: " + not1);
        } else if (not2 > not3) {
            System.out.println("not2 es mayor: " + not2);
        } else if (not1 < not3) {

            System.out.println("not3 es mayor: " + not3);
        }
        // Este bucle imprimirá los valores de i del 0 al 2 y del 4.
        //La iteración con i = 3 se saltará debido a la instrucción continue.
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("El valor de i es: " + i);
        }
        //Bucle For-Each: se utiliza para recorrer los elementos de una colección.
        //Este bucle imprimirá los valores del array numeros.
        int[] numeros = {1, 2, 3, 4, 5};
        for (int numero : numeros) {
            System.out.println("El valor del número es: " + numero);
        }

    }

}
