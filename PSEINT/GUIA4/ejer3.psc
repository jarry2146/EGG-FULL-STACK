Algoritmo ejer3
	Dimension num(2)
	Definir num, i, us, num1, cont Como Entero
	cont=0
	
	Para i =0 Hasta 1 Con Paso 1 Hacer
		Escribir "Ingrese los numeros"
		Leer num(i)
	Fin Para
	Escribir "Ingrese el numero que quiere buscar"
	Leer us
	si num(0)=us Entonces
		cont=cont+1
		
	FinSi
	si num(1)=us Entonces
		cont=cont+1
	FinSi
	si num(0)<> us Entonces
		Escribir "No se encontro el numero en el programa"
	FinSi
	si num(1) <> us Entonces
		Escribir "No se encontro el numero en el programa "
	FinSi
	Escribir " El programa encontro " cont " De veces el numero "
	
	
FinAlgoritmo