Algoritmo calculadora9
	//definir variables
	definir n1,n2,opc,res Como Entero
	//pedir datos de entrada
	escribir " ingrese numero 1"
	leer n1
	
	escribir " ingrese numero 2"
	leer n2
	//opciones
	escribir "ingrese una opcion"
	escribir " 1 sumar"
	escribir " 2 restar"
	escribir " 3 multiplicar"
	escribir " 4 dividir" 
	leer opc
	//proseso
	Segun opc Hacer
		1:
			res = n1 + n2
			escribir "la suma es" res
			
		2:
			res = n1 - n2
			escribir " la resta es " res
			
		3:
			res = n1 * n2 
			escribir " la multiplicacion es " res
			
		4:
			res = n1 / n2
			escribir " la divicion es " res
			
		De Otro Modo:
			escribir "el numero digitado es erroneo"
	Fin Segun
FinAlgoritmo
