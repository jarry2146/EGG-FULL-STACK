//Realizar un programa que pida al usuario una frase y una letra a buscar en esa frase. La
//funci�n debe devolver la cantidad de veces que encontr� la letra. Nota: recordar el uso de la
	//funci�n Subcadena().
Algoritmo ejer4
	definir frase ,letra Como Caracter
	
	escribir " ingresar frase"
	leer frase
	
	escribir " ingresar letra"
	leer letra
	escribir " cantidad de beses de la letra:",llamar(frase,letra)
	
	
FinAlgoritmo

Funcion cont <- llamar(fra,let ) 
	definir cont,i Como Real
	cont = 0
	
	para i=0 Hasta longitud(fra) -1 con paso 1 hacer 
	
		si SubCadena(fra,i,i) == let 
			cont = cont +1
		FinSi
		FinPara
FinFuncion
	