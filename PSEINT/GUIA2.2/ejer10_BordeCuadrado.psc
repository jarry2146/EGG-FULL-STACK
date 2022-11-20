Algoritmo ejer10_g_2_2
	Definir numeroLados ,a ,b  Como Entero
	
	Escribir "Ingrese la longitud de los lados:"
	Leer numeroLados
	
	Para a<-1 Hasta numeroLados Con Paso 1 Hacer
		Para b<-1 Hasta numeroLados Con Paso 1 Hacer
			Si a == 1 O a == numeroLados O b == 1 O b == numeroLados Entonces
				Escribir Sin Saltar "* "
			SiNo
				Escribir Sin Saltar "  "
			FinSi
		Fin Para
		
		Escribir ""
	Fin Para
FinAlgoritmo
