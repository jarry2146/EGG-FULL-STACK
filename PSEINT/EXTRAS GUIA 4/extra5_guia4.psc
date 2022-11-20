Algoritmo extra5_guia4
	definir vector, frase, carac Como Caracter
	definir i, posicion como entero
	dimension vector(20)
	
	repetir
		escribir "Ingrese una frase de 20 o menos caracteres"
		leer frase
	Mientras Que  longitud(frase)>=20
	
	para i<- 0 hasta 19 hacer
		vector(i) = SubCadena(frase,i,i)
	FinPara
	
	Escribir "ingrese un caracter para ingresar y la posicion deseada"
	leer carac
	leer posicion
	
	si vector(posicion) = "" o vector(posicion) = " " Entonces
		
		vector(posicion)=carac
	sino
		
		para i<- 0 hasta posicion Hacer
			si vector(i) = "" o vector(i) = " " entonces
				vector(i) = vector(i+1)
				
				vector(posicion) = carac
				
			sino
				para i<- posicion hasta  longitud(frase) -1 Hacer
					si vector(i) = "" o vector(i) = " " Entonces
						vector(i) = vector(i-1)
						
						
						vector(posicion) = carac
						
					FinSi
				FinPara
			FinSi
		finpara
		
		
	FinSi
	
	
	para i<- 0 hasta 19 hacer
		escribir Sin Saltar vector(i)
	FinPara
	
FinAlgoritmo 