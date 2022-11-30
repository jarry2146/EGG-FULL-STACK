//Este programa llena una matrisz con numero al azar y 
//suma la diagonal primaria y la diagonal secundaria.

import java.util.Random;

public class diagonales {

    public static void main(String[] args) {
        Random randon = new Random();
        int[][] matriz = new int[5][5];
        //mostrar matriz
        for (int i = 0; i < 5 - 1; i++) {
            for (int j = 0; j < 5 - 1; j++) {
                matriz[i][j] = randon.nextInt(9);

                System.out.print(" " + matriz[i][j]);

            }
            System.out.println(" ");

        }
        //suma diagonal primaria

        int suma = 0;
        for (int i = 0; i < 5 - 1; i++) {
            for (int j = 0; j < 5 - 1; j++) {
                if (i == j) {
                    suma = suma + matriz[i][j];

                    System.out.println("suma de diagonal primaria" + suma);
                    

                }

            }
        }
        System.out.println(" ");
        // suma de diagonal secundaria
        int suma2 = 0;
        int n = 4;

        for (int i = 0; i < 5 - 1; i++) {
            for (int j = 0; j < 5 - 1; j++) {
                if (i + j == n - 1) {

                    suma2 = suma2 + matriz[i][j];
                    System.out.println("suma de diagonal secundaria es " + suma2);
                }

            }
        }
    }
}
