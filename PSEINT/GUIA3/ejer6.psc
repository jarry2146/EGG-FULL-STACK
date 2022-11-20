Algoritmo ejer6
	definir num1, num2 Como Entero
	Escribir "Ingrese el primer numero: "
	leer num1
	Escribir "Ingrese el segundo numero: "
	Leer num2
	intercambio(num1,num2)
	escribir "Ahora el primer numero ingresado es: ",num1 " y el segundo numero ingresado es: ",num2
	
FinAlgoritmo

subproceso intercambio(num1 Por referencia, num2 por referencia)
	definir num3 como entero
	num3=num1
	num1=num2
	num2=num3
FinSubProceso
