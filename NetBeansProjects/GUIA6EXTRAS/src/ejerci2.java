
import java.util.Scanner;

public class ejerci2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a = 22, b = 33, c = 44, d = 55;

        System.out.println(" a" + a + " b" + b + " c" + c + " d" + d);

        acom(a, b, c, d);
    }

    public static void acom(int o, int x, int t, int n) {

        int acom = 0;

        acom = x;
        x = t;
        t = o;
        o = n;
        n = acom;
        System.out.println(" a" + o + " b" + x + " c" + t + " d" + n);
    }

}
