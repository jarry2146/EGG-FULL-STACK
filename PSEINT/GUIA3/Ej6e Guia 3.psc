Algoritmo ej6e
	
	Definir num Como Entero
	Definir rdo como cadena
	
	Escribir "Ingrese un numero con digitos impares"
	
	Leer num
	
	rdo = impares(num)
	
	Escribir rdo

	
FinAlgoritmo


Funcion retorno <- impares (num)
    Definir retorno como cadena
	Definir num1, cont Como Entero
	
	
	cont = 0
    Mientras num mod 10 > 0 Hacer
		
		num1 = num mod 10
		num = trunc(num/10)
		
		Si num1 mod 2 = 0 Entonces
			cont = cont + 1
		FinSi
		
		Si cont = 0
			
			retorno =  "Bien hecho"
			
		SiNo
			retorno = "No todos sus numeros son impares"
			
		FinSi
	
    FinMientras
	
	
	
	
FinFuncion
	