///Escribir una función recursiva que devuelva la suma de los primeros N enteros.


Algoritmo ejer10
	Definir n Como Entero
	
	
	Escribir "Digite la cantidad de numeros a sumar: "; Leer n
	
	Escribir "La suma de los números es ", Fu(n)
	
FinAlgoritmo

Funcion x <- Fu(n)
	Definir x Como Entero
	x = 1
	
	Si n = 1 entonces
		n = 1
	SiNo
		x = n + Fu(n-1)
		// x = 3 + 2 + 1
	FinSi
	
FinFuncion
