Algoritmo sin_titulo
	definir num Como entero
	definir ret como cadena
	escribir"ingrse un numero"
	leer num
	ret <- primo (num)
escribir ret
FinAlgoritmo


funcion retorno <- primo(num)
	definir retorno Como Cadena
	definir cont Como Entero
	cont =0
	para i=1 hasta num con paso 1 Hacer
		si num mod i = 0 entonces
			cont = cont +1
		FinSi
	FinPara
	si cont = 2 Entonces
		
		retorno = "Su número SI es primo"
	SiNo
		 retorno = "Su número NO es primo"
	FinSi
FinFuncion

	