Algoritmo guia4EjerAp12
	definir matriz, palabra como cadena
	definir long Como Entero
	dimension matriz(3,3)
	escribir " Por favor ingresar una palabra con 9 caracteres:"
	leer palabra
	long=Longitud(palabra)
	Mientras long<>9
		escribir " Por favor ingresar una nueva palabra con 9 caracteres:"
		leer palabra
		long=Longitud(palabra)
	FinMientras
	llenarmatriz(matriz,palabra)
	imprimeMatriz(matriz)
	
	
	
FinAlgoritmo

SubProceso llenarmatriz(matriz por referencia,palabra)
	definir i,j,k,cont Como Entero
	cont=0
	para i=0 hasta 2
		para j=0 hasta 2
			matriz[i,j]=Subcadena(palabra,cont,cont)
			cont=cont+1
		FinPara
	FinPara
	
FinSubProceso

SubProceso  imprimeMatriz(matriz)
	definir i,j Como Entero
	para i=0 hasta 2
		para j=0 hasta 2
			escribir matriz(i,j)," " Sin saltar
		FinPara
		escribir ""
	FinPara
FinSubProceso

