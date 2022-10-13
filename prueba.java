/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "PRUEBA.java."

// Hay dos errores que se pueden generar al exportar un algoritmo con subprocesos desde PSeint a Java:
// 1) En java no se puede elegir entre pasaje por copia o por referencia. T�cnicamente solo existe el
// pasaje por copia, pero los identificadores de objetos representan en realidad referencias a los
// objetos. Entonces, el pasaje para tipos nativos act�a como si fuera por copia, mientras que el
// pasaje para objetos (como por ejemplo String) act�a como si fuera por referencia. Esto puede llevar
// a que el algoritmo exportado no se comporte de la misma forma que el algoritmo original, en cuyo
// caso deber�n modificarse algunos m�todos (subprocesos exportados) para corregir el problema.
// 2) Las funciones que hacen lectura por teclado deben lazar una excepci�n. Si una funci�n A es
// invocada por otra B, B tambi�n debe manejar (lanzar en este caso) las execpciones que lance A.
// Esto no se cumple en el c�digo generado autom�ticamante: las funciones que realizan lecturas
// directamente incluyen el c�digo que indica que pueden generar dicha excepci�n, pero las que
// lo hacen indirectamente (invocando a otras que s� lo hacen), puede que no, y deber�n ser
// corregidas manualmente.

import java.io.*;

public class prueba {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int num1;
		int num2;
		boolean resultado;
		System.out.println(" ingresar numero  ");
		num1 = Integer.parseInt(bufEntrada.readLine());
		System.out.println(" ingresar numero  ");
		num2 = Integer.parseInt(bufEntrada.readLine());
		num1 = 0;
		num2 = 0;
		resultado = comparar(num1,num2);
		System.out.println("El num1 es mayor a num2, esta afirmaci�n es: "+resultado);
	}

	public static boolean comparar(double num1, double num2) {
		boolean retorno;
		if (num1+num2!=0) {
			retorno = true;
		} else {
			retorno = false;
                        retorno = num1+num2 != 1;
		}
		return retorno;
	}


}

