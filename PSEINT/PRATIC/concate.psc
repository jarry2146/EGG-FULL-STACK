Algoritmo sin_titulo
//	crear un programa que mustre en pantallas 3 nombres y los concatene
	definir nombres,nombres2,cadena1 Como Caracter
	definir pal,pal2 Como entero
	pal=1
	Mientras pal <= 3 Hacer
		Escribir " ingrese nombres "
		leer nombres,nombres2
		pal=pal+1
		cadena1=Concatenar(nombres,nombres2)
FinMientras

	Escribir cadena1

	
FinAlgoritmo
