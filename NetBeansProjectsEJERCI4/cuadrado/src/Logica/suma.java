package Logica;

import java.util.Scanner;

public class suma {

    public static void main(String[] args) {
        
        
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a positive integer: ");
    int n = sc.nextInt();
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum += i;
    }
    System.out.println("The sum of first " + n + " natural numbers is: " + sum);
  }
}

    
    

