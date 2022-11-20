
Algoritmo  prueba
	definir num1,num2 Como Entero
	Definir resultado Como logico
	
	escribir" ingresar numero  " 
	leer num1
	escribir" ingresar numero  " 
	leer num2 
	
	
	num1 = 0
	num2 = 0
	resultado = comparar(num1,num2)
	
	Escribir "El num1 es mayor a num2, esta afirmación es: " resultado
	
FinAlgoritmo

Funcion retorno <- comparar(num1,num2)
	definir retorno Como logico
	si num1+num2 <>0 Entonces
		retorno = Verdadero
sino
		retorno = falso

		si num1+ num2 <>1 Entonces
			retorno = Verdadero
		sino
			retorno = falso
			
		FinSi
		
finsi
	
	
	
FinFuncion



