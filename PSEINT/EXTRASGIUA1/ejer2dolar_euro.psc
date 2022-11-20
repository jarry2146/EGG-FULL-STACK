Algoritmo ejer2dolar_euro
	//	Calcular el cambio de monedas en dólares y euros al ingresar cierta cantidad de dinero en pesos.
	
	definir dolar ,peso,euro ,peso_dolar,peso_euros Como real
	
	Escribir " ingrese cantidad a convertir en pesos "
	leer peso
	Escribir " ingrese precio en dolar "
	leer dolar
	Escribir " ingrese precioen euros "
	leer euro
	peso_dolar=peso/dolar
	peso_euros=peso/euro
	Escribir peso " peso  al cambio en dolar es " peso_dolar,": dolares"
	Escribir peso " peso al  cambio en euro es " peso_euros, ": euros"
FinAlgoritmo
