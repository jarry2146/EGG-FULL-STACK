Algoritmo sin_titulo
	definir matriz,mtrans,n,m Como Entero
	leer n
	leer m
	dimension matriz[n,m]
	dimension mtrans[m,n]
	rellenar(matriz,n,m)
	rellenar(mtrans,m,n)
	impresion(matriz,n,m)
	transpuesta(matriz,mtrans,n,m)
	impresion(mtrans,m,n)
	
	
FinAlgoritmo	
SubProceso  rellenar(matrix,n,m)
	definir i,j como entero
	para i<-0 hasta n-1 Hacer
		para j<-0 hasta m-1 Hacer
			matrix[i,j]=aleatorio(0,9)
		FinPara
		
	FinPara
FinSubProceso

SubProceso  transpuesta(matrix,mtranx,n,m)
	definir i,j, aux como entero
	
	para i<-0 hasta n-1 Hacer
		
		para j<-0 hasta m-1 Hacer
			
			aux=matrix[i,j]
			matrix[i,j]=mtranx[j,i]
			mtranx[j,i]=aux
			
		FinPara
		
	FinPara
	escribir""
	
FinSubProceso

SubProceso impresion(matrix,n,m)
	definir i,j como entero
	para i<-0 hasta n-1 Hacer
		escribir " "
		para j<-0 hasta m-1 Hacer
			
			escribir sin saltar " ",matrix[i,j]
			
		FinPara
	FinPara
	escribir""
FinSubProceso