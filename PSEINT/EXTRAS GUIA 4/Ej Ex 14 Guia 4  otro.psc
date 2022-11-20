////Realizar un programa que permita visualizar el resultado del producto de una matriz de
////enteros de 3x3 por un vector de 3 elementos. Los valores de la matriz y el vector pueden
////inicializarse evitando así el ingreso de datos por teclado.
Algoritmo Extra_14_Guia_4
	Definir matriz, vector,vectorResultado,filas,columnas Como Entero
	filas = 3
	columnas = 3
	Dimension matriz(filas,columnas), vector(filas),vectorResultado(filas)
	CargaMatriz(matriz,filas,columnas)
	CargaVector(Vector,Filas)
	ProductoMatriz(Matriz,vector,vectorResultado,Filas,columnas)
	Escribir "Matriz"
	MostrarMatriz(matriz,filas, columnas)
	Escribir "Vector"
	MostrarVector(vector,filas)
	Escribir ""
	Escribir "Vector Resultado"
	MostrarVector(vectorResultado,filas)
	Escribir ""
FinAlgoritmo

SubProceso CargaMatriz(Matriz, filas, columnas)
	Definir i,j Como Entero
	
	Para i=0 hasta filas-1
		Para j=0 hasta columnas-1
			Matriz(i,j)=aleatorio(1,9)
		FinPara
	FinPara
FinSubProceso

SubProceso CargaVector(Vector,Filas)
	Definir i Como Entero
	Para i=0 hasta filas-1
		vector(i)=aleatorio(1,9)
	FinPara
FinSubProceso

Subproceso ProductoMatriz(MatrizA,vector,vectorResultado,Filas,columnas)
	Definir i, j, acumulador Como Entero    //ej: (7*3)+(9*5)+(5*9)
	Acumulador=0                               //   (8*3)+(7*5)+(5*9)
	Para i=0 hasta filas-1                    //  (9*3)+(4*5)+(3*9)   vector (3,5,9)  resultadp(111,104,79)
		Para j=0 hasta columnas-1
			Acumulador = acumulador + ( MatrizA(i,j) * vector(j) )
		FinPara
		vectorResultado(i) = Acumulador
		Acumulador = 0
	FinPara
FinSubProceso

SubProceso MostrarMatriz (matriz,filas, columnas)
	Definir i, j Como Entero
	Para i<- 0 Hasta filas-1 Hacer
		para j <- 0 Hasta columnas-1 Hacer
			Escribir Sin Saltar matriz[i,j], "  "
		FinPara
		Escribir ""
	FinPara
	Escribir ""
FinSubProceso

SubProceso MostrarVector(vector,filas)
	Definir i Como Entero
	Para i<- 0 Hasta filas-1 Hacer
		Escribir Sin Saltar vector[i], "  "
	FinPara
	Escribir ""
FinSubProceso

