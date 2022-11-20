//Realizar un procedimiento que permita intercambiar el valor de dos variables de tipo entero.
//La variable A, debe terminar con el valor de la variable B.

Algoritmo ejercicio06
	definir A, B como entero
	escribir "por favor ingrese un numero"
	leer A
	escribir "ingrese su segundo numero"
	leer B
	escribir "estos valores seran intercambiados"
	intercambio(A,B) 
	intercambio1(B,A)
FinAlgoritmo


subproceso intercambio(A,B)
	A=B
	escribir A
FinSubProceso

SubProceso intercambio1(B,A)
	B=A	
	escribir B
FinSubProceso
