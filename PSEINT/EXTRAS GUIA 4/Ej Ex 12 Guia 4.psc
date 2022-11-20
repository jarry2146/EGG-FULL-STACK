Algoritmo Ejercicio_Extra_12Guia4
Definir matrizA, matrizB, matrizC, i, j Como Entero
Dimension matrizA(3,3), matrizB(3,3), matrizC(3,3)

Para i=0 Hasta 2 Con Paso 1 Hacer
	Para j=0 Hasta 2 Con Paso 1 Hacer
		matrizA(i,j)= Aleatorio(1,10)
	Fin Para
Fin Para

Para i=0 Hasta 2 Con Paso 1 Hacer
	Para j=0 Hasta 2 Con Paso 1 Hacer
		matrizB(i,j)= Aleatorio(1,10)
	Fin Para
Fin Para

Escribir ""
Escribir "La Matriz A esta compuesta por "

Para i=0 Hasta 2 Con Paso 1 Hacer
	Escribir ""
	Para j=0 Hasta 2 Con Paso 1 Hacer
		Escribir "[" matrizA(i,j) "]" Sin Saltar
	Fin Para
Fin Para

Escribir ""
Escribir ""
Escribir "La Matriz B esta compuesta por "

Para i=0 Hasta 2 Con Paso 1 Hacer
	Escribir ""
	Para j=0 Hasta 2 Con Paso 1 Hacer
		Escribir "[" matrizB(i,j) "]" Sin Saltar
	Fin Para
Fin Para

Escribir ""
Escribir ""
Escribir "La multiplicacion de la Matriz A y de la Matriz B es "

Para i=0 Hasta 2 Con Paso 1 Hacer
	Escribir ""
	Para j=0 Hasta 2 Con Paso 1 Hacer
		matrizC(i,j)= matrizA(i,j)*matrizB(i,j)
		Escribir "[" matrizC(i,j) "]" Sin Saltar
	Fin Para
Fin Para

Escribir ""	
Escribir ""	
FinAlgoritmo
