Algoritmo COCINAR_HUEVO
	definir eleccion Como Caracter
	escribir " escriba una opcion para cocinar el huevo"
	escribir "A- FRITO"  
	escribir "B- HERVIDO"
	escribir "C- REVUELTO"
	escribir "D- CRUDO"
	LEER eleccion
	
	
	Segun eleccion  Hacer
		"A":
			escribir " su huevo se servira frito"
		"B":
			escribir " su huevo se servira hervido"
		"C":
			escribir " su huevo se servira revuelto"
		"D":
			escribir " su huevo se servira crudo"
		De Otro Modo:
			ESCRIBIR " LA OPCION INGRESADA NO ESTA OFRECIDA"
	Fin Segun
	
	
FinAlgoritmo
