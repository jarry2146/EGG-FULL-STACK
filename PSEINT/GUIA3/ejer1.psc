//Realizar una función que calcule la suma de dos números. En el algoritmo principal le
//	pediremos al usuario los dos números para pasárselos a la función. Después la función
//		calculará la suma y lo devolverá para imprimirlo en el algoritmo.


Algoritmo ejer1g3
	
	Definir n1,n2, n3,n4 Como Entero
	
	Escribir "Digite el primer número: "; Leer n1
	Escribir "Digite el segundo número: "; Leer n2
	Escribir "Digite el tercer número: "; Leer n3
	Escribir "Digite el cuarto número: "; Leer n4
	
	
	Escribir "La suma de los primeros dos números es ", CalcularSuma(n1,n2)
	
	Escribir "La suma de los últimos dos números es ", CalcularSuma(n3,n4)
	
	
FinAlgoritmo

Funcion Suma <- CalcularSuma (a,b)
	Definir  Suma Como Entero
	
	Suma = a + b
	
FinFuncion
