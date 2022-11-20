Algoritmo diagonalps
	definir matriz, i,j,suma,suma1,n Como Entero
	dimension matriz[4,4]
	
	para i=1 Hasta 4-1  Con Paso 1 Hasta 
		para j=1 Hasta 4-1  Con Paso 1 Hasta 
			matriz[i,j]=azar(9)+1
			
			
			
		FinPara
	FinPara
	para i=1 Hasta 4-1 Con Paso 1 Hasta 
		para j=1 Hasta 4-1  Con Paso 1 Hasta
			escribir Sin Saltar matriz[i,j]," "
		FinPara	
		Escribir ""
	FinPara
	suma=0
	para i=1 Hasta 4-1 Con Paso 1 Hasta 
		para j=1 Hasta 4-1  Con Paso 1 Hasta
			si i==j Entonces
				suma=suma + matriz(i,j)	
			FinSi
			
		FinPara	
	FinPara
	Escribir " LA SUMA DE LA DIAGONAL PRIMARIA ES " suma
	suma1=0
	n=5
	para i=1 Hasta 4-1 Con Paso 1 Hasta 
		para j=1 Hasta 4-1  Con Paso 1 Hasta
			si i+j == n-1 Entonces
 	        suma1= suma1 + matriz(i,j)	
			FinSi
		FinPara
	FinPara
	Escribir " LA SUMA DE LA DIAGONAL SECUNDARIA ES " suma1
FinAlgoritmo
