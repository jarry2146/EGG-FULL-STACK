Algoritmo Ejercicio_7
	Definir dias Como Entero
	Definir media Como Real
	
	Escribir "Para cuantos días desea calcular la media?"
	Leer dias
	
	temp_media(dias, media)
	
	
FinAlgoritmo


SubProceso temp_media(dias, media Por Referencia)
	Definir min, max, aux Como Real
	Definir i Como Entero
	
	Para i=1 Hasta dias Con Paso 1 Hacer
		Escribir "Ingrese la temp. mínima del día ", i
		Leer min
		Escribir "Ingrese la temp. máxima del día ", i
		Leer max
		
//		Si min > max Entonces
//			aux = min
//			min = max
//			max = aux
//		FinSi
//		
//		Escribir "min: ", min
//		Escribir "max: ", max
		
		media = (min + max)/2
		Escribir  "La temp media es ", media
	FinPara
	
FinSubProceso

//Palabra	H	O	L	A
//Longitud	1	2	3	4
//Posicion	0	1	2	3