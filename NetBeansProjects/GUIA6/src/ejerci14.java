
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
public class ejerci14 {

    /**
     *
     * @param cantEuros
     * @param dolar
     */
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
    double libras = 1.86; 
    double dolar = 1.28611;
    double yenes = 129.852;
    double euros = 1.852;
    
    
   
        System.out.println("Ingrese la cantidad: ");
        libras= leer.nextDouble();
    
      libras = euros * libras;
      System.out.println("euro " +euros +" es igual a "+ libras+ "libras");
   

     System.out.println("Ingrese la cantidad: ");

      euros = leer.nextDouble();
      dolar = euros * dolar;

     System.out.println(euros + " es igual a " + dolar); 

}  
}
