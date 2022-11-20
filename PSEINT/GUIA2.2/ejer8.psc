Algoritmo ejer8
	definir aprobados ,reprobados , estud , i Como Entero
	definir calif,acum,dato,prom , j Como Real
	
	estud = 0
	
	para j = 0 hasta  0 con  paso 1 hacer
	escribir " cantidad estudiantes:" 
	leer estud
finpara

	
	acum<-1
	aprobados = 0
	reprobados = 0
	
	mientras estud > 0 hacer 
		escribir " ingrese primera calicacion 1:"
		leer calif
		
		escribir " ingrese segunda calicacion 2:"
		leer calif
		
		escribir " ingrese tersera calicacion 3:"
		leer calif
		
		
		si calif < 6.5 entonces 
			
			reprobados = reprobados + 1
		finsi
		estud = estud - 1
		
	FinMientras
	
	escribir "  los estudiantes que reprobaron el curso fueron :" reprobados
	
	
	Para calif<-0 Hasta estud con paso 1 Hacer
		Escribir " ingrese estudiante con intergradr mayor 7.5 :" 
		Leer dato
		acum<-acum+dato
	FinPara
	
	prom<-acum/calif
	
	Escribir "la nota de alumnos que tienen integrador mayor a 7.5 fue : " prom
	

	Para calif<-0  Hasta estud con paso 1 Hacer
		Escribir " ingrese el estudiante  para la nota de exposicion :" 
		Leer dato
		acum<-acum+dato
	FinPara
    	prom<-acum/calif
	
	
	Escribir " la mayor nota optenina en le esposicion fue: ",prom
	
	
		Para calif<-0 Hasta estud con paso 1 Hacer
			Escribir " ingrese estudinte con mayor nota del parcial :" 
			Leer dato
			acum<-acum+dato
		FinPara
		
		prom<-acum/calif
		Escribir "calificacion de los estdiantes con mayor nota del parcial  4.0 y 7.5 fueron: ",prom
		

FinAlgoritmo
