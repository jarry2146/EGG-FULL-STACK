//Realizar un programa que calcule la multiplicación de dos matrices de enteros de 3x3.
//Inicialice las matrices para evitar el ingreso de datos por teclado.
Algoritmo Extra_12_matrices_3x3
	Definir matriz1, matriz2, matriz3, i, j Como Entero
	Dimension matriz1[3,3], matriz2[3,3], matriz3[3,3]
	Para i = 0 Hasta 2 Con Paso 1 Hacer
		para j = 0 Hasta 2 Con Paso 1 Hacer
			matriz1[i,j] = Aleatorio(1,10)
			matriz2[i,j] = Aleatorio(1,10)
		FinPara
	FinPara
	para i = 0 Hasta 2 Con Paso 1 Hacer
		Para j = 0 Hasta 2 Con Paso 1 Hacer
			matriz3[i,j] = 0
		FinPara
	FinPara
	mostrar_matriz(matriz1,i,j)
	mostrar_matriz(matriz2,i,j)
	multiplicacion(matriz3, matriz1,matriz2,i,j)
FinAlgoritmo

SubProceso mostrar_matriz(matriz,i,j)
	Escribir "su matriz es: "
	para i = 0 Hasta 2 Con Paso 1 Hacer
		para j = 0 Hasta 2 Con Paso 1 Hacer
			Escribir "[" matriz[i,j] "]" " " Sin Saltar
		FinPara
		Escribir ""
	FinPara
FinSubProceso

SubProceso multiplicacion(matriz3,matriz1,matriz2,i,j)
	Definir mul Como Entero
	Escribir "la multiplicacion es:"
	Para i = 0 Hasta 2 Con Paso 1 Hacer
		para j = 0 Hasta 2 Con Paso 1 Hacer
			Para mul = 0 Hasta 2 Con Paso 1 Hacer
				matriz3[i,j] = matriz3[i,j] + (matriz1[i,mul] * matriz2[mul,j])
			FinPara
			Escribir "[" matriz3[i,j] "]" " " Sin Saltar
		FinPara
		Escribir ""
	FinPara
FinSubProceso
	