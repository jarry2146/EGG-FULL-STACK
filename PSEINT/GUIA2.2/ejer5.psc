Algoritmo ejer5
//	Escribir un programa que lea números enteros hasta teclear 0 (cero). Al finalizar el
//	programa se debe mostrar el máximo número ingresado, el mínimo, y el promedio de
//	todos ellos.
	
	
	definir num, contador, bandera, min,mayor Como Entero
	definir promedio Como Real
	bandera = 0
	contador = 0 
	num = 0
	min = 0
	mayor = 0
	
	hacer 
		escribir " ingrese un numero:"
		leer bandera
		
		num = num + bandera 
		contador = contador + 1
		si bandera <> 0 entonces 
		
			
		FinSi
	
		si bandera = 0 Entonces
			
			contador = contador + 1
			bandera = mayor + bandera
			bandera = min + bandera
			
			si bandera < min Entonces
				min = bandera
			sino
				si bandera > mayor Entonces
					mayor = bandera
				FinSi
			FinSi
			
		FinSi
		mientras que  bandera <> 0
		promedio = num / contador
		escribir " el maximo es :"  contador
		escribir " el minimo es:"  bandera
		escribir " el promedio es:"  promedio
		

	
	
FinAlgoritmo
