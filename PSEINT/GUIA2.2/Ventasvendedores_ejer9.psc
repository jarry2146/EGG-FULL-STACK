Algoritmo Ventasvendedores_ejer9
	Definir sueldobase, ventas, sueldototal, Noventas, cantvendedores, i, n, totalventas Como Real
	Definir vendedor Como Caracter
	
	i=0
	n=0
	totalventas=0
	Escribir "Cantidad de vendedores"
	Leer cantvendedores
	
	Para n <- 1 Hasta cantvendedores Hacer
		
		Escribir "Ingrese Sueldo base de vendedor"
		leer sueldobase
		Escribir "ingrese cuantas ventas realizo"
		leer Noventas
		
	    Para i <- 1 Hasta Noventas Hacer
			Escribir "Ingrese valor de venta"
			leer ventas
			
			totalventas = ventas+totalventas
			
		FinPara
		
		sueldototal = sueldobase + totalventas*0.10
		Escribir "El valor a cancelar a vendedor es  " sueldototal
		
    FinPara
	
	
	
FinAlgoritmo
