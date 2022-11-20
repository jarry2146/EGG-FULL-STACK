
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 
 * @author USUARIO
 */
public class ejerci13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
		int a;
		int b;
		int numerolados;
		System.out.println("Ingrese la longitud de los lados:");
		numerolados = Integer.parseInt(bufEntrada.readLine());
		for (a=1;a<=numerolados;a++) {
			for (b=1;b<=numerolados;b++) {
				if (a==1 || a==numerolados || b==1 || b==numerolados) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}


}

  
    
    

