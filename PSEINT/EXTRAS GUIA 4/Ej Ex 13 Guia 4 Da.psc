////Crear una matriz que contenga 3 columnas y la cantidad filas que decida el usuario. Las dos
////primeras columnas contendrán valores enteros ingresados por el usuario y en la 3 columna se
////deberá almacenar el resultado de sumar el número de la primera y segunda columna. Mostrar
////la matriz de la siguiente forma:
////	3 + 5 = 8
////	4 + 3 = 7
////	1 + 4 = 5

Algoritmo Extra13Guia4
	definir matriz,f,c,i, num Como Entero
	c=3
	i=0
	escribir "por favor introdusca la cantidad de filas que necesita"
	leer f
	Dimension matriz(f,c)
	
	para f=0 hasta f-1 hacer
		para c=0 hasta 2 Hacer
			si c == 2
				matriz(f,c)= i
				i=0
			SiNo
				
			Escribir "intrusca valores"
			leer matriz(f,c)
			
			i=i+matriz(f,c)
		FinSi
		
		FinPara
	FinPara
	para f=0 hasta f-1 Hacer
		Para c=0 hasta c-1 Hacer
			Escribir "[" matriz(f,c) "]","" Sin Saltar
		FinPara
		Escribir ""
	FinPara
FinAlgoritmo
