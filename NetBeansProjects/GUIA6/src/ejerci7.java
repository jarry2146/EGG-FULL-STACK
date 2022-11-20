
import java.util.Scanner;


public class ejerci7 {

    public static void main(String[] args) {
      Scanner leer =new Scanner(System.in); 
      
      String frase="eureka"; 
      String frase2="eureka";
      
     
        System.out.println("ingrese una frase ");
        frase =leer.next();
      
      
      if (frase2.equals(frase)){
       System.out.println("correcto ");    
      }else{
          
        System.out.println("incorrecto ");
        
    }
    
    }
}
