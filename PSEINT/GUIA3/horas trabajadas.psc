
Funcion retorno <- cal ( horastra,diasemana )
	definir  retorno Como Entero
	retorno = horastra
	diasemana=0
	horastra=0
	
	mientras  horastra =diasemana hacer
		
		escribir "horas diurna ", horastra <- diasemana*90; 
		
		escribir "horas  noturno",horastra <- diasemana*125;
		
		escribir "festivo diurnas", horastra <- diasemana*0.10;
		
		escribir "festivo noturnas ",horastra <- diasemana*0.15;
	Fin Mientras	
	
	escribir " lajornada diaria es:",horastra; 
	
	
Fin Funcion

Algoritmo ejer4extras
	
	
	
	definir horastra,retorno Como entero
	definir turnod,turnon,diafestivo  Como Caracter
	definir diasemana ,nombretrab Como Caracter
	
	horastra=0
	diasemana=0
	escribir""; retorno <- cal (horastra,diasemana)
	escribir " ingrese el nombre del trabajador"
	leer nombretrab
	
	escribir " ingrese el dia de la semana"
	leer diasemana
	
	escribir " ingrese  el turno diurno o noturno "
	leer turnod
	
	escribir " ingrese las horas trabajadas"
	leer horastra
	
	escribir " ingrese si es dia festivo"
	leer diafestivo
	
	
FinAlgoritmo
