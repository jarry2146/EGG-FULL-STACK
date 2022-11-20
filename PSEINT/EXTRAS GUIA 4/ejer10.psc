
//	Crear una matriz de orden n * m (donde n y m son valores ingresados por el usuario), llenarla
//	con números aleatorios entre 1 y 100 y mostrar su traspuesta.
//	¿Qué es una Matriz Traspuesta?
//	La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por
//	columnas (o viceversa).
//	
//	Matriz A = è Matriz B =
//	
//Ejemplo: Obsérvese, por ejemplo, que la primera fila de la matriz A es (1,0,4). Esta fila es la
//	primera columna de su matriz traspuesta.

Algoritmo ejer10
	definir matriz ,i,j ,n,m Como Entero
	
	dimension matriz[5,6]
	llenarmatriz(matriz)
	mostrarrmatriz(matriz)
	escribir" ingrese numeros "
	leer n
	escribir" ingrese numeros "
	leer m
FinAlgoritmo
subproceso llenarmatriz(matriz)
	definir i,j,n,m Como Entero
	para i=0 hasta 4 Con Paso 1 Hacer
		para j=0 hasta 4 Con Paso 1 Hacer
			matriz[i,j]= Aleatorio(1,100)
			escribir matriz[i,j] " "
			
		FinPara
		
	FinPara
	escribir""
	escribir"la matriz es "
FinSubProceso
subproceso mostrarrmatriz(matriz)
	definir i,j Como Entero
	para i = 0 Hasta 4 Hacer
		para j = 0 Hasta 4 hacer
			escribir Sin Saltar matriz[i,j] " "
		FinPara
		escribir ""
	FinPara
FinSubProceso	

