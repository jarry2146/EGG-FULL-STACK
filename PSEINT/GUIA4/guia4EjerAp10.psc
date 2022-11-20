Algoritmo guia4EjerAp10
	definir matriz1,matriz2 Como Real
	definir n,m,num Como Entero
	escribir " Por favor ingrese tamaño de la matriz(x,x):"
	leer n,m
	dimension matriz1(n,m)
	llenarmatriz(matriz1,n,m)
	imprimeMatriz(matriz1,n,m)
	suma(matriz1,n,m)
	
FinAlgoritmo

SubProceso llenarmatriz(matriz Por Referencia,n,m)
	definir i,j Como Entero
	para i=0 hasta n-1
		para j=0 hasta m-1
			matriz(i,j)=Aleatorio(1,50)
		FinPara
	FinPara
FinSubProceso

SubProceso  imprimeMatriz(matriz,n,m)
	definir i,j Como Entero
	para i=0 hasta n-1
		para j=0 hasta m-1
			escribir matriz(i,j)," " Sin saltar
		FinPara
		escribir ""
	FinPara
FinSubProceso

SubProceso suma(matriz,n,m)
	definir i,j Como Entero
	definir sum Como Real
	sum=0
	para i=0 hasta n-1
		para j=0 hasta m-1
			sum=sum+matriz(i,j)
		FinPara
	FinPara
	escribir " la suma de los datos de la matriz es: ", sum
FinSubProceso


	