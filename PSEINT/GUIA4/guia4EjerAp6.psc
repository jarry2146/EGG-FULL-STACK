Algoritmo guia4EjerAp6
	definir vector, frase,caract como cadena
	definir long,i,posicion Como Entero
	dimension vector[20]
	escribir " Por favor ingrese una frase:"
	leer frase
	long=Longitud(frase)
	llenarvector(vector,frase,long)
	mostrarvector(vector)
	
	escribir " Por favor ingrese un caracter:"
	leer caract
	escribir " Por favor ingrese una posicion entre 0-19 para reemplazar:"
	leer posicion
	Mientras posicion<=0 o posicion>19
		escribir " Por favor ingrese nuevamente una posicion entre 0-19 para reemplazar:"
		leer posicion
	FinMientras
	
	si validar(vector,caract,posicion) == Verdadero
		mostrarvector(vector)
	SiNo
		escribir "Estimado la posicion:", posicion," se encuentra ocupada por el caracter: ",vector[posicion]
	FinSi
	
FinAlgoritmo

SubProceso llenarvector(vector por referencia,frase,long)	
	definir i Como Entero
	para i=0 hasta long Hacer
		vector[i]=Subcadena(frase,i,i)
	FinPara
	para i=long hasta 19 Hacer
		vector[i]=" "
	FinPara
FinSubProceso

subproceso mostrarvector(vector)
	definir i Como Entero
	para i=0 hasta 19 Hacer
		escribir sin saltar vector[i], " "
	FinPara
	escribir ""
	para i=0 hasta 19 Hacer
		escribir sin saltar i," "
	FinPara
	escribir ""
	
FinSubProceso

Funcion  retorno <- validar(vector Por Referencia,caract,i)
	definir retorno Como Logico
	si vector[i]=" " entonces
		vector[i]=caract
		retorno=Verdadero
	SiNo
		retorno=Falso
	FinSi

FinFuncion



	


	