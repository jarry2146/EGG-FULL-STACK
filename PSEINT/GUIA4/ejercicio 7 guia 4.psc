//Crear un subproceso que rellene dos arreglos de tamaño n, con números aleatorios. Después,
//hacer una función que reciba los dos arreglos y diga si todos sus valores son iguales o no. La
//función debe devolver el resultado de está validación, para mostrar el mensaje en el algoritmo.
// Nota: recordar el uso de las variables de tipo lógico



Algoritmo sin_titulo
	Definir tamVector, vector1, vector2, valorInicial Como Real

	Escribir "Ingrese el tamaño de los arreglos"
	Leer tamVector
	
	Dimension vector1[tamVector]
	Dimension vector2[tamVector]

	valorInicial = 0
	
	aleatoriedad(vector1, vector2, valorInicial, tamVector)
	
	Escribir comparar(vector1, vector2,  valorInicial, tamVector)
FinAlgoritmo



SubProceso aleatoriedad(vec1, vec2, vInicial, tVec)
	
	para vInicial= 0 Hasta tVec-1 con paso 1 Hacer
		vec1[vInicial] = Aleatorio(1, 2)
		vec2[vInicial] = Aleatorio(1, 2)
	FinPara
FinSubProceso


Funcion comparador <- comparar(v1, v2,  valinicial Por Referencia, tvector)
	Definir comparador Como Logico

	Hacer
		comparador = v1[valinicial]==v2[valinicial]
		valinicial = valinicial + 1
	Mientras Que comparador y valinicial < tvector
	
	FinFuncion
	