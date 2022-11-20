Algoritmo calculofina
	//definir variables
	definir pre,desc,total, opc Como Entero
	//pedir datos de entrada
	
	      escribir " ingrese el valor a invertir"
	      leer pre
	      
			total =0
			desc=0
	//proseso
	si (pre >1) entonces
		desc =pre* 0.1
		escribir" el descuento fue del 1 % :"

FinSi
	     total=desc-pre
	     escribir " el valor descontado fue:" desc
	     escribir "la invercion seria de :" total 
	
FinAlgoritmo
