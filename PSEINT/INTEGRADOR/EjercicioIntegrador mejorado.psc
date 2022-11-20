Algoritmo EjercicioIntegrador
	Definir matriz, muestragen Como Caracter
	Definir f,c Como Real //para recorrer matriz y definir f=filas, c=columnas (real por si f y c no es cuadrada 3x3 4x4 o 37x37)
	
	muestragen=Mayusculas("ACDDCBDBCDABDBBA") //aqu� coloco la muestra gen ADN longitud= 9, 16 o 1369
	
	Si validarTam(muestragen)==Verdadero Entonces //llamo a la funci�n para validar logicamente
		Escribir "La muestra del gen es v�lida!"
	SiNo
		Escribir "La muestra del gen NO ES V�LIDA!"
	FinSi
	
	f=raiz(Longitud(muestragen)) //defino filas y columnas como la ra�z de la longitud muestragen.
	c=raiz(Longitud(muestragen)) //De no ser una longitud v�lida (cuadrada no dar� entero)
	Dimension matriz[f,c]
	Escribir ""
	llenado(matriz,muestragen,f,c)
	Escribir "" //separo con espacio al proceso de llenado anterior
	DiagP(matriz,muestragen,f,c)
	Escribir "" //separo con espacio al proceso de llenado anterior
	DiagS(matriz,muestragen,f,c)
	Escribir "" //separo con espacio al proceso de llenado anterior
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
	n=raiz(Longitud(muestragen)) //para recorrer la cadena muestragen en forma lineal
	Para f<-0 Hasta f-1 Con Paso 1 Hacer //filas
		Para c<-0 Hasta c-1 Con Paso 1 Hacer //columnas
			 matriz[f,c]=Subcadena(muestragen,n+c,n+c) // en la subcadena linealizo la matriz
				
			
			matriz[f,c]=Subcadena(muestragen,n+c,n+c)
			Escribir matriz[f,c], " " Sin Saltar //escribo toda la fila separando c/espacio
		Fin Para
		Escribir "" //para saltar fila
	Fin Para
FinSubProceso

SubProceso DiagP(matriz,muestragen,f,c)
	Para f<-0 Hasta f-1 Con Paso 1 Hacer //filas
		Para c<-0 Hasta c-1 Con Paso 1 Hacer //columnas
			Si f=c  Entonces
				Escribir matriz[f,c], " " Sin Saltar //escribo toda la fila separando c/espacio
			FinSi
		Fin Para
	Fin Para
	Escribir""
	FinSubProceso
	SubProceso DiagS(matriz,muestragen,f,c)
		Definir n Como Real
		n=trunc(raiz(Longitud(muestragen))) //ac� lo utilizo para el condicional de la diagonal secundaria, tomo el truncado para que siga siendo entero para la condici�n
		
		Para f<-0 Hasta f-1 Con Paso 1 Hacer //filas
			Para c<-0 Hasta c-1 Con Paso 1 Hacer //columnas
				Si f+c=n-1  Entonces
					Escribir matriz[f,c], " " Sin Saltar //escribo toda la fila separando c/espacio
				FinSi
			Fin Para
		Fin Para
FinSubProceso

 