
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class javamanzanas {

    
    public static void main(String[] args) {
        try {
            BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
            double decuento;
            double descuento = 0;
            int kilo;
            double precio;
            double total;
            System.out.println(" ingresa los kilos de manzanas:");
            kilo = Integer.parseInt(bufEntrada.readLine());
            System.out.println(" ingresa precio del kilo de manzanas");
            precio = Double.parseDouble(bufEntrada.readLine());
            total = precio * kilo;
            if (kilo <= 2) {
                descuento = 0;
            } else {
                if (kilo >= 2.01 && kilo <= 5) {
                    descuento = total * .10;
                    System.out.println(" se aplico un 10 % de des cuento");
                } else {
                    if (kilo >= 5.01 && kilo <= 10) {
                        decuento = total * .15;
                        System.out.println(" se aplico el 15 % de decuento");
                    } else {
                        descuento = total * .20;
                        System.out.println(" se aplico un 20 % de decuento");
                    }
                }
            }
            System.out.println(" el descuento aplicado es " + descuento);

            System.out.println(" el total a pagar por kilo de manzana del cliente es: $ " + (total - descuento));
        } catch (IOException ex) {
            Logger.getLogger(javamanzanas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
