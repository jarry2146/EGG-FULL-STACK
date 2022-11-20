//Realizar un programa que solicite al usuario su código de usuario (un número entero
//mayor que cero) y su contraseña numérica (otro número entero positivo). El programa no
//le debe permitir continuar hasta que introduzca como código 1024 y como contraseña
//4567. El programa finaliza cuando ingresa los datos correctos.

Algoritmo Ejer6EXTRAguia2
	Definir Cod, contra Como Entero
	cod=1024
	contra = 4567
	escribir "Ingrese codigo de usuario"
	leer cod
	
	hacer 
		escribir "Codigo incorrecto, ingreselo nuevamente" 
		leer cod
	Mientras Que cod <>	1024
	
	escribir "Ingrese contraseña del usuario"
	leer contra
	Hacer
		escribir "Contraseña incorrecta, ingrese nuevamente"
		leer contra
	Mientras Que contra <>4567
	
	escribir " CODIGO Y CONTRASEÑA CORRECTA"
FinAlgoritmo
