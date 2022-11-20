Algoritmo ejer4p
	Definir Vector, i, Deficientes, Regulares, Buenos, Excelentes Como entero
	Dimension Vector(100)
	Deficientes=0
	Regulares=0 
	Buenos=0
	Excelentes=0 
	Para i<-0 Hasta 99 Con Paso 1 Hacer
		Vector(i)=Aleatorio(0,20)
		Si Vector(i)>=0 Y Vector(i)<=5 Entonces
			Deficientes=Deficientes+1
		FinSi
		Si Vector(i)>=6 Y Vector(i)<=10 Entonces
			Regulares=Regulares+1
		FinSi
		Si Vector(i)>=11 Y Vector(i)<=15 Entonces
			Buenos=Buenos+1
		FinSi
		Si Vector(i)>=16 Y Vector(i)<=20 Entonces
			Excelentes=Excelentes+1
		FinSi
	Fin Para
	Escribir "El numero de estudiantes que fueron deficientes, fue de: ", Deficientes
	Escribir "El numero de estudiantes que fueron regulares, fue de: ", Regulares
	Escribir "El numero de estudiantes que fueron buenos, fue de: ", Buenos
	Escribir "El numero de estudiantes que fueron excelentes, fue de: ", Excelentes

FinAlgoritmo
