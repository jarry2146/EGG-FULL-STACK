//Realizar un procedimiento que permita realizar la divisi�n entre dos n�meros y muestre el
//cociente y el resto utilizando el m�todo de restas sucesivas.
//El m�todo de divisi�n por restas sucesivas consiste en restar el dividendo con el divisor hasta
//obtener un resultado menor que el divisor, este resultado es el residuo, y el n�mero de restas
//realizadas es el cociente. Por ejemplo: 50 / 13:
//		50 ? 13 = 37 una resta realizada
//		37 ? 13 = 24 dos restas realizadas
//		24 ? 13 = 11 tres restas realizadas
//	dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.

Algoritmo sin_titulo
	Definir num1,num2 Como Entero
	Escribir "ingrese dos numeros"
	Leer num1,num2
	restasu(num1,num2)
FinAlgoritmo

SubProceso restasu (num1,num2)
	Definir cociente, resto, x, cont Como Real
	cociente= 0
	x= num1-num2
	Mientras x >= num2 Hacer
		x= x-num2
		cociente= cociente + 1
	Fin Mientras
	Escribir "el residuo es " x, " y el cociente es " cociente
FinSubProceso
	