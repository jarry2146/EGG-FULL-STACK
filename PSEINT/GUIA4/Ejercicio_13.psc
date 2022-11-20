Algoritmo Ejercicio_13
	Definir matriz, n Como Entero
	
	Hacer
		Escribir "Ingrese el orden de su matriz"
		Leer n
		Si (n > 10) Entonces
			Escribir "Error. El orden de la matriz no debe ser mayor a 10"
		FinSi
	Mientras Que (n > 10)
	
	Dimension matriz[n,n]
	
	llenarMatriz(matriz, n)
	
FinAlgoritmo

SubProceso llenarMatriz(matriz, n)
	Definir i, j Como Entero
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		Para j=0 Hasta n-1 Con Paso 1 Hacer
			Hacer
				Escribir "Ingrese el valor de la posicion (", i, ",", j, ")"
				Leer matriz[i,j]
			Mientras Que (matriz[i,j] >= 1 Y matriz[i,j] <= 9)
		FinPara
	FinPara
FinSubProceso

