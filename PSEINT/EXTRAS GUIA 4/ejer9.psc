Algoritmo ejer9
//	Realizar un programa que rellene de números aleatorios una matriz a través de un
//	subprograma y generar otro subprograma que muestre por pantalla la matriz final.
	definir matriz ,i,j Como Entero
	dimension matriz[4,4]
	llenarmatriz(matriz)
	mostrarrmatriz(matriz)
	
FinAlgoritmo
subproceso llenarmatriz(matriz)
	definir i,j Como Entero
	para i=0 hasta 3 Con Paso 1 Hacer
		para j=0 hasta 3 Con Paso 1 Hacer
			matriz[i,j]= Aleatorio(0,9)
			escribir matriz[i,j] " "
			
		FinPara
		
	FinPara
	escribir""
escribir"la matriz es "
FinSubProceso
subproceso mostrarrmatriz(matriz)
	definir i,j Como Entero
para i = 0 Hasta 3 Hacer
	para j = 0 Hasta 3 hacer
		escribir Sin Saltar matriz[i,j] " "
	FinPara
	escribir ""
FinPara
FinSubProceso	