Algoritmo Ejcio6Guia4
	Definir vector, frase, letra Como Caracter
	Definir i, x como entero
	Dimension vector(20)
	
	Escribir "Por favor, ingrese una frase de hasta 20 caracteres."
	Leer frase
	Para i=0 Hasta 19
		
		vector(i) = SubCadena(frase,i,i) 
		
	FinPara
	
	Escribir "Ingrese un caracter y la posición dentro del vector donde quisiera ubicarlo"
	Leer letra, x
	
	Mientras x < 0 O x >= 20 Hacer
		
		Escribir "La posición donde desea ingresar el caracter debe ser un número entre 0 y 19"
	Fin Mientras
	
	Si vector(x) = " " Entonces
		vector(x) = letra
		Para i=0 Hasta 19 Hacer
			Escribir Sin Saltar vector(i)
		FinPara
	SiNo
		Escribir "La posición seleccionada del vector ya se encuentra ocupada."
	FinSi
FinAlgoritmo
