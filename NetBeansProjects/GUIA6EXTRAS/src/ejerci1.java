
import java.util.Scanner;

public class ejerci1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int horas = 0;
        int dias = 0;
        int minutos = 0;
        System.out.println("ingrese los minitos a calcular: ");
        minutos = leer.nextInt();

        while (minutos > 59) {
            if (minutos >= 1440) {
                dias++;
                minutos = minutos - 1440;
            } else if (minutos >= 60) {
                horas++;
                minutos = minutos - 60;
            }
        }
        System.out.println("Seria " + dias + " dia y " + horas + " hora ");
    }
}
