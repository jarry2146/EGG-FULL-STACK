//Realizar una funci�n que reciba un numero ingresado por el usuario y averig�e si el n�mero es
//primo o no. Un n�mero es primo cuando es divisible s�lo por 1 y por s� mismo, por ejemplo: 2,
//3, 5, 7, 11, 13, 17, etc. Nota: recordar el uso del MOD.



Algoritmo ejer5
	
	Definir n Como Entero
	
	Escribir "Digite un n�mero: "; Leer n
	
	Escribir "El n�mero  ", fu(n)
	
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
