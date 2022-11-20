Algoritmo ejer1vectores
//	Realizar un programa que rellene un vector con 5 valores ingresados por el usuario y los
//	muestre por pantalla.
	Definir vector,i  Como Entero
	Dimension vector(5)

		
		
		escribir"ingrese numero"
		
		Para i<-0 Hasta 4 Hacer
			leer vector(i)
			
		FinPara
		
		escribir" los numeros son  " 
		
		para i=4 hasta 0 con paso -1 hacer
			si i=0
				
				
			sino
				escribir vector(i) ","  sin saltar
				
			FinSi
			
		FinPara
FinAlgoritmo