////Escribir un programa que realice la búsqueda lineal de un número entero ingresado por el
////usuario en una matriz de 5x5, llena de números aleatorios y devuelva por pantalla las
////coordenadas donde se encuentra el valor, es decir en que fila y columna se encuentra. En
////caso de no encontrar el valor dentro de la matriz se debe mostrar un mensaje.
Algoritmo guia4EjerAp9
	definir matriz,num Como Real
	definir i,j Como Entero
	i=0
	j=0
	Dimension matriz(5,5)
	llenarmatriz(matriz,i,j)
	imprimeMatriz(matriz,i,j)
	escribir " Por favor ingrese un numero a buscar en la matriz:"
	leer num
	validar(matriz,i,j,num)
	
FinAlgoritmo

SubProceso llenarmatriz(matriz Por Referencia,i,j)
	para i=0 hasta 4
		para j=0 hasta 4
			matriz(i,j)=Aleatorio(1,50)
		FinPara
	FinPara
FinSubProceso

SubProceso  imprimeMatriz(matriz,i,j)
	para i=0 hasta 4
		para j=0 hasta 4
			escribir matriz(i,j)," " Sin saltar
		FinPara
		escribir ""
	FinPara
FinSubProceso

SubProceso validar(matriz,i,j,num)
	definir cont Como Entero
	cont=0
	para i=0 hasta 4
		para j=0 hasta 4
			si matriz(i,j)=num
				escribir " el numero:", num, " matriz[",i,"][",j,"]"
				cont=cont+1
			FinSi
		FinPara
	FinPara
	si cont=0
		escribir " El numero:", num , " no se encuentra en la matriz"
	SiNo
		escribir""
	FinSi
	
	
FinSubProceso
