//Realizar una funci�n que calcule la suma de dos n�meros. En el algoritmo principal le
//	pediremos al usuario los dos n�meros para pas�rselos a la funci�n. Despu�s la funci�n
//		calcular� la suma y lo devolver� para imprimirlo en el algoritmo.


Algoritmo ejer1g3
	
	Definir n1,n2, n3,n4 Como Entero
	
	Escribir "Digite el primer n�mero: "; Leer n1
	Escribir "Digite el segundo n�mero: "; Leer n2
	Escribir "Digite el tercer n�mero: "; Leer n3
	Escribir "Digite el cuarto n�mero: "; Leer n4
	
	
	Escribir "La suma de los primeros dos n�meros es ", CalcularSuma(n1,n2)
	
	Escribir "La suma de los �ltimos dos n�meros es ", CalcularSuma(n3,n4)
	
	
FinAlgoritmo

Funcion Suma <- CalcularSuma (a,b)
	Definir  Suma Como Entero
	
	Suma = a + b
	
FinFuncion
