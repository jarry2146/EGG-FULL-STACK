//En una tienda dónde se venden teclados, si se compran más de 8 el costo por cada una es de 10000 pesos;
//entre 4 y 8 es de 11000 pesos cada una, si la compra es menor de 4 el costo es de 15000 pesos cada una.
//		
//	Escriba el algoritmo para saber cuánto pagará un cliente según el número de teclados que compra. 
//Mostrar el número de teclados a comprar y el total a pagar.

Algoritmo tindateclados
	definir Cantidad,costo Como Entero
    Escribir "Ingrese la Cantidad a Comprar  "
    Leer Cantidad
    Segun Cantidad Hacer
        1, 2, 3: Costo = 15000
        4, 5, 6, 7, 8: Costo = 11000
        De Otro Modo: Costo = 10000
    Fin Segun
    Escribir "Costo por cada Teclado : ", Costo
    Escribir "Total a Pagar : ", Costo * Cantidad
FinAlgoritmo
