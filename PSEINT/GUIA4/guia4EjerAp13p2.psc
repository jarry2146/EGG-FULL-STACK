Algoritmo guia4EjerAp13
	definir matriz, n, suma1 Como Entero
	escribir " Por favor ingrese el tamaño de la matriz, debe estar entre un rango de 1 a 10:"
	leer n
	suma1=0
	//validación de tamaño de la matriz
	Mientras n<0 O n>10
		escribir " Por favor ingrese nuevamente el tamaño de la matriz, debe estar entre un rango de 1 a 10:"
		leer n
	FinMientras
	dimension matriz(n,n)
	llenarmatriz(matriz,n)
	imprimeMatriz(matriz,n)
	si sumafilas(matriz,n,suma1)=Verdadero & sumacolumna(matriz,n,suma1)=Verdadero & sumadiagonal1(matriz,n,suma1)=verdadero & sumadiagonal2(matriz,n,suma1)=Verdadero
		Escribir " la matriz cumple con los requisitos para ser llamada magica :D"
		escribir " la sumatoria de los lados son iguales y el valor es: ", suma1
	SiNo
		Escribir " la matriz no cumple con los requisitos para ser llamada magica :("
	FinSi
FinAlgoritmo

// Subproceso llenar la matriz n
SubProceso llenarmatriz(matriz por referencia,n)
	definir i,j Como Entero
	definir num Como Entero
	Para i<-0 Hasta n-1 Con Paso 1 Hacer
		Para j<-0 Hasta n-1 Con Paso 1 Hacer
			Escribir "Ingrese un numero entre 1 y 9 para la fila " i " y la columna " j  
			Leer num
			Mientras num<1 O num>9
				Escribir "Ingrese nuevamente un numero entre 1 y 9 para la fila " i " y la columna " j  
				Leer num
			FinMientras
			matriz(i,j) = num 
		FinPara
	FinPara

FinSubProceso
// Subproceso imprime la matriz enviada
SubProceso  imprimeMatriz(matriz,n)
	definir i,j Como Entero
	para i=0 hasta n-1
		para j=0 hasta n-1
			escribir matriz(i,j)," " Sin saltar	
		FinPara
		escribir ""
	FinPara
FinSubProceso

// Sumar filas
funcion retorno <- sumafilas(matriz,n,suma Por Referencia)
	definir retorno Como Logico
	definir cont, columna,fila Como Entero
	definir sumaf Como Real
	cont=0
	sumaf=0
	para fila<-0 hasta n-1 Hacer
		suma=suma+matriz[fila,0]
	FinPara
	para fila<-0 hasta n-1 con paso 1 Hacer
		sumaf=0
		para columna<-0 hasta n-1 con paso 1 Hacer
			sumaf=sumaf+matriz[fila,columna]
		FinPara
		si sumaf=suma Entonces
			cont=cont+1
		FinSi
	FinPara
	si cont=n
		retorno = Verdadero
	SiNo
		retorno=Falso
	FinSi
	
FinFuncion

//suma columnas

funcion retorno <- sumacolumna(matriz,n,suma)
	definir retorno Como Logico
	definir cont, columna,fila Como Entero
	definir sumac Como Real
	cont=0
	sumac=0
	para columna<-0 hasta n-1 con paso 1 Hacer
		sumac=0
		para fila<-0 hasta n-1 con paso 1 Hacer
			sumac=sumac+matriz[fila,columna]
		FinPara
		si sumac=suma Entonces
			cont=cont+1
		FinSi
	FinPara
	si cont=n
		retorno = Verdadero
	SiNo
		retorno=Falso
	FinSi
FinFuncion

//Suma diagonal sup-iz hasta el inf-der
funcion retorno <- sumadiagonal1(matriz,n,suma)
	definir retorno Como Logico
	definir i, sumaD1 Como Entero
	sumaD1=0
	para i<-0 hasta n-1 con paso 1 Hacer
		sumaD1=sumaD1 + matriz[i,i]
	FinPara
	si sumaD1=suma
		retorno=Verdadero
	SiNo
		retorno=Falso
	FinSi
FinFuncion

// Sumar diagonal sup-der hasta el inf-izq 
funcion retorno <- sumadiagonal2(matriz,n,suma)
	definir retorno Como Logico
	definir i,j,sumaD2 Como Entero
	sumaD2=0
	j=n-1
	para i <-0 hasta n-1 con paso 1 Hacer
		sumaD2 = sumaD2 + matriz[i,j]
		j = j-1
	FinPara
	si sumaD2=suma
		retorno=Verdadero
	SiNo
		retorno=Falso
	FinSi
FinFuncion

	