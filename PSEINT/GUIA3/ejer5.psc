//Realizar una función que reciba un numero ingresado por el usuario y averigüe si el número es
//primo o no. Un número es primo cuando es divisible sólo por 1 y por sí mismo, por ejemplo: 2,
//3, 5, 7, 11, 13, 17, etc. Nota: recordar el uso del MOD.



Algoritmo ejer5
	
	Definir n Como Entero
	
	Escribir "Digite un número: "; Leer n
	
	Escribir "El número  ", fu(n)
	
FinAlgoritmo

Funcion resultado <- fu(a)
	Definir resultado Como Caracter
	Definir i, cont Como Entero
	
	cont = 0
	
	Para i=1 Hasta a  Con Paso 1 Hacer
		
		Si a MOD i == 0 Entonces
			cont = cont + 1
		FinSi
		
	FinPara
	
	Si cont == 2 Entonces
		resultado = "Es Primo"
	SiNo
		resultado = "No es Primo"
	FinSi
	
	
FinFuncion
