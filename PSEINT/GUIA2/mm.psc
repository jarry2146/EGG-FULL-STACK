Algoritmo sin_titulo
	
	definir num1,dias,horas,minutos ,segund,opc como reales
	
	escribir " ingrese un numero "
	leer num1

	//opciones
	escribir "ingrese una opcion"
	escribir " 1 dias"
	escribir " 2 horas"
	escribir " 3 minutos"
	escribir " 4 segundos" 
	leer opc
	
	dias =  minutos * 60
	segund = minutos /1440
	horas = minutos / 60
	
	Segun opc Hacer
		1:
			
			escribir "en dias " dias
			dias =  minutos * 60
		2:
		
			escribir " en horas " horas
			segund = minutos /1440
		3:
			
			escribir " en minutos es " minutos
			horas = minutos / 60
		4:
			
			escribir " en segundos es " segund
			
		De Otro Modo:
			escribir "el numero digitado es erroneo"
		Fin segun
	
FinAlgoritmo