package ventanagraf;

import javax.swing.JOptionPane;



public class joption {

    public static void main(String[] args) {
     String cadena;
     int entero;
     char letra;
     double decimal;
     
    cadena = JOptionPane.showInputDialog("digite una cadena: ");
    entero = Integer.parseInt(JOptionPane.showInputDialog("digite un entero: "));
    letra = JOptionPane.showInputDialog("digite letra: ").charAt(0); 
    decimal = Double.parseDouble(JOptionPane.showInputDialog("digite un decimal:"));
   
    JOptionPane.showMessageDialog(null, "la cadena es: "+cadena);
    JOptionPane.showMessageDialog(null, "el entero es: "+entero);
    JOptionPane.showMessageDialog(null, "la letra es: "+letra );
    JOptionPane.showMessageDialog(null, "el decimal es: "+decimal);
    
   
    }

}
