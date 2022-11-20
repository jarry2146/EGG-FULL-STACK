//Escriba un programa que lea un número entero (altura) y a partir de él cree una escalera
//invertida de asteriscos con esa altura. Por ejemplo, si ingresamos una altura de 5 se
//deberá mostrar:
//	***** 
//	**** 
//	*** 
//	** 
//* 


Algoritmo EXTRA7GUIA22
	definir num, alt, base como entero
	escribir "Ingrese una numero"
	leer num
	
	para alt = 1 Hasta num Hacer
		Para base =1 hasta num Hacer
			si alt>1 y alt<=num y base>1 y base<=num Entonces
				escribir "  " Sin Saltar
			sino 
				escribir "* " Sin Saltar
				
			FinSi
		FinPara
	FinPara
	
	
	
	
FinAlgoritmo
