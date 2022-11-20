
import java.util.Scanner;
public class ejer8prob {
    public static void main(String[] args) {
      Scanner leer =new Scanner(System.in); 
        String S = "";
        String cadena;
        System.out.println("ingrese una frase ");
        cadena =leer.next();
         if(S.equals(cadena)  ){  
            // for (int x = 0; x <= S.length(); x++)
       for (int i=1;i<cadena.length();i++)
          cadena = cadena.substring(i,i+1);
        
         
        System.out.println("correcto:");
         }
    else{
        System.out.println("incorrecto:" ); 
       
        }
     }
   }

