
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class colecio {

    public static void main(String[] args) {

        ArrayList<Integer> numerosA = new ArrayList();
        for (int i = 0; i < 5; i++) {
            numerosA.add(i);
        }
        System.out.println("Array List " + numerosA);
        numerosA.remove(2);
        
        System.out.println("Array List " + numerosA);
        Collections.sort(numerosA);
        System.out.println("Array List " + numerosA);

        HashSet<Integer> numerosB = new HashSet();
        for (int i = 10; i < 15; i++) {
            numerosB.add(i);
        }
        System.out.println("HashSet " + numerosB);
        numerosB.remove(12);

        System.out.println("HashSet " + numerosB);
        LinkedHashMap<Integer, String> alumnos = new LinkedHashMap();
        int aux = 0;
        for (int i = 0; i < 5; i++) {
            int dni = 0;
            String nombre = " ";
            switch (i) {
                case 0:
                    dni = (int) (Math.random() * 99999999);
                    nombre = "Jhon";
                    break;
                case 1:
                    dni = (int) (Math.random() * 99999999);
                    aux = dni;
                    nombre = "Claudio";
                    break;
                case 2:
                    dni = (int) (Math.random() * 99999999);

                    dni = (int) (Math.random() * 99999999);
                    nombre = "Viviana";
                    break;
                case 4:
                    dni = (int) (Math.random() * 99999999);
                    nombre = "Matilde";
                    break;
            }
            alumnos.put(dni, nombre);
        }
        System.out.println("HashMap " + alumnos);
        alumnos.remove(aux); 
       
        System.out.println("HashMap " + alumnos);
        
        
        ArrayList<Integer> num = new ArrayList();
        for (int i = 0; i < 10; i++) {
          num.add(i);
        }
        Collections.sort(num);
        System.out.println("ordenar "+num);
    }

}
