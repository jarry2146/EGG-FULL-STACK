//Rellenar en un subproceso una matriz cuadrada con n�meros aleatorios salvo en la diagonal
//	principal, la cual debe rellenarse con ceros. Una vez llena la matriz debe generar otro
//	subproceso para imprimir la matriz.
//
SubProceso colocar(matriz,i,j)
	Para i=0 Hasta 2 Con Paso 1 Hacer
		Para j=0 Hasta 2 Con Paso 1 Hacer
	si i=j Entonces
		Escribir matriz(i,j)=0
		
	FinSi
FinPara
FinPara
FinSubProceso

	
subproceso rellenar(matriz)
	definir i,j Como Entero
	
		Para i=0 Hasta 2 Con Paso 1 Hacer
			Para j=0 Hasta 2 Con Paso 1 Hacer
				
									
				matriz(i,j)= Aleatorio(1,100)
				
				
	
	Escribir Sin Saltar matriz(i,j) " "
FinPara
escribir " "
FinPara	
			
FinSubProceso
		
Algoritmo sin_titulo
	definir matriz,a,b,i,j Como Entero
	
	
	dimension matriz(3,3)
	i=0
	j=0
	rellenar(matriz)
	colocar(matriz,i,j)
	
	
FinAlgoritmo
