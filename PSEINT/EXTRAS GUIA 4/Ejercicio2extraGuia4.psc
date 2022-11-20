Algoritmo EJ2
//	Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el
//	usuario y muestre por pantalla el promedio de la suma de todos los valores ingresados.
	
	Definir vector, i, n, num, suma, prom  Como real
	
	escribir "Ingrese tamaño del vector"
	leer n
	Dimension vector[n]
	suma=0
	Para i<-0 Hasta n-1 Con Paso 1 Hacer
		
		Escribir "Ingrese un numero para el subindice " i
		Leer num 
		vector[i]=num
		
		suma=suma+num
	
	Fin Para
	
	escribir "promedio de numeros ingresados: " , suma/n
	
FinAlgoritmo
