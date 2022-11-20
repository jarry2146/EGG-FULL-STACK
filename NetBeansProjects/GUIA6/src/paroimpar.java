
import java.io.IOException;
import java.util.Scanner;

public class paroimpar {
 
 
    public static double numDouble, numDouble2;
    public static String numero, numero2;
 
    public static void main(String[] args) throws IOException {


        Scanner entrada = new Scanner(System.in);
 
        //creamos código para introducir con la clase y el condicional para saber si es par o impar:
        System.out.print("Introduce un numero: ");
            numero = entrada.nextLine();
            numDouble = Double.parseDouble(numero);
            if (numDouble%2!=0){
                System.out.println("El numero es impar");
            }
            else{
                System.out.println("El numero es par");
            }
 
        //Ahora creo el código para preguntar si deseo continuar:
        System.out.print("¿Desea continuar? ");
        System.out.println("S / N ");
        String opc = entrada.next();
        while (opc.equals("s") || opc.equals("S")) { // Desicion repetir o no 
            System.out.print("Introduce un numero: ");
            numero2 = entrada.nextLine();
            numDouble2 = Double.parseDouble(numero2);
            if (numDouble2%2!=0){
                System.out.println("El numero es impar");
            }
            else{
                System.out.println("El numero es par");
            }
 
            System.out.println ("Ejecutar de nuevo?");
            System.out.println("S / N");
            opc = entrada.next();
        }
 
    }
 
 }
 
    

