Algoritmo Ejercicio1Guia22
	
//	Escriba un programa en el cual se ingrese un número y mientras ese número sea mayor
//	de 10, se pedirá el número de nuevo.
	Definir num Como Entero
	Escribir "Por favor, ingrese un numero entre 0 y 10: "
	leer num
	
	Mientras num <=0 o num >=10
		Escribir "Por favor, ingrese un numero entre 0 y 10: "
		Leer num
	FinMientras
	Escribir "el numero es: ", num
FinAlgoritmo