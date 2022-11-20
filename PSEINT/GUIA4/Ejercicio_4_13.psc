//Una matriz mágica es una matriz cuadrada (tiene igual número de filas que de columnas) que
//tiene como propiedad especial que la suma de las filas, las columnas y las diagonales es igual.
//Por ejemplo:
//	2 7 6
//	9 5 1
//	4 3 8
//	En la matriz de ejemplo las sumas son siempre 15. Considere el problema de construir un
//	algoritmo que compruebe si una matriz de datos enteros es mágica o no, y en caso de que
//	sea mágica escribir la suma. Además, el programa deberá comprobar que los números
//	introducidos son correctos, es decir, están entre el 1 y el 9. El usuario ingresa el tamaño de la
//matriz que no debe superar orden igual a 10

Algoritmo Ejercicio13
	
	Definir matriz, n, i, j, k Como Entero
	definir magia Como Logico
	definir vector Como Entero
	magia=Verdadero
	
	Hacer 
		Escribir "Ingrese el orden de la matriz cuadrada (máximo orden 10)"
		Leer n	
	Mientras Que n<1 o n>10
	
	Dimension matriz[n,n]
	dimension vector[2*n+2]
	
	Llenar_matriz(n, matriz)
	
	Escribir_matriz(n, matriz)
	
	//Inicializar vector de sumas en 0
	
	Para i = 0 hasta (2*n+2)-1 con Paso 1 Hacer
		vector(i) = 0
	FinPara
	k=0
	//Calcular sumatoria de filas y columnas
	Para i<-0 hasta n-1 con Paso 1 Hacer
		
		Para j<-0 hasta n-1 con Paso 1 Hacer
			vector(k) = vector(k)+matriz(i,j)
			vector(k+n) = vector(k+n) + matriz(j,i)
		FinPara
		k = k+1
	FinPara
	
	//Calcular sumas de las diagonales
	Para i = 0 hasta n-1 con Paso 1 Hacer
		vector(2*n) = vector(2*n) + matriz(i,i)
		vector(2*n+1) = vector(2*n+1) + matriz(i,(n-1)-i)
	FinPara
	
	// Escribir vector
	Para i = 0 hasta 2*n+1 con Paso 1 Hacer
		Escribir Sin Saltar vector[i], " "
	FinPara
		Escribir ""

	//Comprobar si el cuadrado es mágico
	i = 0
	Mientras magia==Verdadero Y i<=2*n Hacer
		Si vector[i]<>vector[i+1] Entonces
			magia=Falso
		FinSi
		i=i+1
	FinMientras
	
	Si magia==Verdadero Entonces
		Escribir "La matriz es una matriz mágica con suma ", vector[0]
	SiNo
		Escribir "La matriz no es mágica"
	FinSi
	
FinAlgoritmo

Subproceso Llenar_matriz(n, matriz Por Referencia)
Definir i, j Como Entero	
//Llenar la matriz
Escribir "Ingrese los elementos de la matriz (solamente valores enteros entre 1 y 9)"
Para i<- 0 hasta n-1 con Paso 1 Hacer
	Para j<- 0 hasta n-1 con Paso 1 Hacer
		Hacer 			 
			leer matriz[i,j]
			Si matriz[i,j]<1 o matriz[i,j]>9
				Escribir "El número no es válido, vuelva a intentarlo"
			FinSi
		Mientras Que matriz[i,j]<1 o matriz[i,j]>9
	FinPara
FinPara
FinSubProceso

Subproceso Escribir_matriz(n, Matriz Por Referencia)
Definir i, j Como Entero	

	//Escribir Matriz
	Para i<- 0 hasta n-1 con Paso 1 Hacer
		Para j<- 0 hasta n-1 con Paso 1 Hacer
			Escribir Sin Saltar matriz[i,j], " "
		FinPara
		Escribir ""
	FinPara
	
FinSubProceso
	