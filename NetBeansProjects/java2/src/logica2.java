//realizar la siguiente serie numerica utilizando las estruturas repetitivas
//del [for while y do while]
//1,99,2,98,3,97,4,96,5,95
public class logica2 {

    public static void main(String[] args) {

        int i = 1;
        int j = 99;
        System.out.println("Serie con for: ");
        for (i = 1; i <= 5; i++) {
            if (i < 5) {
                System.out.print(i + ",");
                System.out.print(j + ",");
            } else {
                System.out.print(i + ",");
                System.out.println(j);

            }
            j--;
        }
        System.out.println("");
        i = 1;
        j = 99;
        System.out.println("Serie con while: ");
        while (i <= 5) {
            if (i < 5) {
                System.out.print(i + ",");
                System.out.print(j + ",");
            } else {
                System.out.print(i + ",");
                System.out.println(j);

            }
            i++;
            j--;

        }
        System.out.println("");
        i = 1;
        j = 99;
        System.out.println("Serie con do-while: ");
        do {
            if (i < 5) {
                System.out.print(i + ",");
                System.out.print(j + ",");
            } else {
                System.out.print(i + ",");
                System.out.println(j);

            }
            i++;
            j--;

        } while (i <= 5);

    }

}
