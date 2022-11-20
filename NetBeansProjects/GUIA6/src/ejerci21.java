import java.util.Scanner;

public class ejerci21 {
    
    public static void main(String[] args) { 
        Scanner leer= new Scanner(System.in);
        
        int matrizp[][] = new int [10][10];
        int matriz[][] = new int [3][3];
        System.out.println("mostrar matriz de 10 x 10");
        for(int i=0; i<10; i++){
          for(int j=0; j<10; j++){
              matrizp[i][j]= (int)(Math.random()*10);  
          }  
        }
        for(int i=0; i<10; i++){
          for(int j=0; j<10; j++){
              System.out.print("["+matrizp[i][j]+"]");
          }
            System.out.println("");
        }
        System.out.println("ingrese la matriz a buscar 3x3:");
        for(int i=0; i<3; i++){
          for(int j=0; j<3; j++){
              System.out.println("fila "+i+" columna "+j);
              matriz[i][j]=leer.nextInt();      
       } 
     }
         buscar(matrizp,matriz);    
    }
    public static void buscar(int[][]matrizp,int[][]matriz){
       
    int fila=0;
    int columna=0;
    int concide=0;
     
    for(int i=0; i<8; i++){
          for(int j=0; j<8; j++){
           if (matrizp[i][j]==matriz[0][0]){
             for(int k=i; k<(i+3); k++){
                for(int l=j; l<(j+3); l++){  
             if(matrizp[k][l]==matriz[k-i][l-j]){
              fila=i;
              columna=j;
              concide+=1;
                }else{ 
                  concide=0;
                        k=i+3;
                        l=j+3;
                        fila=0;
                        columna=0;
                     }    
                }
             }
          }
    if(concide>0){
        System.out.println("la matriz principal contiene a la matriz secundaria");
        System.out.println("Se encuentra ubicada en");
        for (int m=fila; m< fila+3; m++){
            for(int n=columna; n< columna+3; n++){
               
            System.out.print("[" + m + "," + n + "]");
            
        }
            System.out.println("");
          }
        }
      }
    }
  }
}
