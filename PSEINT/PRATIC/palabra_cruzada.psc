Funcion imprimirArreglo(arreglo,size)
	definir salida Como Caracter
	para i=1 Hasta size Con Paso 1 Hasta 
		salida=salida + arreglo[i]
	FinPara
	escribir salida
Fin Funcion

funcion llenararreglo(arreglo,size,)
	definir i  Como entero
	
	para i=1 Hasta size Con Paso 1 Hasta 
		arreglo[i]="-"
	FinPara
FinFuncion

Algoritmo palabra_cruzada
	Definir  cadena ,letra ,arreglo Como Caracter
	Definir  size ,j,i Como Entero
	escribir" dijite una palabra de minimo 3 caracteres "
	leer cadena
	
	size= Longitud(cadena)
	j=size
	
	dimension arreglo(size)
	llenarArreglo(arreglo, size)
	
	
	para i=1 Hasta size Con Paso 1 Hasta
		letra= Subcadena(cadena,i,i)
		arreglo[i]=letra
		arreglo[j]=letra
		imprimirArreglo(arreglo, size)
		j=j-1
		llenarArreglo(arreglo,size)
		escribir sin saltar "",arreglo[i] ,""
		
FinPara


FinAlgoritmo

