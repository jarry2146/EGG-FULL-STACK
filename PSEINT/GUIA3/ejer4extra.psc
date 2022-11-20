
Funcion retorno <- cal ( horastra Por Referencia )
	definir  retorno ,pago,  diafestivo Como Entero
	definir nombre ,diasemana,tipo ,dia	Como Caracter
	
    leer pago
	escribir " ingrese el nombre del trabajador"
	leer nombre
	
	escribir " ingrese el dia de la semana"
	leer dia
	
	escribir " ingrese  el turno diurno o noturno "
	leer tipo
	
	escribir " ingrese las horas trabajadas"
	leer horastra
	
	escribir " ingrese si es dia festivo"
	leer diafestivo
	Escribir ""
	si tipo = "diurno" entonces
	     	escribir  pago = horastra*90; 
	     FinSi
	    si tipo = "noturno" Entonces
	    	escribir pago = horastra*125;
	    FinSi
	    Si (dia = "7") y (tipo = "diurno") Entonces
	    	pago = horas * 10
	    Finsi      
	
		Si (dia = "7") y (tipo = "diurno") Entonces
	    	pago = horas * 15
	   Finsi    
	   escribir nombre," su jornada diaria es:",pago
     Fin Funcion

    Algoritmo ejer4extras
	Definir horastra Como Entero
	definir nombre ,retorno Como Caracter
	
	retorno <- cal ( horastra )	
	
FinAlgoritmo
