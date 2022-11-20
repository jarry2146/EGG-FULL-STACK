Algoritmo extrag2
	definir td,tp Como Entero
	escribir " ingrese la cantidad de torinillos defectuosos "
	leer td
	escribir " ingrese la cantidad de torinillos sin defectos "
	leer tp
	td=1
	tp=1
	si td>=200 y tp<= 10000 Entonces
		escribir " es grado 5 "
	sino 
		si td<=200 y tp <= 10000 Entonces
			escribir " es grado 6 "
		SiNo
			si td>=200 y tp>= 10000 Entonces
				escribir " es grado 7 "
			SiNo
				si td<= 200 y tp >= 10000 Entonces
					escribir " es grado 8 "
				FinSi
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
