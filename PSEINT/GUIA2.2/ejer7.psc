Algoritmo ejer7
	
//	Realizar un programa que pida una frase y el programa deber� mostrar la frase con un
//espacio entre cada letra. La frase se mostrar� as�: H o l a. Nota: recordar el funcionamiento
//		de la funci�n Subcadena().
//	NOTA:. En PseInt, si queremos escribir sin que haya saltos de l�nea, al final de la operaci�n
//		"escribir" escribimos "sin saltar". Por ejemplo:
	
//			Escribir sin saltar "Hola, "
//			Escribir sin saltar "c�mo est�s?"
//		Imprimir� por pantalla: Hola, c�mo est�s?
	
	
	definir i como entero
	definir cad1 como caracter
	escribir " ingrese la frase: "
	leer cad1
	
	
	Para i <- 0 Hasta Longitud(cad1) Hacer
        Escribir Sin Saltar Subcadena(cad1, i, i )
	Escribir sin saltar " "
	
	fin para
	
FinAlgoritmo
