
public class ejeprueba {

    public static void main(String[] args) {
       java.util.Scanner leer = new java.util.Scanner (System.in); 
       String letra;
       
       while(true){
        System.out.println("ingrese letra ");
         letra=leer.nextLine();
         
         
        
         if ( letra.equals("a") || (letra.equals("A")|| (letra.equals("e")|| (letra.equals("E")
          || (letra.equals("i")|| (letra.equals("I")|| (letra.equals("o")|| (letra.equals("O")
          || (letra.equals("u")|| (letra.equals("U"))))))))))){
          letra="es vocal";
             System.out.println(""+letra);
          }
         else{
             letra="no es vocal";
             System.out.println(""+letra);
         }
       }
}
}
