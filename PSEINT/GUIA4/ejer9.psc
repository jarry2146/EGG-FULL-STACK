Algoritmo ejer9
	definir matriz, i,j ,val Como Entero
	dimension matriz[5,5]
	para i = 0 Hasta 4 Hacer
		para j = 0 Hasta 4 hacer
			matriz[i,j]= Aleatorio(-10,10)
		FinPara
	FinPara
	Escribir "su matriz es: "
	para i = 0 Hasta 4 Hacer
		para j = 0 Hasta 4 hacer
			escribir Sin Saltar matriz[i,j] " "
		FinPara
		escribir ""
	FinPara
	escribir "ingrese un numero para buscar en la matriz"
	leer val
	
	para i = 0 Hasta 4 Hacer
		para j = 0 Hasta 4 hacer
			si matriz(i,j) == val Entonces
				escribir "el valor se encuentra en las coordenadas: " i ,"," j
				
			FinSi
		FinPara
	FinPara
	
FinAlgoritmo

