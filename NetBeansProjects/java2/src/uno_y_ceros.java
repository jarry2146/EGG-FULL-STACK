
import java.util.Scanner;


public class uno_y_ceros {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int [][] matriz=new int[5][15];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(i==4||i==14||j==4||j==14){
           
                matriz[i][j]=5;
                
                }
            System.out.print(+matriz[i][j]);
        }
            System.out.println("");
        
       // int numero = (int)(Math.random()*10+1);
        }
    }
    
}
