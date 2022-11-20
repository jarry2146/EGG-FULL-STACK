
package java2;

public class Java2 {
    
    public static void main(String[] args) {
    
        int tabla[][] =new int [4][4];
        for (int x=0; x < 4; ++x){
            for (int y=0; y < 4; ++y){
                tabla[x][y]=x +y;
            
            }
      } 
        for (int x=0; x < 4; ++x){
            for (int y=0; y < 4; ++y){
                
            System.out.print("["+tabla[x][y]+"]");
         }
         System.out.println("");
    }
   }
}