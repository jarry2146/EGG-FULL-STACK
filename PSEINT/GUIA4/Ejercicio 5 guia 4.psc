Algoritmo sin_titulo
	definir vector1, tamDimension, mayor como Entero
	Escribir "Ingrese el tamaño de la dimension"
	Leer tamDimension
	Dimension vector1[tamDimension]
	Definir valorInicial Como real
	valorInicial=0
	
	mayor = 0
	Hacer
		Escribir "Ingrese un valor para el espacio, numero" valorInicial+1
		Leer vector1[valorInicial]
		valorInicial = valorInicial + 1
	Mientras Que valorInicial<>tamDimension 
	
	Escribir "El numero mayor del arreglo es: "; numMayor(vector1, tamDimension, valorInicial, mayor)
FinAlgoritmo

funcion numMayor(v1, tDimension, valInicial, may)
	
	para valInicial = 0 Hasta tDimension-1 Con Paso 1 Hacer
		si valInicial == 0 Entonces
			may= v1[valInicial]
			
		SiNo
			si v1[valInicial] > may Entonces
				may = v1[valInicial]
			FinSi
		FinSi
	FinPara
	Escribir may
FinSubProceso
	