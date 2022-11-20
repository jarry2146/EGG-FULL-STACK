Algoritmo ejer12jhon
	
	definir matriz,pal como cadena
	definir i,j Como Entero
	Dimension  matriz[3,3]
	
	escribir" ingrese una palabra "
	leer pal
	
	
	llenarmatriz(matriz,pal)
	imprimirmatriz(matriz)

FinAlgoritmo
subproceso llenarmatriz(matriz Por Referencia ,pal)
	definir aux ,i,j Como Entero
	aux=0
	para i=0 Hasta 2
		para j=0 Hasta 2
			matriz[i,j]=subcadena(pal, aux ,aux)  
			aux=aux+1
		FinPara	
	FinPara
FinSubProceso

	
SubProceso imprimirmatriz(matriz)
	definir i,j como enteros
	
	para i=0  Hasta 2
		para j=0 Hasta 2
			escribir matriz(i,j), "  " Sin Saltar 
		FinPara
		Escribir " "
	FinPara
FinSubProceso
	