Algoritmo ejer8_g_2_2
	definir rep,  i ,x ,n   Como Entero
	definir calif,prom1,prom2,prom3 Como Real
	Definir  a,b,c Como Real
	Escribir " cantidad estudiantes:"
	leer n
	rep = 1
	calif = 0
	x = 1
	prom1 = 0
	prom2 = 0
	prom3 = 0
	
	Mientras x <= n Hacer
		Escribir "ingrese primera calicacion :"
		leer a,b,c
		
		     prom1 = (a+b+c) * .35
		     prom2 = (a+b+c) * .25
		     prom3 = (a+b+c) * .40
			 para rep = 0 Hasta 1 Con Paso 1 hacer
				 rep = rep +1
			 
			 FinPara
				 escribir "  los estudiantes que reprobaron  el curso fueron :" rep
			
		Escribir "la nota de alumnos que tienen integrador mayor a 7.5 fue :" prom1
		Escribir " la mayor nota optenina en le esposicion fue:"  prom2
		Escribir "estdiantes con mayor nota del parcial  4.0 y 7.5 fueron:" calif+prom3
	    x = x + 1
		  
	FinMientras
	
FinAlgoritmo
