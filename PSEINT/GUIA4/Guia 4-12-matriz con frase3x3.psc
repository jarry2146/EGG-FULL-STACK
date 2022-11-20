//Rellenar una matriz, de 3 x 3, con una palabra de 9 de longitud, pedida por el usuario,
//encontrando la manera de que la frase se muestre de manera continua en la matriz. 
//Por ejemplo, si tenemos la palabra habilidad, nuestra matriz se debería ver así:
//		H A B
//		I L I
//		D A D
//	Nota: recordar el uso de la función Subcadena().

Algoritmo sin_titulo
	definir matriz, palabra Como Caracter	
	definir i, j, f, c como entero
	dimension matriz(3,3)
	
	Hacer 
		Escribir "Por favor, ingrese una palabra de 9 letras"
		leer palabra
		j=longitud(palabra)
		
	Mientras Que j <> 9
	
	i=0
	Para f<-0 Hasta 2 Con Paso 1 Hacer
		Para c<-0 Hasta 2 Con Paso 1 Hacer
			matriz(f,c)=Subcadena(palabra,i,i)
			i=i+1
		Fin Para
	Fin Para
	
	Para f<-0 Hasta 2 Con Paso 1 Hacer
		Para c<-0 Hasta 2 Con Paso 1 Hacer
			Escribir matriz(f,c) " " Sin Saltar
		FinPara
		Escribir " "
	Fin Para
	
FinAlgoritmo
