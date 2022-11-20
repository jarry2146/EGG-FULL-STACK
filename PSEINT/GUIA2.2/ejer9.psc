Algoritmo ejer9
	definir sueldobase , comision , ventas , sueldototal,cantvendedores ,noventas,totalventas,n,i, m Como Entero
	Definir vendedor Como Caracter
	n=0
	i=0
	totalventas=0

	escribir  " cantidad de vendedores:"
	leer cantvendedores
	
	escribir  " ingrese sueldo base del vendedor:"
	leer sueldobase
	
	escribir " ingrese cuantas ventas realizodo:"
	leer noventas
	
	
	para i = 1 hasta noventas  Hacer
		escribir " ingrese cantidad de ventas del empleado:" 
		leer ventas
		
        totalventas = ventas +totalventas
		
	FinPara
	
	sueldototal = sueldobase +totalventas *0.10
	escribir " el valor a cancelar a vendedor es " sueldototal
	
	
	
FinAlgoritmo
