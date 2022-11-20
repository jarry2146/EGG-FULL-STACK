Algoritmo numero_menor_lista
	definir i,t,ns,may,men Como Entero
	may =0
	men =0
	i =1
	escribir "ingrese la cantidad de numeros:"
	leer ns
	Mientras (1<= ns) Hacer
		escribir " el numero:" i
		leer t
		si (i==1) Entonces
			may = t
			men = t
		sino 
			si (t>may) Entonces
				may<-t
				
			FinSi
			si (t<men) Entonces
				men = t
				
			FinSi
		FinSi
		i= i+1
	
	escribir " el numero meror ingresado es: " men
	escribir " el numero mayor ingresado es: " may
FinMientras
FinAlgoritmo
