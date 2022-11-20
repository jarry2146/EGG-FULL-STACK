Algoritmo ejer4

	Definir n, vectorA,vectorB, vectorC Como Entero
Escribir "Ingrese el tamaño de los vectores:"
Leer n
Dimension vectorA(n)
Dimension vectorB(n)
Dimension vectorC(n)

MenuPrincipal(vectorA, vectorB, vectorC, n)
FinAlgoritmo
SubProceso MenuPrincipal(vectorA, vectorB, vectorC, n)
	Definir opcionn Como Caracter
	definir i Como Entero
	i=0
	
	Hacer
		
		Escribir " "
		Escribir "Menú Pricipal:"
		Escribir "A)- Llenar vector A"
		Escribir "B)- Llenar vector B"
		Escribir "C)- Llenar vector C con la suma de los vector A y B"
		Escribir "D)- Llenar vector C con la resta de los vector B y A"
		Escribir "E)- Mostrar vector (A, B ó C)"
		Escribir "F)- Salir"
		Escribir " "
		
		Escribir "Elija una opción"
		Leer opcionn
		
		Segun Mayusculas(opcionn) Hacer
			"A":
				Escribir sin saltar "Vector A: "
				llenarVector(vectorA,n)
				Escribir " "
			"B":
				Escribir Sin Saltar "Vector B: "
				llenarVector(vectorB,n)
				Escribir " "
			"C":
				Escribir Sin Saltar "Suma de los Vectores A y B: "
				calculosVectores(vectorA, vectorB, vectorC, n, "suma")
				Escribir " "
			"D":
				Escribir Sin Saltar "Resta de los Vectores B y A: "
				calculosVectores(vectorA, vectorB, vectorC, n, "resta")
				Escribir " "
			"E":
				mostrarVector(vectorA,vectorB,vectorC,  n  )
				Escribir " "
			"F":
				Escribir "Gracias por utilizar nuestro programa"
			De Otro Modo:
				Escribir Sin Saltar "Error! Elija una opción válida"
				Escribir " "
		Fin Segun
		
	Mientras Que opcionn <> "F"
FinSubProceso	
SubProceso llenarVector(vector, n)
	Definir i Como Entero
	Para i = 0 Hasta n-1 Hacer
		vector(i) = Aleatorio(-100,100)
		Escribir Sin Saltar "[" vector(i) "]"
	FinPara
Fin Subproceso
SubProceso calculosVectores(vectorA, vectorB, vectorC, n, operacion)
	Definir i Como Entero
	Para i = 0 Hasta n-1 Hacer
		Si operacion ="suma" Entonces
			vectorC(i) = vectorA(i) + vectorB(i)
		SiNo
			vectorC(i) = vectorB(i) - vectorA(i)
		FinSi
		Escribir Sin Saltar "[" vectorC(i) "]"
	FinPara
FinSubProceso
SubProceso mostrarVector(vectorA,vectorB,vectorC,n)
	Definir opcionn Como Caracter
	definir i Como Entero
	Escribir "Indique el vector que desea ver:"
	Leer opcionn
	Segun Mayusculas(opcionn) Hacer
		"A":
			Para i= 0 Hasta n-1 Con Paso 1 Hacer
				Escribir Sin Saltar vectorA(i)
			FinPara
			
		"B":
			Para i = 0 Hasta n-1 Con Paso 1 Hacer
				Escribir Sin Saltar vectorB(i)
			FinPara
			
		"C":
			Para i= 0 Hasta n-1 Con Paso 1 Hacer
				Escribir Sin Saltar vectorC(i)
			FinPara
			
	FinSegun
FinSubProceso