////Crear un subproceso que rellene dos arreglos de tamaño n, con números aleatorios. Después,
////	hacer una función que reciba los dos arreglos y diga si todos sus valores son iguales o no. La
////			función debe devolver el resultado de está validación, para mostrar el mensaje en el algoritmo.
////				Nota: recordar el uso de las variables de tipo lógico.
Algoritmo guia4EjerAp7
	definir vector1,vector2,n Como Entero
	escribir " Por favor ingresar el tamaño del vector:"
	leer n
	Dimension vector1[n],vector2[n]
	llenarvector(vector1,n)
	llenarvector(vector2,n)
	mostrarvector(vector1,n)
	escribir"##############################################"
	mostrarvector(vector2,n)
	
	escribir validarvalores(vector1,vector2,n)
	
FinAlgoritmo

SubProceso llenarvector(vector por referencia,n)
definir i Como Entero
para i=0 hasta n-1 
	vector[i]=Aleatorio(0,10)
FinPara
FinSubProceso

funcion retorno <- validarvalores(vector1,vector2,n)
	definir i,cont como entero
	definir retorno Como Logico
	cont=0
	
	para i=0 hasta n-1 Hacer
		si vector1[i]=vector2[i]
			cont=cont+1
		FinSi
	FinPara
	si cont=n
		retorno=Verdadero
	SiNo
		retorno=Falso
	FinSi
FinFuncion

subproceso mostrarvector(vector,n)
	definir i Como Entero
	para i=0 hasta n-1 Hacer
		escribir sin saltar vector[i], " "
	FinPara
	escribir ""
	para i=0 hasta n-1 Hacer
		escribir sin saltar i," "
	FinPara
	escribir ""
	
FinSubProceso

	