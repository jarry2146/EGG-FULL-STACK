Algoritmo Ejercicio_11
	Definir N, Matriz Como Entero
	
	Escribir "Defina el tamaño de la matriz cuadrada"
	Leer N
	
	Dimension Matriz[N,N]
	llenar_matriz(N, Matriz)
	imprimir_matriz(N, Matriz)
FinAlgoritmo

SubProceso llenar_matriz(N, Matriz por Referencia)
	Definir i,j Como Entero
	
	Para i=0 hasta N-1 con Paso 1 Hacer
		Para j=0 Hasta N-1 con Paso 1 Hacer
			Si i=j Entonces
				Matriz[i,j]=0
			Sino
				Matriz[i,j]=Aleatorio(-10,10) 
			FinSi
		FinPara
	FinPara
FinSubProceso

SubProceso imprimir_matriz(N, Matriz por Referencia)
	Definir i,j Como Entero
	Para i=0 hasta N-1 con Paso 1 Hacer
		Para j=0 Hasta N-1 con Paso 1 Hacer
			Escribir Sin Saltar Matriz[i,j]," "
		FinPara
		Escribir ""
	FinPara
FinSubProceso
