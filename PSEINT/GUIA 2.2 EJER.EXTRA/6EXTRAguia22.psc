//Realizar un programa que solicite al usuario su c�digo de usuario (un n�mero entero
//mayor que cero) y su contrase�a num�rica (otro n�mero entero positivo). El programa no
//le debe permitir continuar hasta que introduzca como c�digo 1024 y como contrase�a
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
	
	escribir "Ingrese contrase�a del usuario"
	leer contra
	Hacer
		escribir "Contrase�a incorrecta, ingrese nuevamente"
		leer contra
	Mientras Que contra <>4567
	
	escribir " CODIGO Y CONTRASE�A CORRECTA"
FinAlgoritmo
