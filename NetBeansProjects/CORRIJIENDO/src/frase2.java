
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class frase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String caract;
		String cod= "";
		String frase;
		System.out.println(" ingrese una frase:");
		frase =leer.nextLine();
		reemplazos(frase,cod);
		System.out.println(""+cod);
	}

	public static void reemplazos(String frase, String cod) {
		String caract;
		int i;
		cod = "";
		for (i=0;i<=frase.length()-1;i++) {
			caract = frase.substring(i,i+1);
			switch (caract) {
			case "a":
				caract = "@";
				break;
			case "e":
				caract = "#";
				break;
			case "i":
				caract = "$";
				break;
			case "o":
				caract = "%";
				break;
			case "u":
				caract = "*";
				break;
			}
			cod = cod.concat(caract);
		}
	}


}


    
    

