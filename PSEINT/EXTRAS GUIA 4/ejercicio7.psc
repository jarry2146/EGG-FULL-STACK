Algoritmo ejercicio7
	Definir arreglo, n Como Entero
	Escribir "Ingrese el largo del arreglo"
	Leer n
	Dimension arreglo(n)
	llenarVector(arreglo,n)
	Escribir "La suma de los componentes del vector es de: ", devolverSuma(arreglo,n)
FinAlgoritmo

Funcion llenarVector(arreglo Por Referencia,n)
	Definir i Como Entero
	Para i=0 Hasta n-1
		Escribir "Ingrese el valor", i+1
		Leer arreglo(i)
	FinPara
FinFuncion

Funcion suma=devolverSuma(arreglo,n)
	Definir suma,i Como Entero
	Si n=1
		suma = arreglo(0)
	SiNo
		suma = arreglo(n-1) + devolverSuma(arreglo,n-1)
	FinSi
	
FinFuncion
