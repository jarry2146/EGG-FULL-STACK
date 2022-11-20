Algoritmo Extra12Guia4_Matrices_Multiplicadas

Definir matriz1 , matriz2 , f , c Como Entero
Dimension matriz1[3,3], matriz2[3,3]

Para f <- 0 Hasta 2 Hacer
	Para c <- 0 Hasta 2 Hacer
		matriz1[f,c] = Aleatorio(1,9)
		Escribir Sin Saltar matriz1[f,c] "  "
	FinPara
	Escribir  ""
FinPara
Escribir ""
Para f <- 0 Hasta 2 Hacer
	Para c <- 0 Hasta 2 Hacer
		matriz2[f,c] = Aleatorio(1,9)
		Escribir Sin Saltar matriz2[f,c] "  "
	FinPara
	Escribir  ""
FinPara

Escribir ""
Para f <- 0 Hasta 2 Hacer
	Para c <- 0 Hasta 2 Hacer
		matriz1[f,c] = matriz1[f,c] * matriz2[f,c]
		Escribir Sin Saltar matriz1[f,c] "  "
	FinPara
	Escribir  ""
FinPara
FinAlgoritmo

