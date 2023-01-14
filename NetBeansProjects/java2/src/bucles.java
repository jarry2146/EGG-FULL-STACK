
import java.util.Scanner;

public class bucles {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double nota1;
        double nota2;
        double nota3;

        System.out.println("ingrese notas ");
        nota1 = leer.nextDouble();
        nota2 = leer.nextDouble();
        nota3 = leer.nextDouble();

        if (nota1 > nota2) {

            System.out.println("nota1 es mayor: " + nota1);
        } else {
            if (nota2 > nota3) {

                System.out.println("nota2 es mayor: " + nota2);

            } else {
                if (nota3 > nota2) {

                }
                System.out.println("nota3 es mayor: " + nota3);
            }

        }

    }
}
