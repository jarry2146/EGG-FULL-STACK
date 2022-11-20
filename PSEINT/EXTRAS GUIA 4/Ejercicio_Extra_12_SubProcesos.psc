//Realizar un programa que calcule la multiplicación de dos matrices de enteros de 3x3.
//Inicialice las matrices para evitar el ingreso de datos por teclado.
Algoritmo Extra_12_matrices_3x3
	Definir matriz1, matriz2, matrizResultado Como Entero
	Dimension matriz1[3,3], matriz2[3,3], matrizResultado[3,3]
	
	//Carga de matrices
	cargaMatriz(matriz1, 3)
	cargaMatriz(matriz2, 3)
	
	//Inicialización de matriz resultado
	inicilizacion(matrizResultado, 3)
	
	//Muestra de matrices
	mostrar_matriz(matriz1, 3)
	mostrar_matriz(matriz2, 3)
	mostrar_matriz(matrizResultado, 3)
	
	//Multiplicación
	multiplicacion(matrizResultado, matriz1, matriz2, 3)
	
	//Resultado
	mostrar_matriz(matrizResultado, 3)
FinAlgoritmo

SubProceso cargaMatriz(matriz, n)
	Definir i, j Como Entero
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		Para j=0 Hasta n-1 Con Paso 1 Hacer
			matriz[i,j] = Aleatorio(1,5)
		FinPara
	FinPara
FinSubProceso

SubProceso inicilizacion(matriz, n)
	Definir i, j Como Entero
	Para i = 0 Hasta 2 Con Paso 1 Hacer
		Para j = 0 Hasta 2 Con Paso 1 Hacer
			matriz[i,j] = 0
		FinPara
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

SubProceso multiplicacion(matrizResultado,matriz1,matriz2, n)
	Definir i, j, mul Como Entero
	Para i = 0 Hasta n-1 Con Paso 1 Hacer
		para j = 0 Hasta n-1 Con Paso 1 Hacer
			Para mul = 0 Hasta n-1 Con Paso 1 Hacer
				matrizResultado[i,j] = matrizResultado[i,j] + (matriz1[i,mul] * matriz2[mul,j])
			FinPara
		FinPara
	FinPara
FinSubProceso



