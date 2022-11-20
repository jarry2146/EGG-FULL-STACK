Algoritmo detarea
	Definir a,b,c,f,suma1,suma2,matriz Como Entero
	Escribir "Ingresa el tamaño de la matriz"
	leer a,b
	Dimension matriz[a,b]
	para f = 1 Hasta a-1 Con Paso 1 Hacer
		para c = 1 Hasta b-1 Con Paso 1 Hacer
			matriz(f,c) = azar(9) + 1
		FinPara
	FinPara
	
	para f = 1 Hasta a-1 Con Paso 1 Hacer
		para c = 1 Hasta b-1 Con Paso 1 Hacer
			Escribir matriz(f,c)," " Sin Saltar
		FinPara
		Escribir ""
	FinPara
	suma1=0
	para f = 1 Hasta a-1 Con Paso 1 Hacer
		para c = 1 Hasta b-1 Con Paso 1 Hacer
			si f=c Entonces
				suma1=suma1 + matriz(f,c)
			FinSi
		FinPara
	FinPara
	
	Escribir "La suma de la diagonal primaria es: ",suma1

	suma2 = 0
	para f = 1 Hasta a-1 Con Paso 1 Hacer
		para c = 1 Hasta b-1 Con Paso 1 Hacer
			
		
			si f+c==b-1 Entonces
				suma2 = suma2 + matriz(f,c)
			FinSi
			
	
	FinPara
FinPara
	Escribir "La suma de la diagonal secundaria es: ",suma2
FinAlgoritmo