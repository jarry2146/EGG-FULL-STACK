Algoritmo ejer4_mejorado
	Definir Vector, i, vector2 Como entero
	Dimension Vector(100), vector2(4)
	Para i<-0 Hasta 3  Hacer
		vector2(i)=0
	Fin Para
	Para i<-0 Hasta 99 Con Paso 1 Hacer
		Vector(i)=Aleatorio(0,20)
		Si Vector(i)>=0 Y Vector(i)<=5 Entonces
			vector2(0)=vector2(0)+1
		FinSi
		Si Vector(i)>=6 Y Vector(i)<=10 Entonces
			vector2(1)=vector2(1)+1
		FinSi
		Si Vector(i)>=11 Y Vector(i)<=15 Entonces
			vector2(2)=vector2(2)+1
		FinSi
		Si Vector(i)>=16 Y Vector(i)<=20 Entonces
			vector2(3)=vector2(3)+1
		FinSi
	Fin Para
	Escribir "El numero de estudiantes que fueron deficientes, fue de: ", vector2(0)
	Escribir "El numero de estudiantes que fueron regulares, fue de: ", vector2(1)
	Escribir "El numero de estudiantes que fueron buenos, fue de: ", vector2(2)
	Escribir "El numero de estudiantes que fueron excelentes, fue de: ", vector2(3)

FinAlgoritmo
