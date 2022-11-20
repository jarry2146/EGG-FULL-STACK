//Crea una función EsMultiplo que reciba los dos números pasados por el usuario, validando
//que el primer número múltiplo del segundo y devuelva verdadero si el primer número es
//múltiplo del segundo, sino es múltiplo que devuelva falso.

Algoritmo ejer3
	
	Definir  n1, n2 Como Real
	Definir logic Como Logico
	
	Escribir "ingrese el primer numero: "; leer n1
	Escribir "ingrese el segundo numero: "; leer n2
	
	logic = primo(n1,n2)
	
	Escribir logic
	
FinAlgoritmo

Funcion resultado <- primo(n1,n2)
	
	Definir resultado Como Logico
	
	si n1 mod n2 = 0 Entonces
		
		resultado = Verdadero
		
	SiNo
		resultado = Falso
		
	FinSi
	
FinFuncion
