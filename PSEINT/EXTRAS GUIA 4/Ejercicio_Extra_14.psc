//Realizar un programa que calcule la multiplicación de dos matrices de enteros de 3x3.
//Inicialice las matrices para evitar el ingreso de datos por teclado.
Algoritmo Extra_12_matrices_3x3
	Definir matriz1, vector, resultado Como Entero
	Dimension matriz1[3,3], vector[3], resultado[3]
	
	//Carga de matrices
	cargaMatriz(matriz1, 3)
	cargaVector(vector, 3)
	
	//Inicialización de matriz resultado
	inicilizacion(resultado, 3)
	
	//Muestra de matrices
	mostrar_matriz(matriz1, 3)
	mostrar_vector(vector, 3)
	mostrar_vector(resultado, 3)
	
	//Multiplicación
	multiplicacion(resultado, matriz1, vector, 3)
	
	//Resultado
	mostrar_vector(resultado, 3)
FinAlgoritmo

SubProceso cargaMatriz(matriz, n)
	Definir i, j Como Entero
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		Para j=0 Hasta n-1 Con Paso 1 Hacer
			matriz[i,j] = Aleatorio(1,5)
		FinPara
	FinPara
FinSubProceso

SubProceso cargaVector(vector, n)
	Definir i Como Entero
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		vector[i] = Aleatorio(1,5)
	FinPara
FinSubProceso

SubProceso inicilizacion(vector, n)
	Definir i Como Entero
	Para i = 0 Hasta 2 Con Paso 1 Hacer
		vector[i] = 0
	FinPara
FinSubProceso

SubProceso mostrar_matriz(matriz, n)
	Definir i, j Como Entero
	Escribir "su matriz es: "
	para i = 0 Hasta n-1 Con Paso 1 Hacer
		para j = 0 Hasta n-1 Con Paso 1 Hacer
			Escribir "[" matriz[i,j] "]" " " Sin Saltar
		FinPara
		Escribir ""
	FinPara
FinSubProceso

SubProceso mostrar_vector(vector, n)
	Definir i Como Entero
	Escribir "su matriz es: "
	para i = 0 Hasta n-1 Con Paso 1 Hacer
		Escribir "[" vector[i] "]" " " Sin Saltar
	FinPara
	Escribir ""
FinSubProceso

SubProceso multiplicacion(resultado, matriz, vector, n)
	Definir i, j Como Entero
	Para i = 0 Hasta n-1 Con Paso 1 Hacer
		Para j = 0 Hasta n-1 Con Paso 1 Hacer
			resultado[i] = resultado[i] + (matriz[i,j] * vector[j])
		FinPara
	FinPara
FinSubProceso


// 3x3  *  3x1  =  3x1 => [3]

