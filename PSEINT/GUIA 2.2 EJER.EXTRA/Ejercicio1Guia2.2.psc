Algoritmo Ejercicio1Guia22
	
//	Escriba un programa en el cual se ingrese un n�mero y mientras ese n�mero sea mayor
//	de 10, se pedir� el n�mero de nuevo.
	Definir num Como Entero
	Escribir "Por favor, ingrese un numero entre 0 y 10: "
	leer num
	
	Mientras num <=0 o num >=10
		Escribir "Por favor, ingrese un numero entre 0 y 10: "
		Leer num
	FinMientras
	Escribir "el numero es: ", num
FinAlgoritmo