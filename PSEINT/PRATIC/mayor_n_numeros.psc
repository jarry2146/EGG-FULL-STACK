Algoritmo mayor_n_numeros
//	Algoritmo para determinar el mayor de n numeros
	definir n,x,total ,mayor Como Entero
	
	Escribir " ingrese total  numero "
	leer total
	x=1
	Mientras x<= total Hacer
		
		Escribir " escribir numero" 
		leer n
		si x ==1 Entonces
			mayor=n
		SiNo
			si n> mayor Entonces
			mayor =n
			FinSi
		FinSi
		x=x+1
	Fin Mientras
	escribir " el numero mayor es " mayor 
FinAlgoritmo
