//Calculadora Suma, Resta, Multiplicaci�n y Divisi�n
Algoritmo calculadora3
	definir a,b,c,d Como Entero
	escribir "Que quieres hacer?";
	escribir "1: Sumar";
	escribir "2: Restar";
	escribir "3: Multiplicar";
	escribir "4: Dividir";
	leer a;
	Si a=1 Entonces
		escribir "digita un valor";
		leer b;
		escribir "digita un segundo valor:";
		leer c
		d<-b+c;
		escribir " La Suma de ", b, " + ", c, " = ", d
	Sino
		Si a=2 Entonces
			escribir "digita tu valor";
			leer b;
			escribir "digita tu segundo valor:";
			leer c
			d<-b-c;
			escribir " La Resta de " , b, " - ", c, " = ", d
		Sino
			Si a=3 Entonces
				escribir "digita tu valor";
				leer b;
				escribir "digita tu segundo valor:";
				leer c
				d<-b*c;
				escribir " La Multiplicaci�n de " , b, " * ", c," = " , d
			Sino
				Si a=4 Entonces
					escribir "digita tu valor";
					leer b;
					escribir "digita tu segundo valor:";
					leer c
					d<-b/c;
					escribir " La Divisi�n de " , b, " / ", c, " = ", d
				Sino
				FinSi
			FinSi 
		FinSi
	FinSi
		
FinAlgoritmo