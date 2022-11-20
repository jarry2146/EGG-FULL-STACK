Algoritmo Ejercicio_10
	Definir matriz, n, m, suma Como Entero
	suma = 0
	
	Escribir "Cuantas filas tendrá su matriz?"
	Leer n
	Escribir "Cuantas columnas tendrá su matriz?"
	Leer m
	Dimension matriz[n, m]
	
	llenarMatriz(matriz, n, m)
	sumatoria(matriz, n, m, suma)
	
	mostrarMatriz(matriz, n, m)
	Escribir "La suma de los elementos de la matriz es ", suma
	
FinAlgoritmo

SubProceso llenarMatriz(matriz, n, m)
	Definir i, j  Como Entero
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		Para j=0 Hasta m-1 Con Paso 1 Hacer
			matriz[i, j] = trunc(Aleatorio(1, 10))
		FinPara
	FinPara
FinSubProceso

SubProceso sumatoria(matriz, n, m, suma por Referencia)
	Definir i, j  Como Entero
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		Para j=0 Hasta m-1 Con Paso 1 Hacer
			suma = suma + matriz[i, j]
		FinPara
	FinPara
FinSubProceso

SubProceso mostrarMatriz(matriz, n, m)
	Definir i, j  Como Entero
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		Para j=0 Hasta m-1 Con Paso 1 Hacer
			Escribir Sin Saltar matriz[i, j], " "
		FinPara
		Escribir ""
	FinPara
FinSubProceso
