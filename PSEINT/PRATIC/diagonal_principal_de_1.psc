Algoritmo diagonal_principal_de_1
	definir i,j ,matriz ,salida como entero
	dimension matriz[5,5]
	salida=0
	para i=0 Hasta 4 Con Paso 1 Hasta 
		para j=0 Hasta 4 Con Paso 1 Hasta 
			Si i=0 o i=4 o j=0 o j=14 Entonces
				matriz[i,j]=0
			SiNo
				matriz[i,j]=0
			Fin Si
			
			si i==j Entonces
				matriz[i,j]=1
			FinSi
			
		FinPara
	FinPara
	
	para i=0 Hasta 4 Con Paso 1 Hasta 
		para j=0 Hasta 4 Con Paso 1 Hasta 
			escribir matriz[i,j] Sin Saltar " "
		FinPara
		Escribir ""
	FinPara
FinAlgoritmo
