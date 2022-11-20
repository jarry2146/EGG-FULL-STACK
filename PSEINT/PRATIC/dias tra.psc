Algoritmo sin_titulo
	definir nombre,tipo,dia Como Caracter
	definir horas ,pago Como Entero
	
	           Escribir " Ingrese su nombre:"
	        Leer nombre
	             Escribir " Tipo de turno (diurno o nocturno):"
	             Leer tipo
	             Escribir " Dia de la semana (Siendo lunes el dia 1):"
				Leer dia
	            Escribir " Horas trabajadas"
	             Leer horas
	           Escribir ""
	           Si tipo = "diurno" Entonces
		                           pago = horas * 90
		          FinSi
		           Si tipo = "nocturno" Entonces
			                           pago = horas * 125
			           Finsi
			           Si (dia = "7") y (tipo = "diurno") Entonces
				                           pago = horas * 10
				           Finsi      
				           Si (dia = "7") y (tipo = "nocturno") Entonces
					                           pago = horas * 15
					           Finsi      
					           Escribir nombre, ", su pago es de:  Q.", pago;
					FinAlgoritmo