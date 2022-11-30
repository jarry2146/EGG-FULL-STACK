package guia7_ejerci10;

import java.util.Arrays;

public class GUIA7_ejerci10 {

    public static void main(String[] args) {

        double[] arregloA = new double[50];
        double[] arregloB = new double[20];

        for (int i = 0; i < 50; i++) {

            arregloA[i] = (double) (Math.random() * 10);

            System.out.println("Mostrar: " + arregloA[i]);
        }
        System.out.println("");

        for (int i = 0; i < 50; i++) {

            Arrays.sort(arregloA);
            System.out.println("Orden: " + arregloA[i]);

        }
        System.out.println("");

        for (int i = 0; i < 20; i++) {

            System.arraycopy(arregloB, 0, arregloA, 10, arregloA.length);

            System.out.println("Copiando: " + arregloA[i]);
        }
        System.out.println(" ");
        for (int j = 0; j < 10; j++) {
            Arrays.fill(arregloB, 0.5);
            System.out.println("Rellenando: " + arregloB[j]);
        }
    }
}
