Algoritmo guia3ejer5
	
	definir num Como Real
	escribir " escriba un numero primo "
	escribir "Un número es primo cuando es divisible sólo por 1 y por sí mismo, por ejemplo: 2, 3, 5, 7, 11, 13, 17, etc. Nota: recordar el uso del MOD. "
	leer num 
	
	si primo(num) Entonces
		
		escribir " su numero es primo"
		
	sino
		Escribir " su numero no es primo "
		
	FinSi
	
	
FinAlgoritmo

funcion primos <- primo(num)
	Definir primos Como Logico
	primos = num mod num == 0 y num mod 1 == 0 y num mod 2 <> 0 y num mod 3<>0 y num mod 5 <> 0 y num mod 7 <> 0 
	
	
FinFuncion
