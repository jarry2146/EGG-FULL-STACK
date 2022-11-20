//Realizar un programa que rellene una matriz de 3x3 con 9 valores ingresados por el usuario y
//los muestre por pantalla.

Algoritmo ejer8
	definir A	Como Caracter
	definir B,i,j Como Entero
	
	dimension A[3]
	dimension B[3,3]
	
	
	para i=0 hasta 3-1 con paso 1 Hacer
		para j=0 hasta 3-1 con paso 1 Hacer
			escribir sin saltar "ingrese los numeros  ",i," ",j
			 leer B[i,j]
		 FinPara
	FinPara
	
	para i=0 hasta 3-1 con paso 1 Hacer
		para j=0 hasta 3-1 con paso 1 Hacer
			escribir sin saltar B[i,j] "  "
		FinPara
		escribir" "
	FinPara
	escribir" "
	escribir " la matriz quedaria de esta forma"
FinAlgoritmo
