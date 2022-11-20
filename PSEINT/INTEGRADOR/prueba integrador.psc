Algoritmo integrador_pdc
	Definir matriz, muestra Como Cadena
	Definir f, c Como Entero
	muestra = "CDDACCACCACAAABC"
	
	Si validarTam(muestra) = Verdadero Entonces
		Escribir "La muestra es valida "
	SiNo
		Escribir "La muestra no es valida"
	FinSi
	
	f = raiz(Longitud(muestra))
	C = raiz(Longitud(muestra))
	
	Dimension matriz(f, c)
	
	llenado(matriz, muestra, f, c)
	diagPrin(matriz, f, c, muestra)
	diagSec(matriz, f, c, muestra)
	
FinAlgoritmo


Funcion tam <- validarTam(muestra)
	Definir tam Como Logico
	tam = Falso
	
	Si Longitud(muestra) = 9 O Longitud(muestra) = 16 O Longitud(muestra) = 1369 Entonces
		tam = Verdadero
	FinSi
FinFuncion

SubProceso llenado(matriz,muestragen,f,c)
	Definir n Como Real
	definir i,j,nf Como Entero
	nf=0
	i=0
	j=0
	n=raiz(Longitud(muestragen)) //para recorrer la cadena muestragen en forma lineal
	Para i<-0 Hasta f-1 Con Paso 1 Hacer //filas
		Para j<-0 Hasta c-1 Con Paso 1 Hacer //columnas
			matriz[i,j]=Subcadena(muestragen,nf+c,nf+c) // en la subcadena linealizo la matriz
			Escribir matriz[i,j], " " Sin Saltar //escribo toda la fila separando c/espacio
		Fin Para
		Escribir "" //para saltar fila
	Fin Para
FinSubProceso
SubProceso diagPrin(matriz, f, c, muestra)
	Definir i, j, num, fila Como Entero
	fila = 0
	i=0
	j=0
	Para i = 0 Hasta f - 1
		Para j = 0 Hasta c - 1 Hacer
			Si i = j Entonces
				Escribir matriz(i, j) Sin Saltar""
			FinSi
		FinPara
	FinPara
FinSubProceso

SubProceso diagSec(matriz, f, c, muestra)
	Definir i, j, num, fila, cont, d Como Entero
	Definir totalDiag Como Logico
	para i=0 hasta f-1 Con Paso 1 Hacer
		para j=0 hasta c-1 Con Paso 1 Hacer
			si (f=c) o (f+c=7) Entonces
				Escribir matriz[i,j] Sin Saltar ""
			FinSi
		FinPara
		Escribir ""
	FinPara
FinSubProceso

