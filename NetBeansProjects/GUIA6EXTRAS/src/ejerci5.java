
import java.util.Scanner;

public class ejerci5 {

    public static void main(String[] args) {
        double descuento = 0;
        double total ;
        double trata;
        

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca el valor del tratamiento :");
        trata = entrada.nextDouble();
      

        if (trata >=100 ) {
            descuento = trata * 0.50;
        }
          System.out.println("socioA pagaria : "+descuento);
            if (trata >= 100) {
                descuento = trata * 0.35;
              total=trata-descuento;
             System.out.println("socioB pagaria : "+total); 
            }
                 if (trata >= 100) {
                 descuento = trata * 0.0; 
                 total=trata-descuento;
                 System.out.println("socioC pagaria : "+total);
                     
                

        }
    }
}




