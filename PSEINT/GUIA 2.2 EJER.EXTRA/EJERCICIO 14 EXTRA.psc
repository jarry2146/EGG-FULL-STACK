//Escriba un programa que lea un número entero (altura) y a partir de él cree una escalera
//invertida de asteriscos con esa altura. Por ejemplo, si ingresamos una altura de 5 se
//deberá mostrar:
//	***** 
//	**** 
//	*** 
//	** 
//* 


Algoritmo EXTRA7GUIA22
	definir num, alt como entero
	definir caract Como Caracter
	escribir "Ingrese una numero"
	leer num
	 caract = "*"
	mientras num>0 Hacer
		Para alt=0 Hasta num Con Paso  1 Hacer
			escribir caract, " " sin saltar
		FinPara
		Escribir  "* "
		num = num - 1
	FinMientras
	
	
	
	
FinAlgoritmo
