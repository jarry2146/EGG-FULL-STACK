
import java.util.Scanner;


public class ejerci8 {
    public static void main(String[] args) {
      Scanner leer =new Scanner(System.in); 
      String frase = "";
        System.out.println("ingrese frase ");
        frase=leer.next();
         int longitud=frase.length();
         
         if(longitud ==8 ) {
            
       System.out.println("es correcto");
         }
       else{
                  
         } 
         if(longitud!=8){
             
        System.out.println("es incorrecto");
         }
     }
   }

