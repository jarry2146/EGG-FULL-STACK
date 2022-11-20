//Crear un procedimiento que calcule la temperatura media de un día a partir de la temperatura
//máxima y mínima. Crear un programa principal, que, utilizando un procedimiento, vaya
//pidiendo la temperatura máxima y mínima de n días y vaya mostrando la media de cada día. El
//programa pedirá el número de días que se van a introducir.

Subproceso mediaTemp (dias, max, min Por Referencia)
	Definir i, media como Real
	Para i= 1 Hasta dias Con Paso 1 Hacer
		Escribir "ingrese temperatura max del dia " i
		Leer max
		Escribir "ingrese temperatura minima del dia " i
		Leer min
		media= (max + min) / 2
		Escribir "la temperatura media del dia " i " es de " , media
		media= 0
		Fin Para
FinSubProceso

Algoritmo sin_titulo
	Definir dias, max, min Como Entero
	max= 0 
	min= 0
	Escribir "ingrese cantidad de dias a calcular"
	Leer dias
	mediaTemp(dias, max, min)

FinAlgoritmo

