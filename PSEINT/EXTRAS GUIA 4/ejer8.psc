Algoritmo ejer8
	definir n,i, multiplicacion, vector Como Entero
	
	escribir "ingrese dimension"
	leer n
	dimension vector[n]
	multiplicacion=1
	para i<-0 hasta n-1 Hacer
		vector[i]=aleatorio(1,10)
		
	FinPara
	para i<-0 hasta n-1 Hacer
		escribir vector[i]
		
	FinPara
	multiplicacion=multi(vector,n)
	para i<-0 hasta n-1 Hacer
		escribir sin saltar "V[",i+1,"] *"
		
	FinPara
	escribir "= ", multiplicacion
finalgoritmo

funcion multiplicacion<- multi(vector,n)
	definir multiplicacion,i Como Entero
	multiplicacion=1
	para i<-0 hasta n-1 Hacer
		multiplicacion=multiplicacion*vector[i]
	FinPara
finfuncion
