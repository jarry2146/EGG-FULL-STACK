//Disponemos de un vector unidimensional de 20 elementos de tipo carácter. Se pide
//desarrollar un programa que:
//	a) Pida una frase al usuario y luego ingrese la frase dentro del arreglo letra por letra.
//Ayuda: utilizar la función Subcadena de PSeInt.
//	b) Una vez completado lo anterior, pedirle al usuario un carácter cualquiera y una
//	posición dentro del arreglo, y el programa debe intentar ingresar el carácter en la
//	posición indicada, si es que hay lugar (es decir la posición está vacía o es un espacio
//	en blanco). De ser posible debe mostrar el vector con la frase y el carácter ingresado,
//	de lo contrario debe darle un mensaje al usuario de que esa posición estaba ocupada.
//Por ejemplo, suponiendo la siguiente frase y los subíndices del vector:

Algoritmo sin_titulo
	
	Dimension V(20)
	Definir V, Frase Como Caracter
	Definir i Como Entero
	
	i = 0
	
	Inicializar(V,i)
	Datos(Frase)
	Pasar(V,Frase,i)
	B(V,Frase,i)
	Ver(V,Frase, i)
	
	Escribir ""
	Escribir ""
	
	
	
FinAlgoritmo

SubProceso Datos (f Por Referencia)
	
	Escribir Sin Saltar"Digite una Frase/Palabra a guardar: "; Leer f
	
	Mientras (Longitud(f) > 20)
		Escribir "Por favor que la frase no supere los 20 caracteres: "; Leer f
	FinMientras
	
FinSubProceso

SubProceso  Inicializar (V Por Referencia, i)
	Para i = 0 Hasta 19 Con Paso 1 Hacer
		V(i) = " "
	FinPara
FinSubProceso



SubProceso Pasar (V, f,i)
	
	Para i = 0 Hasta Longitud(f)-1 Con Paso 1 Hacer
		V(i) = Subcadena(f,i,i)
	FinPara
FinSubProceso

SubProceso B (V,f,i)
	Definir z Como Caracter
	Definir x Como Entero
	
	Escribir "Digite el caracter que desea ingresar: "; Leer z
	Escribir "Digite la posición donde desea ingresarlo: "; Leer x
	
	Mientras (x >= 20) Hacer
		Escribir "Por favor, que la posición sea menor a 20: "; Leer x
	FinMientras
	
	Si V(x) == " " Entonces
		V(x) = z
		
	SiNo
		Escribir "Lo sentimos, esa posición ya está ocupada"
	FinSi
	
	
	
FinSubProceso



SubProceso Ver (V,f,i)
	Para i = 0 Hasta 19 Con Paso 1 Hacer
		Escribir Sin Saltar V(i)," "
	FinPara
FinSubProceso

