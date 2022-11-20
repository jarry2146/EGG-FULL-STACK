Algoritmo decenas
	  
	definir unid ,dece, cent, mun,num Como Real
	escribir "ingrersar un numero de  tres digitos"
	leer num
	
	
	 si num > 99 && num < 1000 Entonces
		unid <- num mod 10
		num  <- trunc(num/10)
		dece <- num mod 10
		num  <- trunc (num/10)
		cent <- num mod 10
		
		escribir "  unidades :" unid
		escribir "  desenas :" dece
		escribir "  centenas :" cent

		
		
	FinSi

	
	
	
		
		
FinAlgoritmo


		
	
