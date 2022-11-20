
import java.util.Scanner;


public class ejerci17 {

    public static void main(String[] args) {
       Scanner leer =new Scanner(System.in);
      int cont=1;
        
        System.out.println("ingrese el tamaño ");
        int entrada= leer.nextInt();
        
        int [] vector=new int[entrada];
        
        llenar(vector);
        
        
        int ar;
        for(int j=0;j< vector.length; j++){
            ar =  vector[j];
            while(vector[j] >= 10){
            vector[j]= vector[j]/10;
                cont++;
              
        }
        
        System.out.println("el numero " + ar+ " tiene " +cont+ " digitos");
          cont=1;  
        }   
    }
       public static void llenar(int[]x){
        
          int z;
     
        for( z=0; z <x.length; z++){
           x[z]= (int) (Math.random()*4709000)+1;

            }
        for(z=0; z<x.length; z++){
            System.out.print(x[z]);
            System.out.print("");
            }  
            System.out.println("");
        
     }
}




