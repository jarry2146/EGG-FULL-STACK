
Algoritmo Triangulo_con_asteriscos
	Definir n,a,b,c como entero	
	Escribir "Escribe un numero"
	leer n
	
	Para a = n Hasta 1 Con Paso -1 Hacer
		para b = 1 hasta a con paso 1 Hacer	
			Escribir " " Sin Saltar 
			fin para
			Para c = a hasta n con paso 1 Hacer
				Escribir " *" Sin Saltar	
			FinPara
		
			
		Escribir " "
	FinPara
FinAlgoritmo
