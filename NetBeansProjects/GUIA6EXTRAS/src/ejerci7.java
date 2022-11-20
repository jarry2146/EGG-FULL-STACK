
import java.util.Scanner;

public class ejerci7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int valorMaximo = 0;
        int valorMinimo = 0;
        double promedio = 0;
        int num;
        int suma = 0;
        boolean bandera = true;
        boolean ban = true;

        do {
            System.out.println("ingrese numeros:");
            num = leer.nextInt();
            
            if (bandera == true) {
                valorMaximo = num;
                bandera = false;
            } else {
                if (num > valorMaximo) {
                    valorMaximo = num;
                }
            }

            if (ban == true) {
                valorMinimo = num;
                ban = false;
            } else {
                if (num < valorMinimo) {
                    valorMinimo = num;
                }
            }

        } while (num != 5);
        suma = suma + num;
        promedio = promedio + suma / num;
        System.out.println("el maximo es:" + valorMaximo);
        System.out.println("el minimo es:" + valorMinimo);
        System.out.println("el promedio es :" + (promedio));

    }
}
