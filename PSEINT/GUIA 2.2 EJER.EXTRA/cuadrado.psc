Algoritmo cuadrado
	Definir a,b,c Como Entero
	// a= maximo de distacia osea el perimetro
	// c = base
	// b = altura
	leer a
	para c=1 Hasta a hacer
		// para base hasta la cantidad maxima que pusimos hacer (la altura hasta
		//la cantidad maxima que pusimos)
		para b = 1 hasta a hacer
			si c > 1 y c < a y b > 1 y b < a Entonces
				Escribir "  " Sin Saltar
				//se ponen espacios para que encaje los asteriscos que usemos en la altura 
				sino
					Escribir "* " sin saltar
					// si se cumple la condicion agrega un asterico por cantidad
			FinSi
		FinPara
		escribir""//<- este escribir funciona como separador de la base y la altura 
		//si no se agrega lo que sucede es que esta todo junto porque lo de arriba es un sin saltar
	FinPara
	
	
FinAlgoritmo
