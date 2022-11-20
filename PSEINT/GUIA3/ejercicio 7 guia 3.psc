Algoritmo sin_titulo
	definir tmax,tmin, ndias, ret, cont Como Real
	definir dia Como Caracter
	escribir "ingrese la cantidad de dias" 
	leer ndias
	cont = 0
	Mientras cont < ndias Hacer
		escribir "ingrese el dia"
		leer dia
		escribir "ingrese la temperatura maxima"
		leer tmax
		escribir "ingrse la temperatura minima" 
		leer tmin
		cont = cont + 1
		
		ret = temp_media(tmax,tmin)
		escribir "El dia ",dia, ", la media de temperatura va a ser de: " , ret, "°c"
	FinMientras
	
FinAlgoritmo


SubProceso media <- temp_media(tempmax por referencia, tempmin por referencia)
	definir suma, media Como Real
	suma = tempmax + tempmin
	media = suma / 2
	
FinSubProceso
