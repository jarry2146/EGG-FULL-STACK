package Baraja;

import entidad.Carta;
import java.util.Scanner;

public class Baraja {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private Carta cartas[];
    private int posSiguienteCarta;
    public static final int NUM_CARTAS = 40;

    public Baraja() {

        this.cartas = new Carta[NUM_CARTAS];
        this.posSiguienteCarta = 0;
//        crearBaraja();
//        barajar();
    }

    public void menu() {

        boolean con = false;

        do {

            System.out.println("Eliga una opcion:");
            System.out.println("");
            System.out.println("1 Barajar:");
            System.out.println("2 Siguiente Carta:");
            System.out.println("3 Cartas Disponible:");
            System.out.println("4 Dar Carta:");
            System.out.println("5 Carta Monton:");
            System.out.println("6 Mostrar Baraja:");
            System.out.println("7 Salir:");

            int opc = leer.nextInt();

            switch (opc) {
               
                case 1:
                    this.barajar();
                    for (Carta carta2 : cartas) {
                        System.out.println(carta2);
                        break;
                    }

                case 2:
                    this.siguienteCarta();
                    for (Carta carta3 : cartas) {
                        System.out.println(carta3);
                        break;
                    }

                case 3:
                    this.cartasDisponible();
                    break;
                case 4:
                    this.darCarta(NUM_CARTAS);
                    break;
                case 5:
                    this.cartaMonton();
                    break;
                case 6:
                    this.mostrarBaraja();
                    break;
                case 7:
                    System.out.println("A salido ");
//                    for (Mascota auxal : ListaMascota) {
//                        System.out.println("Las raza son: " + auxal.getRaza());

                    con = true;
                    break;
                default:
                    System.out.println("La carta no esta en la lista ");

            }
        } while (con == false);

    }

    public void crearBaraja() {

        String[] palos = Carta.PALOS;

        for (int i = 0; i < palos.length; i++) {

            for (int j = 0; j < Carta.LIMITE_CARTA_PALO; j++) {

                if (!(j == 7 || j == 8)) {
                    if (j >= 9) {
                        cartas[((i * Carta.LIMITE_CARTA_PALO - 2)) + (j - 2)] = new Carta(j + 1, palos[i]);
                    } else {
                        cartas[((i * Carta.LIMITE_CARTA_PALO - 2)) + j] = new Carta(j + 1, palos[i]);
                        for (String palo : palos) {
                            System.out.println(palo);

                        }
                    }

                }

            }

        }

    }

    public void barajar() {

        int posAleatoria = 0;
        Carta c;
        for (int i = 0; i < cartas.length; i++) {
            posAleatoria = Metodos.generaNumeroEnteroAleatorio(0, NUM_CARTAS - 1);
            c = cartas[i];
            cartas[i] = cartas[posAleatoria];
            cartas[posAleatoria] = c;
            System.out.println(c);
        }

    }

    public Carta siguienteCarta() {
        Carta c = null;
        if (posSiguienteCarta == NUM_CARTAS) {
            System.out.println("ya no hay mas cartas ,barajea de nuevo.");

        } else {
            c = cartas[posSiguienteCarta++];
        }
        return c;
    }

    public Carta[] darCarta(int numCartas) {
        if (numCartas > NUM_CARTAS) {
            System.out.println("no se pueden dar mas cartas de las que hay.");

        } else {
            if (cartasDisponible() < numCartas);

            System.out.println("no hay suficientes cartas que mostrar");
            if (cartasDisponible() < numCartas) {

            } else {

            }
            Carta[] cartasDar = new Carta[numCartas];

            for (int i = 0; i < cartasDar.length; i++) {
                cartasDar[i] = siguienteCarta();

            }
            return null;
        }
        return cartas;
    }

    public int cartasDisponible() {

        return NUM_CARTAS - posSiguienteCarta;
    }

    public void cartaMonton() {
        if (cartasDisponible() == NUM_CARTAS) {
            System.out.println("no se ha sacado ninguna carta.");
        } else {
            for (int i = 0; i < posSiguienteCarta; i++) {

                System.out.println(cartas[i]);

            }

        }

    }

    public void mostrarBaraja() {
        if (cartasDisponible() == 0) {
            System.out.println("no hay cartas que mostrar.");
        } else {
            for (int i = posSiguienteCarta; i < cartas.length; i++) {

                System.out.println(cartas[i]);
            }
        }
    }
}
