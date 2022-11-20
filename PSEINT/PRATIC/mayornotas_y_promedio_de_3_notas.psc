
//escribir un programa que calcule  la nota mas alta y saque el promedio de las 3 notas. 
Algoritmo mayornotas_y_promedio_de_3_notas
	definir nota1,nota2,nota3, resul Como Real
	escribir" ingrese las 3 notas"
	leer nota1,nota2,nota3
	
	resul=(nota1+nota2+nota3)/3
	
si nota1>nota2 entonces
		si nota1>nota3 Entonces
FinSi
		escribir" nota1 es mayor y el numero es " nota1
SiNo
		si nota2>nota3 Entonces
	    escribir" nota2 es mayor y numero es  " nota2
SiNo
		escribir" nota3 es mayor y numero es  " nota3
FinSi
FinSi
	   escribir" el promedio de las 3 notas es  " resul
	
FinAlgoritmo
