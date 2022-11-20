Algoritmo tabla_mult
	// declarar variable
	definir t,num,i,res Como Entero
	
	//datos de entrada
	escribir "ingrese la tabla mostrar"
	leer t
	escribir " ingrese asta que numero desea ver la tabla"
	leer num
	
	// proseso
	para i=2 hasta num con paso 1 Hacer
		res =t * i
		escribir t," x ", i," = " , res
		
	FinPara
FinAlgoritmo
