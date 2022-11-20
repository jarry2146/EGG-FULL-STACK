Algoritmo sin_titulo
	definir matriz,n,m Como Entero
	leer n
	leer m
	dimension matriz[n,m]
	rellenar(matriz,n,m)
	impresion(matriz,n,m)
	
	
	
FinAlgoritmo	
SubProceso  rellenar(matrix,n,m)
	definir i,j como entero
		para i<-0 hasta n-1 Hacer
			para j<-0 hasta m-1 Hacer
				matrix[i,j]=aleatorio(0,10)
			FinPara
		FinPara
	FinSubProceso
		

	SubProceso impresion(matrix,n,m)
		definir i,j como entero
		para i<-0 hasta n-1 Hacer
			escribir " "
			para j<-0 hasta m-1 Hacer
				escribir sin saltar " ",matrix[i,j]
				
			FinPara
		FinPara
	FinSubProceso
	

