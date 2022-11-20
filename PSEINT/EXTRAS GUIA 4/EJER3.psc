Algoritmo ejer3
	Definir Vector1, Num, i,cont, j,lon Como Entero
	Definir Vector2, vector3 Como Caracter
	Escribir "Definina el tamaño de sus vectores"
	Leer Num
	Dimension Vector1(Num), Vector2(Num)
	Para i<-0 Hasta num-1 Hacer
		cont = 0
		Escribir "Digite el nombre que quiere almacenar"
		Leer Vector2(i)
		lon=Longitud(Vector2(i))
		para j = 0 Hasta lon-1 Hacer
			si Subcadena(vector2(i),j,j) <> " " Entonces
				cont = cont + 1
			FinSi
			vector1(i) = cont
		FinPara
	Fin Para
	
	Para i<-0 Hasta num-1 Hacer
		
		
		Escribir "El nombre " Vector2(i) " tiene " vector1(i) " letras"
	Fin Para
	
FinAlgoritmo
