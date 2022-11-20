
import java.util.Scanner;

public class ejerci7conwhile {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int valorMaximo = 0;
        int valorMinimo = 0;
        double promedio = 0;
        int num = 0;
        int suma = 0;

        boolean bandera = true;
        boolean ban = true;
        while (num <= 8) {
            System.out.println("ingrese numeros:");
            num = leer.nextInt();
            num++;
            if (bandera == true) {
                valorMaximo = num;
                bandera = false;
            } else {
                if (num >= valorMaximo) {
                    valorMaximo = num;

                    if (ban == true) {
                        valorMinimo = num;
                        ban = false;
                    } else {
                        if (num <= valorMinimo) {
                            valorMinimo = num;
                        }
                    }

                }
            }
        }
        suma = suma + num;
        promedio = promedio + suma / num;
        System.out.println("el maximo es:" + valorMaximo);
        System.out.println("el minimo es:" + valorMinimo);
        System.out.println("el promedio es :" + (promedio));
    }
}
