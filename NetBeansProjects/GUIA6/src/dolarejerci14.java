
import java.util.Scanner;


public class dolarejerci14{

    
    public static void main(String[] args) {
        EXTERNA:
    
        while(true){
        System.out.println("Cambio de moneda:");
        System.out.println( "1- Euros a Libras \n"
                + "2- Euros a dolares \n"
                + "3- Euros a yanes\n"
                + "4- salir");
            System.out.println("ingrese una opcion:");
            Scanner leer =new Scanner(System.in);
            char opcion= leer .next().charAt(0);
            switch(opcion){
                case '1':
                  convertir(0.85, " Libras");
                    break;
                    
                    case '2':
                    convertir( 1.28611 , " dolares");
                    break;
                    
                    case '3':
                    convertir(129.852, " yenes");
                    break;
                    
                    case '4':
                        System.out.println(" serrando programa");
                    break EXTERNA;
                    default:
                            System.out.println(" opcion incorrecta intenta de nuevo ");
                    break;
            }
         }  
    }
   
    static void convertir(double valorEuros,String pais){
          Scanner leer = new Scanner (System.in);
            System.out.println("ingrese la cantidad"+pais);
            double cantidadMoneda= leer.nextDouble();
            
            double euros= cantidadMoneda *valorEuros;
           
           // euros = 100/(double)Math.round(euros*100d )/100;
            
            System.out.println(" -------------------");
            System.out.println("| Tiene $ "+ euros +  " Euros|");
            System.out.println(" -------------------");
            
    }
}

    
   

