package Logica;

import javax.swing.*;

public class ventana2 extends JDialog {
    
 public ventana2(JFrame parent, String title, String message) {
     super(parent, title, true);
            JPanel panel = new JPanel();
            JLabel label = new JLabel(message);
            panel.add(label);
            getContentPane().add(panel);
            setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            pack();
            setLocationRelativeTo(parent);
     
 }


        public static void main(String[] args) {
            JPanel panel = new JPanel();
            JLabel label = new JLabel();
            panel.setVisible(true);
            label.setVisible(true);
        }
    }


