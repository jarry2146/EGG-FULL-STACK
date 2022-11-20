Algoritmo Extra3_G3
	
	definir resp, usuario como entero
	
	escribir "" ; resp <- login(usuario, contrasena)	//llamada a funcion login
	
FinAlgoritmo

//funcion algorito
Funcion resp <- login(usuario, contrasena)
	definir contra, usu Como caracter
	definir resp como logico
	definir contador como entero
	contador=0
	Repetir
		Escribir "Escriba su usuario "
		Leer usuario
		Escribir "Escriba su contraseña "
		Leer contrasena
		
		Si usuario = "qq" y contrasena = "123" Entonces
			resp = Verdadero
			contador = 3
			escribir" su contraseña y usuario es correcta"
		SiNo
			si contrasena= contrasena Entonces
				
			FinSi
			resp = Falso
			contador = contador + 1
		FinSi
		Escribir "Te quedan ", 3 - contador, " Intentos"
		
	Mientras Que contador < 3
	
	
FinFuncion
