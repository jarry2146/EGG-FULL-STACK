package Logica;

import java.util.Scanner;

public class numeros_primos {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
    int num;
boolean esPrimo=true;
        System.out.println("Ingrese un numero entero: ");
        num=leer.nextInt();
        for (int i = 2; i <= num/2; i++) {
            if(num%i ==0){
                esPrimo=false;
                break;
            }
            
        }
        if(esPrimo){
            System.out.println("Es un numero primo. ");
            }else{
            System.out.println("No es un numero primo. ");
        }
    }
}
