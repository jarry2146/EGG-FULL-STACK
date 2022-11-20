Algoritmo Ejercicio2Guia3
	Definir a Como Real
	Definir validacion Como Logico
	
	Escribir "Ingrese numero "
	leer a
	validacion = pareimpar(a)
	Si validacion = Verdadero Entonces
		Escribir "El numero ingresado es par"
	SiNo
		Escribir "El numero ingresado es impar"
	FinSi
FinAlgoritmo

Funcion operacion <- pareimpar (c)
	definir operacion Como logico
	Si c mod 2 = 0 Entonces
		operacion = Verdadero
	sino 
		operacion = Falso
	FinSi
	
	FinFuncion
	