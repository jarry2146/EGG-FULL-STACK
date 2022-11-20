Algoritmo ej1extra
	
	//	Realizar un programa que rellene dos vectores al mismo tiempo, con 5 valores aleatorios y los
	//	muestre por pantalla.
	
	Definir vector, vectora,  i, num Como Entero
	Dimension vector[5]
	Dimension vectora[5]
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		
		vector[i]=Aleatorio(1, 9)
		vectora[i]=Aleatorio(1, 9)
	Fin Para
	
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		
	    Escribir Sin Saltar  "[" vector(i) "]" 

		
		escribir sin saltar"     " ;	Escribir Sin Saltar "[" vectora(i) "]"
		
	Fin Para
	
	
	escribir""
FinAlgoritmo
