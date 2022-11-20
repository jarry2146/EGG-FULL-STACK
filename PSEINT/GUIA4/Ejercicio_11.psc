Algoritmo Ejercicio_11
	Definir matriz Como Real
	Definir n Como Entero
	
	Escribir "Ingrese la dimensión de su matriz cuadrada"
	Leer n
	Dimension matriz[n,n]
	
	llenarMatriz(matriz, n)
	
	imprimirMatriz(matriz, n)
FinAlgoritmo


SubProceso llenarMatriz(matriz, n)
	Definir i, j Como Entero
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		Para j=0 Hasta n-1 Con Paso 1 Hacer
			Si i==j Entonces
				matriz[i,j] = 0
			Sino 
				matriz[i,j] = Aleatorio(1, 9)
			FinSi
		FinPara
	FinPara
FinSubProceso

SubProceso imprimirMatriz(matriz, n)
	Definir i, j Como Entero
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		Para j=0 Hasta n-1 Con Paso 1 Hacer
			Escribir Sin Saltar matriz[i, j], " "
		FinPara
		Escribir ""
	FinPara
FinSubProceso


//00 01 02
//10 11 12
//20 21 22