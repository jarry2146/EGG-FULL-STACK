

import java.io.*;

public class ejer9 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String caract;
		String cod ="" ;
		String frase;
		System.out.println(" ingrese una frase:");
		frase = bufEntrada.readLine();
		reemplazos(frase,cod);
		System.out.println(""+cod);
	}

        @SuppressWarnings("empty-statement")
	public static void reemplazos(String frase, String cod) {
		String caract;
		int i;
		double longitud;
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
                
                System.out.println(""+cod);
	}


}

