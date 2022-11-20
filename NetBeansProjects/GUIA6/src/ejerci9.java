
import java.util.Scanner;


public class ejerci9 {

    public static void main(String[] args) {
    Scanner leer=new Scanner(System.in); 
       String palabra="";
       //int conMayu=0;
       
    
     System.out.println("ingrese una palabra ");
        palabra =leer.next();
        for(int i=0; i< palabra.length();i++){
           char car=palabra.charAt(i);
         //conMayu ++;
        
          
      
       // if (Character.isLetter('A')){
           if (palabra.charAt(i)=='A'){   
        System.out.print( " correcto");
        }
        else{
      
         if (palabra.charAt(i)!='A'){ 
      
        System.out.println("incorrecto:" ); 
         }
      }
    }
    }
}




