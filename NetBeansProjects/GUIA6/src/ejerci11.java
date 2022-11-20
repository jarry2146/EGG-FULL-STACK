
import java.util.Scanner;


public class ejerci11 {

    public static void main(String[] args) {
         
         Scanner leer =new Scanner(System.in);
         int num1;
         int num2;
         int res;
         String S;
         String N;
         
        System.out.println("ingrese numeros 1 ");
        num1 = leer .nextInt();
        System.out.println("ingrese numeros 2 ");
        num2 = leer .nextInt();
        
    while(true){
        System.out.println("MENU:");
        System.out.println( "1- SUMA\n"
                + "2- RESTA\n"
                + "3- MULTIPLICACION\n"
                + "4- DIVICION\n"
                + "5- SALIR\n"
                + "ELIJA OPCION:");
           // System.out.println("ingrese una opcion:");
                     

           System.out.println("");
            char opcion= leer .next().charAt(0);
            switch(opcion){
                    case '1':
                    res=num1+num2;
                    System.out.println("la suma es:"+res);
                    break;
                    
                    case '2':
                    res=num1-num2;
                    System.out.println("la resta es:"+res);
                    break;
                    
                    case '3':
                    res=num1*num2;
                    System.out.println("la multiplicacion es :"+res);
                    break;
                    
                    case '4':
                       res=num1/num2;
                    System.out.println("la divicion es :"+res);
                    break;
                    case '5':
                      
                    default:
                        System.out.println(" ¿Está seguro que desea salir del programa (S/N)? ");
                        
                        
            }         
            }
         }  
    }




   

