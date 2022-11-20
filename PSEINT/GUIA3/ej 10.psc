//Escribir una función recursiva que devuelva la suma de los primeros N enteros.

Algoritmo sin_titulo
	Definir num  Como Entero
	Escribir "ingrese numero"
	Leer num
	

	Escribir "la suma de los numeros es de "   adicion(num) 
	
FinAlgoritmo

Funcion suma = adicion (num)
	Definir suma Como Entero
	Si num=0 Entonces
		suma= 0
	SiNo
		suma= num + adicion (num-1)
	FinSi
FinFuncion
	