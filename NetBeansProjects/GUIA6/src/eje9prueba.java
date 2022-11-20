
import java.util.Scanner;


public class eje9prueba {

    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in); 
       String cadena="a"; 
       String letra="a";
       
       System.out.println("ingrese una palabra: ");
       cadena=leer.next();
      // String letra=cadena.substring(0,1);
      
      if(letra.equals(cadena.substring(0,1))){
          System.out.println("es correcto ");
      }
      else{
          System.out.println(" incorrecto ");  
      }
     }
}

