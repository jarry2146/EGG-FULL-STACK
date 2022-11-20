Algoritmo sin_titulo
	definir i,j, matriz Como Entero
	dimension matriz[5,15]
	
	para i=0 Hasta 4 Con Paso 1 Hacer
		para j=0 Hasta 14 Con Paso 1 Hacer
			si i=0 o i=4 o j=0 o j=14 Entonces
				matriz[i,j]=1
			sino 
				matriz[i,j]=0
				
			FinSi
		FinPara
	FinPara
	
	para i=0 Hasta 4 Con Paso 1 Hacer
		para j=0 Hasta 14 Con Paso 1 Hacer
			Escribir matriz[i,j] Sin Saltar" "
			
		FinPara
		Escribir ""
	FinPara
	
FinAlgoritmo
