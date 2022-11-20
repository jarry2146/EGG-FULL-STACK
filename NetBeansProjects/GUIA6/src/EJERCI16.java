
import java.util.Scanner;


public class EJERCI16 {

    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        int cont=0;
        
        System.out.println("ingrese el tamaño ");
        int entrada= leer.nextInt();
        
        int [] vector1=new int[entrada];
        
        llenar(vector1);
        System.out.println("ingrese un valor para buscar ");
        int buscar=leer.nextInt();
        
        for(int j=0;j< vector1.length; j++){
            if(buscar ==  vector1[j]){
                cont++;
            }
            
        }
        
        System.out.println("el valor " + buscar+" aparece "+cont+"  veces en el arreclo");
            
        }   
        
       public static void llenar(int[]x){
        int azar=(int)(Math.random()*20)+1;
          int z;
          int llenar;
          
        
        for( z=0; z <x.length; z++){
           x[z]= (int) (Math.random()*20)+1;

            }
        for(z=0; z<x.length; z++){
            System.out.print(x[z]);
            System.out.print("");
            }  
            System.out.println("");
        }
     }


   
  

