

Algoritmo sin_titulo
	definir vector1 Como Entero
	Dimension vector1[10]
	Definir valorInicial, tamVector, valorFinalSuma, valorFinalResta, valorFinalMulti Como real
	valorInicial=0
	tamVector = 10
	valorFinalSuma	= 0
	valorFinalResta = 0
	valorFinalMulti = 1
	Hacer
		Escribir "Ingrese un valor para el espacio, numero" valorInicial+1
		Leer vector1[valorInicial]
		valorInicial = valorInicial + 1
	Mientras Que valorInicial<>tamVector 
	valorInicial = 0
	
	para valorInicial=0 hasta tamVector-1 Con Paso 1 Hacer
		valorFinalsuma = vector1[valorInicial] + valorFinalsuma
		valorFinalResta = vector1[valorInicial] - valorFinalResta
		valorFinalMulti = vector1[valorInicial] * valorFinalMulti
	
	
	FinPara
	Escribir "La suma del arreglo es: ", valorFinalsuma
	Escribir "La resta del arreglo es: ",valorFinalResta
	Escribir "La multiplicacion del arreglo es: ",valorFinalMulti

FinAlgoritmo



	