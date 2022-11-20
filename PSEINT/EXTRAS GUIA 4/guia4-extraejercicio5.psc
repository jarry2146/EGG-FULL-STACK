Algoritmo sin_titulo
	definir pos Como entero
	definir posicion como entero
	definir pos1 Como entero
	definir let como caracter
	definir arreglo como cadena
	definir vector como caracter
	definir newvector como caracter
	definir i como entero
	definir j como entero
	definir k como entero
	definir resta como entero
	definir min como entero
	dimension vector[20]
	dimension newvector[20]
	dimension pos1[20]
	dimension resta[20]
	escribir "Ingrese la frase con 20 o menos caracteres"
	leer arreglo
	para i<-0 hasta 19 Hacer
		vector[i]=subcadena(arreglo,i,i)
		escribir sin saltar vector[i]
	FinPara
	escribir " "
	escribir "ingrese la letra"
	leer let
	escribir "ingresa la posicion"
	leer pos
	
	si vector[pos]==" "
		para i<-0 hasta 19 Hacer
			newvector[i]=vector[i]
		FinPara
		newvector[pos]=let
		escribir "libre"
		
	SiNo
		j=0;
		k=0;
		min=20
		para i<-0 hasta 19 Hacer
			si vector[i]=" " Entonces
				pos1[j]=i
				j=j+1
			FinSi
		fin para
		para i<-0 hasta j-1 Hacer
				si pos1[i]>pos Entonces
					resta[i]=pos1[i]-pos
				sino 
					resta[i]=pos-pos1[i]
				FinSi
		fin para
		para i<-0 hasta j-1 Hacer
			    si resta[i]<min Entonces
					min=resta[i];
				FinSi
		fin para
		para i<-0 hasta j-1 Hacer
				si min=resta[i] Entonces
					posicion=pos1[i]
				FinSi
		FinPara
		para i<-0 hasta j-1 Hacer
			si min=resta[i] Entonces
				posicion=pos1[i]
		FinSi
		FinPara
		
			si posicion < pos Entonces
				para i <-0 hasta pos
					newvector[i]=vector[i+1]
				FinPara
				
				para i <-pos+1 hasta 19
					newvector[i]=vector[i]
				FinPara
				newvector[pos]=let
			
			sino si posicion > pos entonces
				para i <-0 hasta pos
					newvector[i]=vector[i]
				FinPara
				
				para i <-pos+1 hasta 19
					newvector[i]=vector[i-1]
				FinPara
				newvector[pos]=let
			finsi
			
	    
		
		finsi
		finsi
	
	para i<-0 hasta 19 Hacer
		
		escribir sin saltar newvector[i]
	FinPara
FinAlgoritmo
