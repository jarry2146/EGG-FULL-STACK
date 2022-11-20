Algoritmo Ejercicio_5
	Definir num Como Entero
	Definir es_primo Como Logico
	
	Escribir "Ingrese el numero"
	Leer num
	
	es_primo = primos(num)
	
	Escribir "El número ingresado, es primo? ", es_primo
FinAlgoritmo


Funcion resul = primos(num)
	Definir resul Como Logico
	Definir cont Como Entero
	
	cont = 1
	resul = VERDADERO
	
	Hacer		
		Si (cont<>1) Entonces
			resul = (num mod cont <> 0)
		FinSi	
		cont = cont + 1
	Mientras Que (cont <= num/2 Y resul)
FinFuncion

//Palabra	H	O	L	A
//Longitud	1	2	3	4
//Posicion	0	1	2	3