Algoritmo ejer_inter
	
	definir cant ,compra, prec,desc Como real
	escribir " engresa el precio :"
	leer prec
	escribir " ingrese la cantidad de manzanas por kilo:"
	leer cant
	
	compra <- prec *cant
	escribir " el total a pagar es: $" compra
	desc <- compra * 0.17
	escribir " el decuento es: $ " desc
	compra <- compra - desc
	escribir " el total a pagar con el descuento es : $" compra
	
FinAlgoritmo
