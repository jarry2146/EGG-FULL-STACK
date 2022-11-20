Algoritmo ejer1extr
	definir n,resultado como entero;
	
	Escribir "Ingresar un numero: ";
	Leer n;
	resultado = div(n)
	
FinAlgoritmo

Funcion resultado <- div(n)
	Definir i Como Entero
	Para i<-1 hasta n-1 Hacer
		si n mod i=0 Entonces
			escribir i
		FinSi
	FinPara
Fin Funcion
