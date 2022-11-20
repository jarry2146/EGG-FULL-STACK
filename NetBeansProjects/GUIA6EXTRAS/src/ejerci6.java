
import java.util.Scanner;


public class ejerci6 {

   
    public static void main(String[] args) {
      Scanner leer = new Scanner (System.in);
        
        System.out.println("ingrese la cantidad de personar :");
        int n = leer.nextInt();
        float[] vector = new float[n];

        for (int i = 0; i < n; i++) {
            System.out.println("ingrese altura de la persona " + (i + 1));
            vector[i] = leer.nextFloat();

        }
        System.out.println("promedio hasta 1.60 cm:" );
        float suma = 0;
        int contador = 0;
        for (int i = 0; i < n; i++) {
            if (vector[i] <= 1.60) {
                suma = suma + vector[i];
                contador++;

            }
      
        }
        System.out.println(suma / contador);

        System.out.println("promedio total");
        suma = 0;
        contador = 0;
        for (int i = 0; i < n; i++) {
            
            suma = suma + vector[i];
            contador++;

        }
        System.out.println(suma / contador);
    }

}




