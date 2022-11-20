///Realizar una función que calcule y retorne la suma de todos los divisores del número n 
///distintos de n. El valor de n debe ser ingresado por el usuario.



Algoritmo sin_titulo
	
	Definir Dividendo, Sumatoria Como Entero
	Escribir "Ingrese un numero"
	Leer Dividendo
	Sumatoria = Sumar_Divisores(Dividendo)
	Escribir "La suma de los divisores es: " Sumatoria
FinAlgoritmo

Funcion Sumatoria_Block <- Sumar_Divisores(Dividendo)
	Definir Divisores, Sumatoria_Block Como Entero
	Definir i Como Entero
	Divisores = 0
	Para i <- 1 Hasta Dividendo -1 Con Paso 1 Hacer
		Si 	Dividendo MOD i = 0 Entonces
			Divisores = Divisores + i
			Escribir i
		FinSi
		
	FinPara
	Sumatoria_Block = Divisores

	
FinFuncion

