

import java.util.Scanner;

public class ejerci11 {

    public static void main(String[] args) {
        
       Scanner leer = new Scanner(System.in);
       String code;
       String frase;
       String caract="";
        System.out.println("Ingrese una frase");

        frase = leer.nextLine();
        
    
      
    }
    public static void cambiarF(String frase, int opc){
        
         for (int i=1; i< frase.length(); i++){
             
            // caract=caract.concat(frase,i,i);
              
                switch (opc){
                case 'a':
                System.out.println(""+frase.replace('a','@'));
                break; 
                case 'e':
                System.out.println(""+frase.replace('e','#'));
                case 'i':
                
                System.out.println(""+frase.replace('i','$'));
                break;
                case 'o':
                System.out.println(""+ frase.replace('o','%'));
                case 'u':
               
                 System.out.println(""+frase.replace('u','*'));
                 break;
                
                
                    
             

            }
    }
    }

  
}
       
    

    


