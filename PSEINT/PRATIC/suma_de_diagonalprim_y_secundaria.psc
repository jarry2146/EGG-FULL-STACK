Algoritmo suma_de_diagonalprim_y_secundaria
	definir f,c,suma,suma2,matriz ,n como entero
	
	dimension matriz[5,5]
	//llenar matriz
	para f=1 hasta 5-1 Con Paso 1 Hacer
		para c=1 hasta 5-1 Con Paso 1 Hacer
			matriz[f,c]=azar(9)+1
		FinPara
	FinPara
	//imprimir matriz
	para f=1 hasta 5-1 Con Paso 1 Hacer
		para c=1 hasta 5-1 Con Paso 1 Hacer
			escribir Sin Saltar matriz[f,c]," "
		FinPara
		escribir""
	FinPara
	suma=0
	// suma de diagonal primaria
	para f=1 hasta 5-1 Con Paso 1 Hacer
		para c=1 hasta 5-1 Con Paso 1 Hacer
			si f==c Entonces
			suma=suma + matriz(f,c)	
			FinSi
		FinPara	
	   FinPara
	   escribir "la suma de la diagonal primaria  es: " suma
	  n=6
	  suma2=0
	   // suma de diagonal secundaria
	   para f=1 hasta 5-1 Con Paso 1 Hacer
		   para c=1 hasta 5-1 Con Paso 1 Hacer 
			   si f+c==n-1 Entonces
				   
				   suma2=suma2+ matriz(f,c) 
				  finsi 
			   FinPara   
		   FinPara	
	   escribir "la suma de la diagonal secundaria  es: " suma2
FinAlgoritmo
