//Realizar un programa con el siguiente menú y le pregunte al usuario que quiere hacer hasta
//que ingrese la opción Salir:
//	A. Llenar Vector A. Este vector es de tamaño N y se debe llenar de manera aleatoria
//	usando la función Aleatorio(valorMin, valorMax) de PseInt.
//	B. Llenar Vector B. Este vector también es de tamaño N y se llena de manera aleatoria.
//	C. Llenar Vector C con la suma de los vectores A y B. La suma se debe realizar elemento
//a elemento. Ejemplo: C = A + B
//	D. Llenar Vector C con la resta de los vectores B y A. La resta se debe realizar elemento a
//elemento. Ejemplo: C = B - A
//E. Mostrar. Esta opción debe permitir al usuario decidir qué vector quiere mostrar: Vector
//	A, B, o C.
//	F. Salir.
//NOTA: El rango de los números aleatorios para los Vectores será de [-100 a 100]. La longitud
//		para todos los vectores debe ser la misma, por lo tanto, esa información sólo se solicitará una
//vez.

Algoritmo sin_titulo
	
	Definir tam Como Entero
	
	Escribir "Digite el tamaño de los vectores: "; Leer tam
	
	Dimension A(tam),B(tam),C(tam)
	Definir A, B, C, i  Como Real
	
	Para i = 0 Hasta tam Con Paso 1 Hacer
		A(i) = 0
		B(i) = 0
		C(i) = 0
	FinPara
	
	Menu(A,B,C)
FinAlgoritmo
	
SubProceso Menu (A,B,C)
	Definir rta, ele Como Entero
	Hacer 
		Escribir "1) Llenar Vector A. Este vector es de tamaño N y se debe llenar de manera aleatoria"
		Escribir "2) Llenar Vector B. Este vector también es de tamaño N y se llena de manera aleatoria."
		Escribir "3) Llenar Vector C con la suma de los vectores A y B."
		Escribir "4) Llenar Vector C con la resta de los vectores B y A"
		Escribir "5) Mostrar Vectores"
		Escribir "6) Salir"
		
		Leer rta
		
		Segun rta Hacer
			1:
				Para i = 0 Hasta tam Con Paso 1 Hacer
					A(i) = Aleatorio(-100, 100)
				FinPara
			2:
				Para i = 0 Hasta tam Con Paso 1 Hacer
					B(i) = Aleatorio(-100, 100)
				FinPara
			3:
				Para i = 0 Hasta tam Con Paso 1 Hacer
					C(i) = A(i) + B(i)
				FinPara
			4:
				Para i = 0 Hasta tam Con Paso 1 Hacer
					C(i) = A(i) - B(i)
				FinPara
			5:
				Hacer
					Escribir Sin Saltar "Digite el vector que quiere mostrar (A = 1; B = 2; C = 3)"; Leer ele
				Mientras Que (ele <> 1 O ele <> 2 O ele <> 3) 
				
				Si ele == 1 Entonces
					Escribir "Mostrando el Vector A"
					Escribir "______________________"
					Escribir ""
					Para i = 0 Hasta tam Con Paso 1 Hacer
						Escribir Sin Saltar A(i),", "
					FinPara
				FinSi
				Si ele == 2 Entonces
					Escribir "Mostrando el Vector A"
					Escribir "______________________"
					Escribir ""
					Para i = 0 Hasta tam Con Paso 1 Hacer
						Escribir Sin Saltar B(i),", "
					FinPara
				FinSi
				Si ele == 3 Entonces
					Escribir "Mostrando el Vector A"
					Escribir "______________________"
					Escribir ""
					Para i = 0 Hasta tam Con Paso 1 Hacer
						Escribir Sin Saltar C(i),", "
					FinPara
				FinSi
		FinSegun
		
		
	Mientras Que r <> 6
FinSubProceso
