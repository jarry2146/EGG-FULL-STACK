Algoritmo ejer11_extra
	definir x,a,b Como Entero
	x=1
	a=0
	b=0
	
	mientras x <= 100 Hacer
		si x mod 2 == 0 Entonces
			escribir" numero multiplo de 2:  " x
			a = a + 1
		SiNo
			si x mod 3 == 0 Entonces
				escribir"numero multiplo de 3:  " x
				b = b + 1
				
			FinSi
		FinSi
		x = x + 1
		
	FinMientras
	escribir " numeros multiplos de 2 :" a
	escribir " numeros multiplos de 3:" b
FinAlgoritmo
