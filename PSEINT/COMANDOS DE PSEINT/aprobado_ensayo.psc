Algoritmo aprobado_ensayo
	
	definir  n , reprobados ,aprobados Como entero
	definir calif como real 
	
	escribir " ingresar cantidad de aumnos :"
	leer n
	
	reprobados = 0
	aprobados = 0
	
	
	Mientras n > 0 Hacer
		escribir " ingrese la calificacion:" 
		leer calif
		
		si calif < 6 entonces 
			aprobados = aprobados + 1
		sino
			reprobados = reprobados + 1
			FinSi
			n = n  -1
		fin mientras
		escribir " el total de alumnos aprobados: " aprobados
		escribir " el total de alumnos reprobados." reprobados
		
		
		
		
		
FinAlgoritmo
