Algoritmo ejer2
//	Realizar un programa que lea 10 números reales por teclado, los almacene en un arreglo y
//	muestre por pantalla la suma, resta y multiplicación de todos los números ingresados al
	//	arreglo.
	definir vector,i, suma,resta  Como Real
	dimension vector(10)
	i=0
	suma=0
	resta=0
	
	para i=0 hasta 10-1 con paso 1 Hacer
		vector(i) = i
		suma=suma+vector(i)
		escribir vector(i)
	FinPara
	
	escribir"la suma es " suma
	

	
	
	
FinAlgoritmo
