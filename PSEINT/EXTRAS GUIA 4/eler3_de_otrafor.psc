Algoritmo eler3_de_otrafor
	Definir Vector1, Num, i,j Como Entero
	Definir Vector2, Vector3 Como Caracter
	Escribir "Definina el tamaño de sus vectores"
	Leer Num
	Dimension Vector1(Num), Vector2(Num)
	Para i<-0 Hasta num-1 Hacer
		Escribir "Digite el nombre que quiere almacenar"
		Leer Vector2(i)
	Fin Para
	
	Para i<-0 Hasta num-1 Hacer
		Vector1(i)=Longitud(Vector2(i))
		Dimension Vector3(longitud(Vector2(i)))
		Para j<-0 Hasta Vector1(i) Hacer
			
			Vector3(i)=Subcadena(Vector2(i),j,j)
			Si Vector3(i)=" " Entonces
				Vector1(i)=Vector1(i)-1
			FinSi
			
		Fin Para
		escribir" el nombre  " Vector2(i) " tiene " Vector1(i) " letra  "
	Fin Para

FinAlgoritmo
