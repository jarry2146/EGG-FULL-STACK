//Rellenar una matriz, de 3 x 3, con una palabra de 9 de longitud, pedida por el usuario,
//encontrando la manera de que la frase se muestre de manera continua en la matriz.
//Por ejemplo, si tenemos la palabra habilidad, nuestra matriz se debería ver así:
//		H A B
//		I L I
//		D A D
//	Nota: recordar el uso de la función Subcadena().

Algoritmo ejer12
	
	definir A,B Como Caracter
	definir i,j Como Entero
	
	dimension A[3]
	dimension B[3,3]
	
	para i=0 hasta 3-1 con paso 1 Hacer
		para j=0 hasta 3-1 con paso 1 Hacer
			escribir sin saltar "ingrese los numeros  ",i," ",j
			leer B[i,j]
		FinPara
	FinPara
	para i=0 hasta 3-1 con paso 1 Hacer
		para j=0 hasta 3-1 con paso 1 Hacer
			escribir sin saltar B[i,j] "  "
		FinPara
		escribir" "
	FinPara
	escribir" "
	escribir " la matriz quedaria de esta forma"
	
FinAlgoritmo
