
import java.util.ArrayList;
import java.util.HashSet;

public class arraylist {

    public static void main(String[] args) {
        ArrayList<Integer> numero1=new ArrayList();
        for (int i = 0; i < 10; i++) {
            numero1.add(i);
            
        }
        System.out.println("mostrar lista completa "+numero1);
            numero1.remove(9);
            System.out.println("mostrar lista removida "+numero1);
            
        HashSet<Integer> numero2=new HashSet();
        for (int i = 9; i < 16; i++) {
           numero2.add(i);
           
        }
        System.out.println("");
        System.out.println("HashSet"+numero2);
        numero2.remove(15);
        System.out.println("HashSet removido"+numero2);
        
    }
    
}
