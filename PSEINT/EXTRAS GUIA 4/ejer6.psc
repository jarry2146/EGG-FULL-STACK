Algoritmo ejer6
	Definir Vector, i, valorMaximo, valorMinimo, Diferencia Como Entero
	Dimension Vector(3)
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		Escribir "Introduzca tres numeros"
		Leer Vector(i)
		valorMaximo=Vector(0)
		valorMinimo=Vector(0)
		Si valorMaximo<Vector(i) Entonces
			valorMaximo=Vector(i)
		FinSi
		Si valorMinimo>Vector(i) Entonces
			valorMinimo=Vector(i)
		FinSi
	Fin Para
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		Si valorMaximo<Vector(i) Entonces
			valorMaximo=Vector(i)
		FinSi
		Si valorMinimo>Vector(i) Entonces
			valorMinimo=Vector(i)
		FinSi
	Fin Para
	Diferencia=valorMaximo-valorMinimo
	Escribir "La diferencia entre el valor maximo y el valor minimo es de: ",Diferencia
finalgoritmo
