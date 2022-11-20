Algoritmo ejer7
	
//	Realizar un programa que pida una frase y el programa deberá mostrar la frase con un
//espacio entre cada letra. La frase se mostrará así: H o l a. Nota: recordar el funcionamiento
//		de la función Subcadena().
//	NOTA:. En PseInt, si queremos escribir sin que haya saltos de línea, al final de la operación
//		"escribir" escribimos "sin saltar". Por ejemplo:
	
//			Escribir sin saltar "Hola, "
//			Escribir sin saltar "cómo estás?"
//		Imprimirá por pantalla: Hola, cómo estás?
	
	
	definir i como entero
	definir cad1 como caracter
	escribir " ingrese la frase: "
	leer cad1
	
	
	Para i <- 0 Hasta Longitud(cad1) Hacer
        Escribir Sin Saltar Subcadena(cad1, i, i )
	Escribir sin saltar " "
	
	fin para
	
FinAlgoritmo
