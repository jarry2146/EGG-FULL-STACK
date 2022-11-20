
import java.util.Scanner;


public class ejerci20 {

  
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        int n;
        
        System.out.println("ingrese el tamaño de la matriz filas " );
        int tamañom= leer.nextInt();
         System.out.println("ingrese el tamaño de la matriz columnas " );
        int num= leer.nextInt();
        
       Scanner reader = new Scanner(System.in);
        
        int counter1 = 0; 
        int counter2 = 0;
        int counter3 = 0;
        int value;
        int[] [] matriz1 = new int [3][3];
        
        for (int i = 0; i<3; i++){
            for (int j = 0; j<3; j++ ){
             matriz1[i][j]= (int) (Math.random()*9)+1;  
                
                //System.out.println("Ingrese el valor de la posicion: " + i + j);  
               // value = reader.nextInt();
                
              //  matriz1[i][j] =  value;
               
            }
            
        }
        
        for (int f = 0; f<3; f++){
            counter1 = matriz1[f][0] + counter1;
                      
    }
        System.out.println(counter1);
        
        for (int c = 0; c<3; c++){
            counter2 = matriz1[0][c] + counter2;
                      
    }
        System.out.println(counter2);

        for (int f=0; f<3; f++){
            for (int c = 0; c<3; c++){
                if (f == c){
                counter3 = matriz1[f][c] + counter3;
                }
                      
            }
        }  
       for (int f=0; f<3; f++){
            for (int c = 0; c<3; c++){
       
                System.out.println(""+matriz1[f][c]);
         System.out.println(counter3);
        if((counter1 == counter2) && (counter1 == counter3)){
            System.out.println("El cuadrado es magico "  );
        }else {
            System.out.println("no es una matriz magica ");
        }
}

}
    }
}