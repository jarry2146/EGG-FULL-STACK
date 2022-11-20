Algoritmo ejer9
	definir frase,caract,cod Como caracter
	escribir " ingrese una frase:"
	leer frase
	reemplazos(frase,cod)
	escribir "" cod  
	 	
FinAlgoritmo
subproceso reemplazos(frase por valor, cod por referencia )
	definir i Como Entero
	definir caract Como Caracter
	cod=""
		para i=0 Hasta longitud(frase) -1 con paso 1 hacer 
			
			caract = SubCadena(frase,i,i)  
				segun caract hacer
					
					"a":
						caract = "@"
					"e":
						caract = "#"
					"i":
						caract = "$"
					"o":
						caract = "%"
					"u":
						caract = "*"	
				FinSegun
				cod= Concatenar(cod,caract)
		FinPara
		
FinSubProceso
	