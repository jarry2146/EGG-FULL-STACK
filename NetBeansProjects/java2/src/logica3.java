
public class logica3 {

    public static void main(String[] args) {

        int i = +0;
        int j = 1;

        for (i = 0; i <= 10; i++) {
            if (i < 10) {

                System.out.print(i + ",");
                System.out.print(j + ",");
            } else {

                System.out.print(i + ",");
                System.out.println(j);

            }

            j++;
        }
        System.out.println("");
        i = 1;
        j = 2;

        int iNumero = 5;
        int iSumatorio = 0;
        int iContador = iNumero;
       
                while (iContador != 0) {

                    iSumatorio = iSumatorio + iContador;
                    iContador--;

                    System.out.println("El sumatorio de " + iNumero + " es " + iSumatorio);
                }
            }
        }
    

