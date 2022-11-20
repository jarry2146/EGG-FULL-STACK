Algoritmo operacionesBasicas
	Definir a,b,x como real
	Escribir "Escribe dos numeros"
	leer a,b
	x = 0
	Mientras x <> 5 hacer
		escribir "Elige una opcion "
		Escribir "1 = suma"
		Escribir "2 = resta"
		Escribir "3 = multiplicacion "
		Escribir "4 = division"
		Escribir "5 = salir"
		leer x
		
		segun x
			1:
				Escribir "La suma de ",a," + ",b," = ",a+b
			2:
				Escribir "La resta de ",a," - ",b," = ",a-b
			3:
				Escribir "La multiplicacion de ",a," x ",b," = ",a*b
			4:
				Escribir "La division de ",a," / ",b," = ",a/b
			De Otro Modo:
				x = 5
		FinSegun
	FinMientras
FinAlgoritmo