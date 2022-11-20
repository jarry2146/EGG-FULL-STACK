
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class ejerci10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        int num1 = leer.nextInt(), num2 = leer.nextInt(), num3 = leer.nextInt(), num4 = leer.nextInt();

        System.out.println("Ingrese 4 numeros");
       if (num1>=0 && num1<=20 &&num2>=0&&num2<=20&&num3>=0 && num3<=20 &&num4>=0&&num4<=20){ 
        System.out.print(num1);
        for (int i = 0; i < num1; i++) {
            System.out.print("*");
        }
        System.out.println(" ");
        System.out.print(num2);
        for (int i = 0; i < num2; i++) {
            System.out.print("*");
        }
        System.out.println(" ");
        System.out.print(num3);
        for (int i = 0; i < num3; i++) {
            System.out.print("*");
        }
        System.out.println(" ");
        System.out.print(num4);
        for (int i = 0; i < num4; i++) {
            System.out.print("*");
        }
        
       }
    }
    }
    

